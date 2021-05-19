package 时间.time时间;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @author chenjie
 * @date 2021/5/18-14:30
 */
public class Demo_常用方法 {
    public static void main(String[] args) {
        /*
        * 创建 LocalDate
        *      LocalDate.now()
        *       LocalDate.of(2021,5,18)
        * */
//        public static LocalDate now()  
//        从默认时区的系统时钟获取当前日期，此方法将阻止使用备用时钟进行测试，因为时钟是硬编码的
        LocalDate dt = LocalDate.now();
        System.out.println("dt = " + dt);

//        public static LocalDate of(int year,Month month,int dayOfMonth)
       dt = LocalDate.of(2015, Month.MAY,18);
        System.out.println("dt = " + dt);
//   public static LocalDate of(int year,int month,int dayOfMonth)
        dt = LocalDate.of(2021,5,18);


//        public int getYear()
        System.out.println(dt.getYear());
//        public int get(TemporalField field)
        /* temporal 暂时的，当时的，现世的
        * TemporalField  接口
        * interface  TemporalField
        *      日期时间的字段，如月份或小时
        * ChronoField 是 TemporalField 的实现类  chrono 编年史，记事
        *   是个枚举类  DAY_OF_WEEK, DAY_OF_MONTH,YEAR..等
        * */
        System.out.println(dt.get(ChronoField.YEAR));

//      public Month getMonth()
//        使用Month枚举获取的月份
        System.out.println(dt.getMonth());

//        public int getMonthValue()
        System.out.println(dt.getMonthValue());

        System.out.println(dt.get(ChronoField.MONTH_OF_YEAR));

//        日
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));

//        星期
        System.out.println(dt.getDayOfWeek());
        System.out.println(dt.get(ChronoField.DAY_OF_WEEK));

        LocalTime time = LocalTime.of(2,1,45);

//        public static LocalDateTime of(LocalDate date,LocalTime time)
        LocalDateTime dateTime = LocalDateTime.of(dt,time);
        dateTime = LocalDateTime.now();

//        public LocalDateTime atTime(int hour,int minute, int second)
        dateTime = dt.atTime(23,4,55);
        System.out.println("dateTime = " + dateTime);
        dateTime = LocalDateTime.of(2019,1,2,2,2,1);
//      public LocalDateTime atDate(LocalDate date)
        dateTime = time.atDate(dt);
        System.out.println("dateTime = " + dateTime);

//        LocalDate
        System.out.println(dateTime.toLocalDate());
//
        System.out.println(dateTime.toLocalTime());

//        public static ZoneId systemDefault()

//        public String format(DateTimeFormatter formatter)


    }
}
