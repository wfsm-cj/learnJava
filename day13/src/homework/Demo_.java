package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author chenjie
 * @date 2021/5/18-9:20
 */
public class Demo_ {
/*
* 1. 键盘录入一个年份，判断出该年份是否是闰年(闰年2月29天,平年2月28天)？使用Calendar类实现*/
    public void answer1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH,1);
        calendar.set(Calendar.DAY_OF_MONTH,29);
//        calendar.set(Calendar.YEAR,1952);
        if(calendar.get(Calendar.MONTH) == 2) {
            System.out.println(calendar.get(Calendar.YEAR));
            System.out.println("nonleap year");
        }else {
            System.out.println("leap year");
        }
    }

    /*2. 分析以下需求，并用代码实现：
(1)通过键盘录入日期字符串，格式(2015-10-20)
(2)输出该日期是星期几及这一年的第几天
(3)如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是2015年的第293 天"
*/
    public void answer2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("(yyyy-MM-dd)");
        String str = "(2021-1-2)";
        Date date = sdf.parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
    }
    public static void main(String[] args) throws ParseException {
       String startTime = "2021-5-12";
       String endTime = "2021-5-18";
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       Date start = sdf.parse(startTime);
       Date end = sdf.parse(endTime);
//       比毫秒值
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.add(Calendar.MONTH,3);
        System.out.println(endCalendar.get(Calendar.MONTH));

//        LocalDate startTime = LocalDate.of(2021,5,12);
//        LocalDate endTime = LocalDate.of(2021,5,18);
//
//        if(startTime.isAfter(endTime)) {
//            System.out.println("refuse");
//        }
        /*
        * 相差三个月
        *   验证92天  三个月最大就92天
        * 或者
        *   开始时间的月份+3  。。然后将 加上后的月份的毫秒值 去比较
        * */

    }
}
