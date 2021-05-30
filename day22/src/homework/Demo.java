package homework;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chenjie
 * @date 2021/5/28-20:18
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300};
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        Random random = new Random();
        Lock lock = new ReentrantLock();
        ExecutorService es = Executors.newFixedThreadPool(2);
        Runnable r = new Runnable() {
            @Override
            public void run() {

                while (!list.isEmpty()) {
                    lock.lock();


                    try {
                        if (!list.isEmpty()) {
                            Thread.sleep(20);
                            int index = random.nextInt(list.size());
                            System.out.println(list.remove(index) + Thread.currentThread().getName());
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }


            }
        };


        es.execute(r);
        es.execute(r);
        es.shutdown();
    }
}
