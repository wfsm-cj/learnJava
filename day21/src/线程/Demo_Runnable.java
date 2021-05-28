package 线程;

/**
 * @author chenjie
 * @date 2021/5/27-11:12
 */
public class Demo_Runnable implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("runnable--" + i);
        }
    }

    public static void main(String[] args) {
//        创建出一个 runnable 实现类对象
        Demo_Runnable my  = new Demo_Runnable();
        Thread t = new Thread(my);
        t.start();

//        用内部类 实现 Runnable
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });
        t1.start();
    }
}
