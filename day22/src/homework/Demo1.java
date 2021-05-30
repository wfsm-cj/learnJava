package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author chenjie
 * @date 2021/5/29-9:02
 */
public class Demo1 implements Runnable{
   /* static List<Integer> list = new ArrayList<>();

    static{
        int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300};
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

    }*/
    List<Integer> list = new ArrayList<>();

    public Demo1() {
        int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300};
        /*
        * 设置一个等长的 布尔数组，抽过了设置为false
        * */
//        int[] arr = {10,5,20,50};
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }


    @Override
    public void run() {
        Random random = new Random();
        while(!list.isEmpty()) {
            synchronized (this){
                if(!list.isEmpty()) {

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int index = random.nextInt(list.size());
                System.out.println(list.remove(index)+Thread.currentThread().getName());
                }

            }

        }
    }

    public static void main(String[] args) {
        Runnable r  = new Demo1();
        Thread t = new Thread(r,"线程1");
        Thread t1 = new Thread(r,"线程2");
        t.start();
        t1.start();
    }
}
