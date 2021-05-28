package 线程.网站;

/**
 * @author chenjie
 * @date 2021/5/27-16:48
 */
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        });
        System.out.println("start");
        t.start();
//        public final void join() 等待这个线程死亡
//        t.join(1);
        t.join();
//      public final void join(long millis)  等待这个线程死亡的时间最多为millis
        System.out.println("end");
    }
}
