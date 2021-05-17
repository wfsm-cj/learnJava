package 时间.time时间;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author chenjie
 * @date 2021/5/17-17:19
 */
public class Demo {
    /*
    * java 8 开始 提供了新的时间 API ,在 java.time包
    *
    * 新 API 修正了 旧 API不合理的常量设计
    *   Month 范围 1~12  表示1月到12月
    *   Week  范围 1~7    表示周一到周日
    *
    * 新 API 的类型几乎全部是不变类型 （和 String 类似） ，可以放心使用不必担心被修改
    * */
    public static void main(String[] args) {
        /*
         * LocalDateTime
         * */
        LocalDateTime dt = LocalDateTime.now();
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        System.out.println("dt = " + dt);
        System.out.println("d = " + d);
        System.out.println("t = " + t);

//        public static LocalDateTime of(int year, int month, int dayOfMointh,int hour,int mimute)
//        public static LocalDateTime of(int year, int month, int dayOfMointh,int hour,int mimute, int second)

        LocalDate d2 = LocalDate.of(2019,11,30);
        LocalTime t2 = LocalTime.of(15,16,17);
        LocalDateTime dt2 = LocalDateTime.of(2021,5,17,18,51,20);
        LocalDateTime dt3 = LocalDateTime.of(d2,t2);
        System.out.println("dt2 = " + dt2);
        System.out.println("dt3 = " + dt3);

//  被解析的字符串里面不能有空格 否则报错 DateTimeParseException
        dt = LocalDateTime.parse("1995-10-02T10:20:20");
        System.out.println("dt = " + dt);
        /*
        *
        *注意ISO 8601规定的日期和时间分隔符是T。标准格式如下：

日期：yyyy-MM-dd
时间：HH:mm:ss
带毫秒的时间：HH:mm:ss.SSS
日期和时间：yyyy-MM-dd'T'HH:mm:ss
带毫秒的日期和时间：yyyy-MM-dd'T'HH:mm:ss.SSS
        *
        * */

        /*
        * 如果把一个 非 ISO 8601格式字符 解析成 LocalDateTime，可以使用新的 DateTimeFormatter
        * */
//        将 日期  以pattern 模式 输出为 String
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));

//   字符串 中 MM 必须要对象 两个数字的月份 不然会报错
        LocalDateTime dt1 = LocalDateTime.parse("2021-02-17 10:21:11",dtf);
        System.out.println(dt1);

/*
*  增加或减少
* */
        dt = LocalDateTime.now();
        System.out.println(dt.plusDays(20).minusHours(3).minusMonths(1));


        /*
        * withXxx()
        *  对时间进行调整
        * */
        dt = LocalDateTime.now();
        System.out.println(dt.withDayOfMonth(31));
        System.out.println(dt.withMonth(9));

//        LocalDateTime.now().withDayOfMonth(1)

        System.out.println("dt1 = " + dt1);
        System.out.println("dt2 = " + dt2);
        /*
        *  isBefore()  isAfter()  比较两个日期，的前后顺序
        * */
        System.out.println(dt1.isBefore(dt2));

        /*
        * Duration    表示两个时刻之间的时间间隔
        * Period        两个日期之间的天数
        * */
        Duration duration = Duration.between(dt1,dt2);
        System.out.println("duration = " + duration);

        Period p = LocalDate.now().until(LocalDate.of(2022,1,9));
        System.out.println("p = " + p);

        /*
        * 利用 ofXxx()   或者 parse() 也可以直接创建 Duration
        * */
        Duration d1 = Duration.ofHours(10);
        Duration d3 = Duration.parse("P1DT2H3M");// P 日期间隔 T 时间间隔     PT 表示仅有时间间隔

        System.out.println("d3 = " + d3);
        System.out.println("d1 = " + d1);




    }

}
