package 同步.Lock锁;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chenjie
 * @date 2021/5/27-16:54
 */
public class SaleTickets implements Runnable{
    int tickets = 50;
//    Lock 的 实现类 ReentrantLock
    ReentrantLock rl = new ReentrantLock();
//    不会强制要求你的 锁在一个代码块中 操作
//    可以随意指定 lock 的位置，但是必须要在 finally 中 关闭锁
    @Override
    public void run() {


        while(tickets > 0) {
            try {
                rl.lock(); // 加锁

                if(tickets > 0) {  // 判断 tickets while判断的外面可能还带有两个没进来的线程。。必须判断；
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在销售" + tickets-- + "张");
                }
            }finally{
                rl.unlock(); // 保证释放锁
            }


                }



    }

    public static void main(String[] args) {
        SaleTickets st = new SaleTickets();
//        多个线程操作 同一个对象  让这个对象实现 Runnable 接口，好像只有这么个方法
        Thread t0 = new Thread(st,"美团");
        Thread t1 = new Thread(st,"猫眼");
        Thread t2 = new Thread(st,"影院");
        t0.start();
        t1.start();
        t2.start();

/*
* 线程随时都有可能被其他线程抢走资源
*       休眠200 millis 失去 cpu 的资源，但是票还没卖出去，还没有减成功（输出了tickets 但是没有减成功）
* 所以有时候会出现 重复的票（休眠了，失去资源，但是票没卖出去）
*
*   休眠结束后，抢到了cpu资源，，代码继续运行，，执行了销售票的动作
* 当tickets ==  1 的时候， 其中有一个线程醒过来了，然后继续卖票  tickes -- ，就变成 0了，
* 然后又有一个线程醒过来了。又减了一次 变为 -1
*
* */

        /*
        * 线程安全问题的原因：
        *   当我的某一个线程在执行的过程中，没有执行完毕（没有保证代码的完整性），，资源就被其他线程抢走了，
        * 等资源重新回到某线程时，数据可能已经发生变化了，导致线程数据的使用不安全
        *
        * 解决方案：
        *   保证线程执行的完整性，才可以保证多线程数据的安全问题
        * */


        /*
        * 同步代码块   任意的一个引用类型对象，锁对象，必须要保证这个对象唯一
        *  synchronized(锁对象) {
        *           需要保证完整性，原子性的一段代码(需要同步的代码)
        * }
        *
        * */

        /*
        * 总结;
        *   1,进入同步代码块之前判断锁，
        *   2，获取锁
        *   3，同步代码块执行完毕，释放锁，
        * 保证代码完整性原因: 没有锁对象，不能进入同步，只能在同步外等待
        *
        * */

    }
}
