package 线程.中断线程;

/**
 * @author chenjie
 * @date 2021/5/27-20:13
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        Thread.sleep(1);
        t.interrupt();//  interrupt() 方法仅仅向 t 线程发出了"中断请求"，至于 t 线程是否能立刻响应，要看具体代码
        /*
        * public static boolean interrupted()
        *       测试当前线程是否中断，该方法可以清除线程的中断状态。换句话说，如果这个方法被连续调用两次，那么第二个调用将返回false
        *       如果当前线程已被中断返回 true ， 否则返回 false
        * */
        t.join(); //强制性的 让 t 先执行完
        System.out.println("end");

        /*
        * join() 和 sleep() 都会抛出 InterruptedException
        *       只要捕获到 join() 方法抛出的 InterruptedException，说明有其他线程对其调用了 interrupt() 方法，给出了中断提示，
        * 提示你应该中断你的程序，通常情况下该线程应该立刻结束运行
        * */
    }

}
