package 线程.常用方法;

/**
 * @author chenjie
 * @date 2021/5/27-14:41
 */
public class Demo_Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    /*
                    * setName(String name)  给线程设置名字
                    * getName()  获取到线程的名称
                    * */
                    System.out.println(super.getName() + "--" + i);
                }
            }
        };

        t.setName("线程A");

        t.start();

// 构造方法设置名字
         new Thread("线程B") {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    /*
                     * setName(String name)  给线程设置名字
                     * getName()  获取到线程的名称
                     * */
                    System.out.println(super.getName() + "--" + i);
                }
            }
        }.start();



        Runnable run = new Runnable() {

             @Override
             public void run() {
                 for (int i = 0; i < 10 ; i++) {
//                     System.out.println("runnable ----" + i);
//                     static Thread  currentThread()  返回当前正在运行的线程对象本身
                     System.out.println(Thread.currentThread().getName() + i);
                     /*
                     * public static Thread currentThread()
                     *      返回当前正在执行的线程
                     * */
                     try {
 //                     异常要小于等于父类   父类 Runnable 没有异常  只能处理

                         Thread.sleep(100);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             }
         };

       Thread t3 =  new Thread(run,"线程C");
       t3.start();
        System.out.println(t3.getName()+"~~~~~~~~~~~~~~~~~");

        /*
        * public static void sleep(long millis)
        *       throws InterruptedException
        *   判断 账单是否存在，需要等待 核心系统 出账单，但是 核心系统 的账单没有出来
        * 然后，休眠一段时间，然后再去获取这个账单文件
        * */
        Thread.sleep(1000);
        /*
        * Thread.setPriority(int n)
        * */
        System.out.println(Thread.currentThread().getName());


        t3.setPriority(Thread.MAX_PRIORITY);

//        同级别的，会让，不同级别不会
        Thread.yield();


//        void interrupt()  中断这个线程休眠，等待状态
//        Thread.sleep(10000);

        Thread t4 =new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
//                e.printStackTrace();
//                t4.interrupt() 会打断休眠报错 InterruptedException
            }
            System.out.println(123);
        });
        t4.start();
        t4.interrupt();
        System.out.println("sleep interrupt");

        /*
        *  setDaemon(true)  设置为true 表示设置为守护线程
        *   Deamon 后台程序  。。跟着非守护线程一起消失
        *
        * */

        Thread t5 = new Thread(() -> {
            for (int i = 0; ; i++) {
                System.out.println(i);
            }
        });
//        先设置后 start()  不然都执行了怎么设置
        t5.setDaemon(true);

        t5.start();
    }
}
