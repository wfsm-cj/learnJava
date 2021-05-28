package homework;

/**
 * @author chenjie
 * @date 2021/5/27-19:33
 */
public class Load implements Runnable{
    private int number = 80;
    private Object obj = new Object();
    @Override
    public void run() {
        while(number > 0) {
            synchronized (obj){
                if(number > 0 ) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"上车"+ number-- +"个位置");

                }

            }

        }

    }

    public static void main(String[] args) {
        Load load = new Load();
        Thread t1 = new Thread(load,"前门");
        Thread t2 = new Thread(load,"中门");
        Thread t3 = new Thread(load,"后门");
        t1.start();
        t2.start();
        t3.start();
    }
}
