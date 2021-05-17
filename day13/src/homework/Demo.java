package homework;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author chenjie
 * @date 2021/5/17-21:13
 */
public class Demo {
    public static void leapYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
//        月份是 0 -11 操，？？？？
//        calendar.set(Calendar.MONTH,1);
//        calendar.set(Calendar.DAY_OF_MONTH,29);
        calendar.set(calendar.get(Calendar.YEAR),1,29);
        if(calendar.get(Calendar.MONTH) == 2) {
            System.out.println(calendar.get(Calendar.YEAR)+"是平年");

        }else {
            System.out.println(calendar.get(Calendar.YEAR)+"是闰年");

        }
    }

    public static void show(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("(yyyy-MM-dd)");
        Date date = sdf.parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
//        calendar.set();
        calendar.get(Calendar.DAY_OF_WEEK);
        calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),0,0,0);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(calendar.get(Calendar.YEAR),0,1,0,0,0);
        Date date1 = calendar1.getTime();
        long now = date.getTime();
        System.out.println(new Date(now));
        long before = date1.getTime();
        System.out.println(new Date(before));
        BigDecimal bigNow = new BigDecimal(String.valueOf(now));
        BigDecimal bigBefore = new BigDecimal(String.valueOf(before));
        BigDecimal gap = bigNow.subtract(bigBefore);
        BigDecimal divisor = new BigDecimal(String.valueOf(1000*60*60*24));
        BigDecimal day = gap.divide(divisor,4, RoundingMode.HALF_UP);
        System.out.println(day);

        int weekNum = calendar.get(Calendar.DAY_OF_WEEK);
        String weekStr;
        switch(weekNum){
            case 1 :
                weekStr = "weekday";
                break;
            case 2 :
                weekStr = "monday";
                break;
            default:
                weekStr = "friday";

        }

        System.out.println(str+ "是"+weekStr+calendar.get(Calendar.YEAR)+"的第"+day+"天");
    }


    public static void refer(String startTime, String endTime) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse(startTime);
        Date endDate = sdf.parse(endTime);
        Date currentDate = new Date();
      Calendar startCalendar = Calendar.getInstance();
      startCalendar.setTime(startDate);

        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(endDate);
        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.setTime(currentDate);

        int start = startCalendar.get(Calendar.DAY_OF_YEAR);
        int end = endCalendar.get(Calendar.DAY_OF_YEAR);
        int current = currentCalendar.get(Calendar.DAY_OF_YEAR);

        if(end - start > 0 && current - end < 90) {
            System.out.println("可以通过");
        }else{
            System.err.println("hehe");
        }





    }


    public static void main(String[] args) throws ParseException {
        Demo.leapYear(new Date());
       Demo.show("(2021-1-31)");
       Demo.refer("2021-5-21","2021-5-18");
    }
}
