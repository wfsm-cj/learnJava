package homework;

import java.time.LocalDateTime;

/**
 * @author chenjie
 * @date 2021/5/17-22:53
 */
public class Demo_time {
    public static void leap() {
       LocalDateTime dt =  LocalDateTime.now();
       int year = dt.getYear();
       dt.withYear(2004);
        dt.withMonth(2);
        
        dt.withDayOfMonth(29);
        if(dt.getMonthValue() == 3) {
            System.out.println("leap year");
        }else {
            System.out.println(dt.getYear());
            System.out.println(dt.getMonth());

            System.out.println("ping nian");
        }

    }

    public static void main(String[] args) {
        leap();
    }
}
