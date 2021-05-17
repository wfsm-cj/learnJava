package 时间;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author chenjie
 * @date 2021/5/17-20:46
 */
public class Demo_time {
    /*
     *  java 8 开始 提供了新的时间 API， 在 java.time 包
     *
     * 新的 API 修正了 旧 API不合理的常量设计
     *      Month范围 1~12 表示 1月 到12月
     *      week 范围 1~7  表示周一到周日
     *
     * 新 API 的类型几乎全部是不变类型（和 String 类似），可以放心使用不必担心被修改
     * */

    /*
     * LocalDateTime类,LocalDate类,LocalTime类
     *
     *  从默认时区的系统时钟获取当前的日期时间  LocalDateTime
     *  public static LocalDateTime now()
     *
     *  获取当前日期  LocalDate
     *   public static LocalDate now()
     *
     * 获取当前时间  LocalTime
     *  public static LocalTime now()
     *
     * 通过 of()  去设置 日期时间
     *  public static LocalDateTime of(int year, int month, int dayOfMointh,int hour,int mimute)
     *  public static LocalDateTime of(int year, int month, int dayOfMointh,int hour,int mimute,int second)
     *   ....
     *  LocalDate 和 LocalTime ，类似于 LocalDateTime
     * */
    public static void main(String[] args) {
        /*
         * public static LocalDateTime parse(CharSequence text)
         *   按照标准格式解析这个字符串，不符合格式会报错
         *   注意ISO 8601规定的日期和时间分隔符是T。标准格式如下：
         * 日期：yyyy-MM-dd
         *  时间：HH:mm:ss
         *  带毫秒的时间：HH:mm:ss.SSS
         * 日期和时间：yyyy-MM-dd'T'HH:mm:ss
         * 带毫秒的日期和时间：yyyy-MM-dd'T'HH:mm:ss.SSS
         *
         * 如果不想按照这个格式解析，可以使用新的 DateTimeFormatter类
         *  public static DateTimeFormatter ofPattern(String pattern)
         *      使用指定的模式创建格式化程序
         *
         * public String format(日期)
         *       把日期对象 变成 字符串，按照指定的格式
         *
         *
         *
         * */
        /*
        * public static LocalDateTime parse(CharSequence text,DateTimeFormatter formatter);
        * */


    }
}
