package 线程.中断线程;

/**
 * @author chenjie
 * @date 2021/5/27-20:14
 */
public class MyThread extends Thread{

    public void run() {
        int n = 0;
        /*
        * public boolean isInterrupted()
        *   测试这个线程是否被中断， 线程的中断状态不受此方法的影响
        * */
        while(!isInterrupted()) {
            n++;
            System.out.println("n = " + n);
        }
    }
}
