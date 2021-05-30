package homework;

import java.util.Arrays;
import java.util.Random;

/**
 * @author chenjie
 * @date 2021/5/29-9:30
 */
public class Demo4 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            int[] arr = {10, 5, 20, 50, 100};
            int length = arr.length; // 要抽奖的次数
            Random random = new Random();
            boolean[] b = new boolean[arr.length];

            @Override
            public void run() {
                while (length > 0) {

                    synchronized (random) {
                        if (length > 0) {

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            int index = random.nextInt(arr.length);
                            if (!b[index]) {
                                System.out.println(Thread.currentThread().getName() + arr[index] + "元");
                                b[index] = true;
                                System.out.println(Arrays.toString(arr));
                                System.out.println(Arrays.toString(b));

                                length--;
                            }

                        }
                    }
                }

            }
        };
        Thread t = new Thread(r, "A");
        Thread t0 = new Thread(r,"B");
        t.start();
        t0.start();


    }


}
/*class draw implements Runnable{
    int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300};
    int length = arr.length; //
    @Override
    public void run() {

    }
}*/
