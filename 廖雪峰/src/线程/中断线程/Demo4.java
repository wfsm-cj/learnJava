package 线程.中断线程;

/**
 * @author chenjie
 * @date 2021/5/27-21:18
 */
public class Demo4 {
    public static void main(String[] args) throws InterruptedException {



//      t.start();
        HelloThread h = new HelloThread();
           h.start();
           Thread.sleep(1);
           h.running = false;

    }
}
