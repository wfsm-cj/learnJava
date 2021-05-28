package 线程.中断线程;

/**
 * @author chenjie
 * @date 2021/5/27-20:53
 */
public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t2 = new Thread("23"){
            public void run() {
                int n = 0;
                while(!isInterrupted()) {
                    System.out.println(n++);
                }
            }
        };
        t2.start();
        Thread.sleep(100);
        t2.interrupt();
        t2.join();

        System.out.println("end");
    }
}
