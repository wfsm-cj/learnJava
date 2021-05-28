package 线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author chenjie
 * @date 2021/5/27-14:05
 */
public class Demo_Callable implements Callable<Integer>{
    /*
    * Callable
    *   这个接口需要返回值的线程
    *FutureTask
    * Runnable  有特殊实现类 FutureTask
    * FutureTask(Callable<V> callable)
    * Callable 是个接口 只有一个 V call() 方法 有返回值
    *
    *
    * 结论;
    *   开启线程的时候
    *
    * 如果想获取到 call()的结果
    *   FutureTask 中 get() 专门为了获取 call 方法返回值结果
    * */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Demo_Callable my = new Demo_Callable();
        FutureTask<Integer> ft = new FutureTask<>(my);
        Thread t = new Thread(ft);
        t.start();

        /*
        * 线程被打断了，抛出线程打断异常
        * */
        for (int i = 0; i < 10; i++) {
            System.out.println("main --"+i);
        }

        // 获取 Callable 中 call() 的返回值    --- 获取返回值阻塞了 main 线程
        System.out.println(ft.get()+"~~~~~~~~~");

    }


    @Override
    public Integer call() throws Exception {
        int i;
        for (i = 0; i < 10000; i++) {
            Thread.sleep(1000);
            System.out.println("callable--" + i);
        }
        return i;
    }
}
