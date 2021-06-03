package homework;

import java.sql.Connection;

/**
 * @author chenjie
 * @date 2021/6/1-21:25
 */
public class Test {
    public static void main(String[] args) {
        showLongTime(() -> {
            System.out.println(System.currentTimeMillis());
        });

        System.out.println(get(3, 2, (x, y) -> {
            return x * y;
        }));
    }
    public static void showLongTime(CurrentTimePrint c) {
            c.printCurrentTime();
    }

    public static int get(int a, int b,IntCalc c) {
      return  c.calt(a,b);
    }
}
