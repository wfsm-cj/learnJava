package 线程.ReebtrantLock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chenjie
 * @date 2021/5/28-19:35
 */
public class Demo {
    /*
    * ReentrantLock  是可重入锁，他和 synchronized一样，一个线程可以多次获取同一个锁
    * 和 synchronized 不同的是， ReentrantLock 可以尝试获取锁
    * */
    /*
    * 总结：
    *   ReentrantLock 可以替代 synchronized 进行同步
    *   ReentrantLock 获取锁更安全
    *   必须先获取到锁，再进入 try {...} 代码块，最后使用 finally 保证释放锁
    *   可以使用 tryLock() 尝试获取锁
    * */
    public static void main(String[] args) {
        Person p = new Person();
        Thread t = new Thread(){
          public void run() {
              p.set();
          }
        };

        Thread t1 = new Thread(() ->{
            p.get();
        });
        t.start();

        t1.start();

    }
}

class Person {
    Queue<String> q  = new LinkedList<>();
    private final Lock lock = new ReentrantLock();
    public   void get() {
        try {
            if(lock.tryLock(2, TimeUnit.SECONDS)) {
                lock.lock();

                try {

                    while(q.isEmpty()) {

                    }
                    System.out.println(q.poll());
                }
                finally{
                    lock.unlock();
                }
            }else {
                System.out.println("超时还没有取得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public   void set(){
        lock.lock();
        try {
            while(true) {
                Thread.sleep(5000);
                break;
            }
            System.out.println("Set-- s");
            q.offer("s"+Math.random());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally{
            lock.unlock();
        }

    }



}
