package 线程.网站;

/**
 * @author chenjie
 * @date 2021/5/27-15:34
 */
public class Demo {
    /*
    * New
    * Runnable
    * Blocked
    * Waiting
    * Time Waiting
    * Terminated
    * */

    /*
    * public final void join(long millis)
    *   等待这个线程死亡的时间最多为 millis 毫秒  ，，0 的超时意味着永远等待
    * */
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}
