package 同步;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chenjie
 * @date 2021/5/28-14:25
 */
public class Demo_线程池 {
    /*
    * Executors  创建几个线程的线程池
    * Executors.newFixedThreadPool(int nThread)
    * */
    public static void main(String[] args) {
//        创建一个线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
//        准备线程子任务
       Runnable run1 = new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }
            }
        };

        es.submit(run1);
        es.submit(run1);
//        当线程任务执行完毕时，发现代码没有停止，因为线程池会持续的
//        一直等待给的新的
        /*
        * submit(Runnable r)
        * shutdown();      只要提交的都会继续运行
        * shutDownNow()  如果有还没有运行的，不管你是提交的还是怎么，除了正在运行的，其他都关闭
        *
        * */


    }

}
