package 线程.中断线程;

/**
 * @author chenjie
 * @date 2021/5/27-20:48
 */
public class HelloThread extends Thread{
    public volatile boolean running = true;
    public void run() {
        while(running) {
            System.out.println("!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        HelloThread ht = new HelloThread();
        ht.start();
        Thread.sleep(20);
        ht.running = false;
    }
}
