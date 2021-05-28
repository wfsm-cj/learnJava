package 线程.中断线程;

/**
 * @author chenjie
 * @date 2021/5/27-20:49
 */
public class AThread extends Thread{
    public void run() {
        Thread hello = new Thread();
        hello.start();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        Thread t2 = new Thread("23"){
            public void run(){
                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {

                    }
                },"123");
                t.start();

            }
        };


    }
}
