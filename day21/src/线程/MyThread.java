package 线程;

/**
 * @author chenjie
 * @date 2021/5/27-10:29
 */

public class MyThread extends Thread{
    /*
    * 1，创建一个类，继承Thread线程父类，那么子类也是一个线程
    * */
    /*
    * 2,重写 run 方法
    * */

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread "+i);
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
//        main方法本身就是一条线程，名字叫做 main

//
        MyThread my = new MyThread();
//        开启线程的通道
        my.start();

//        匿名内部类
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("匿名----"+i);
                }
            }
        }.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }


}
