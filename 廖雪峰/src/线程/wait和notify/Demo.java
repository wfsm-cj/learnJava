package 线程.wait和notify;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenjie
 * @date 2021/5/28-17:24
 */
public class Demo {

    public static void main(String[] args) throws InterruptedException {

        TaskQueue q  = new TaskQueue(); //  一个对象，用多个线程去控制它
        List<Thread> ts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread("线程"+(i+1)){
                public void run() {

                    while(true) {
                        String s = q.getTask();
                        System.out.println(Thread.currentThread().getName()+" --- " + s);
                    }
                }

            };
            t.start();
            ts.add(t);
        }
        
        var add = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String s = "t --" + Math.random();
                System.out.println(s);

                q.addTask(s);

            }
        });
        add.start();
        add.join();
        
//        Thread.sleep(100);
//        for (Thread t : ts) {
//            t.interrupt();
//        }

    }
}
