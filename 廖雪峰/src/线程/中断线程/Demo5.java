package 线程.中断线程;

/**
 * @author chenjie
 * @date 2021/5/27-21:29
 */
public class Demo5 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            //        调不到 running 是因为 多态 调用成员变量的时候，调用的是 父类的成员变量
            public volatile  boolean running = true;
           /*
           * 不能写在内部类里面， 就算你用方法区设置这个 running的值，
           * 你的父类引用也不能调用这些方法区修改running
           * 设置 volatile 只能在原类中设置
           * */

          public void run() {
              while(running) {
                  System.out.println(111);
              }
          }
        };
        t.start();
//        匿名内部类 和 类的区别

        Thread t2 = new Thread(new Runnable() {
//            用 Runnable 同样不行， 用子类实现的都不行
            public volatile boolean isRun = true;
            @Override
            public void run() {

            }
        });



    }
}
