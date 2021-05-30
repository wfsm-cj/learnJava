package 多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chenjie
 * @date 2021/5/28-11:30
 */
public class Demo {
    /*
    *  java.util.concurrent
    * Executor
    *
    * Executors
    *
    * */
    public static void main(String[] args) {

/*
* 预先创建线程的一种技术。在任务还没到来之前，创建一定数量的线程，放入空闲队列中，
* 然后对这些资源进行复用，减少频繁的创建，和销毁对象
* */
        /*java.util.concurrent  并发concurrent
        * executor 执行者
        * Executor接口  顶级接口  ，执行器
        *       执行已提交的 Runnable 任务的对象
        * ExecutorService接口  线程池接口
        *       Executor 提供了管理终止的方法
        * Executors类
        *
        * */
        /*静态工厂方法
        * 创建一个单线程的线程池。这个线程池只有一个线程在工作，单线程串行执行所有任务
        *     就装一个线程，但是可以重复利用
        * */
//        public static ExecutorService newSingleThreadExecutor()
        ExecutorService es = Executors.newSingleThreadExecutor();

        es.execute(new MyRunnable());  // 在未来的某个时间执行这个命令
        es.execute(new MyRunnable());

//        void shutdown()
//        启动一次顺序关闭，执行以前提交的任务，但不接受新任务。如果已经关闭，则调用没有其他作用
        es.shutdown();

        /*
        * List<Runnable>  shutdownNow()
        *   试图停止所有正在执行的活动任务，暂停处理正在等待的任务，并返回等待执行的任务列表
        *---返回，从未开始执行的任务的列表
        * */

        /*
        * Executor 接口
        * ExecutorService接口 是 Executor的子接口
        * Executors类 为这些 Executor提供了便捷的工厂方法
        *
        * Executor 接口的 方法
        *   void execute(Runnable command)
        *       在未来某个时间执行给定的命令，该命令可能在新的线程，已入池的线程或者正在调用的线程中执行
        * ，这由 Executor 实现决定
        *       command - 可运行的任务
        * */

    }
}

class MyRunnable implements  Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run -- "+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
