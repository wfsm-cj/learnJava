package 多线程.线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author chenjie
 * @date 2021/5/28-16:20
 */
public class Demo_newFixedThreadPool {

    public static void main(String[] args) {
//       创建固定大小的线程池
        ExecutorService es  = Executors.newFixedThreadPool(2);

//        创建一个可缓存的线程池
//        可能会创建很多线程，用的少
        ExecutorService es1 = Executors.newCachedThreadPool();

//      调度线程
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);


        /*
        *
        * */


    }
}
