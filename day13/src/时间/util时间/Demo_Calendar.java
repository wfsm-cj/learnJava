package 时间.util时间;

import java.util.Calendar;
import java.util.Date;

/**
 * @author chenjie
 * @date 2021/5/17-15:24
 */
public class Demo_Calendar {
    /* java.util 包
    * 抽象类
    * Calendar  单独获取 年 月 日 时 分 秒
    *  getInstance()
    * */
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        /* Calender getInstance() 返回他的子类对象 GregorianCalendar
        *   YEAR
        *   MONTH           0-11 月
        *   DAY_OF_MONTH   一月中的第几天
        *   DAY_OF_WEEK   星期几  周日为第一天
        *   HOUR_OF_DAY
        *   MINUtE
        *   SECOND
        *
        * get(int filed)
        * */

        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);
        int month2 = calendar.get(1);
        System.out.println(month2);

//        set(int field, int value)
        calendar.set(Calendar.YEAR,2020);
        System.out.println(calendar.get(Calendar.YEAR));
//        设置年月日
//        set(int year,int month,int day)
        calendar.set(2020,5,15);
        System.out.println(calendar.get(Calendar.MONTH));
//
//        修改 年 月 日 时分秒
//        set(..........)

//        add(int field, int mount)   为指定的字段值设置偏移量,为你的field 添加 mount
        calendar.add(Calendar.MONTH,5);  // 添加
        System.out.println(calendar.get(Calendar.MONTH));


//        getTime()
//
       calendar.getTime();
       /*  Date 和 Calendar 相互转换
       *  setTime(Date time)
       *    getTIme()
       * setTimeInMillis()
       * */

        System.out.println(calendar.get(Calendar.MONTH));

        /*
        * Calendar.getInstance()
        * */

        Date date = new Date();
        System.out.println(date.getYear());


    }
}
