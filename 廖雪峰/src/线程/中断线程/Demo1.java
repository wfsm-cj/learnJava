package 线程.中断线程;

/**
 * @author chenjie
 * @date 2021/5/27-20:40
 */
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
//        正在 join() 的线程 ，收到了 interrupt() 打断提示，会抛出 InterruptedException
        Thread t1 = new Thread("线程A"){
            public void run(){
                Thread t2 = new Thread(new Runnable() {
                    public void run() {
                    int n = 0;
                    while(!isInterrupted()) {
                        System.out.println(n + " hello");
                        n++;

                      }
                    }
                },"线程B");
                t2.start();

                try {
                    t2.join(); // 必须抛出异常，Thread类为父类， 这个匿名内部类去实现这个父类，相当于子类，子类异常不能比父类多
                } catch (InterruptedException e) {
                    System.out.println("t1 抛出打断");
                    e.printStackTrace();
                }
                t2.interrupt(); // 打断 t2  抛出异常
            }


        };
        t1.start();

        Thread.sleep(1000);
        t1.interrupt();  // 中断 t1

        t1.join();

        System.out.println("end");

    }

}
