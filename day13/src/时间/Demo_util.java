package 时间;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author chenjie
 * @date 2021/5/17-19:43
 */
public class Demo_util {
    /*
     * java.util 包中的 DATE
     * 构造方法
     *   new Date()   获取当前时间
     *   new Date(long time)   从1970年1月1日 经过了 time毫秒后表示的时间
     * 常用方法
     * getTime()  获取 date时间 所对应的毫秒值，返回 long型。。可以用来计算时间间隔
     * setTime(long time)    设置date对象以给定的毫秒值
     * */
    public static void main(String[] args) throws ParseException {
     /*
     * java.util 包中的 Calender  抽象类
     *      单独获取 年，月，日，时，分，秒
     *
     *  Calendar.getInstance()  返回它的子类对象 GrerorianCalendar
     *
     *  public  int get(int field)
     *                      field 该类的静态字段
     *                      public static final int YEAR
     *                      public static final int MONTH
     *      field字段：
     *          YEAR
     *          MONTH
     *          DAY_OF_MONTH
     *          DAY_OF_WEEK
     *          HOUR_OF_DAY
     *          MINUTE
     *          SECOND
     *
     *
     * */
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        /*设置某一个字段
        * public void set(int field, int value)
        *
        * 直接设置年月日
        * public final void set(int year, int month, int date)
        * */
        calendar.set(Calendar.YEAR,2030);
        System.out.println(calendar.get(Calendar.YEAR));

        /*
        * public abstract void add(int field, int amount)
        *       field - 日历字段
        *       amount  - 数量，要添加到该字段的日期或时间的数量
        * */
        calendar.add(Calendar.YEAR,10);
        System.out.println(calendar.get(Calendar.YEAR));

        /*
        * Date 和 Calendar 相互转换
        *      public final void setTime(Date date)
        *           使用给定的 Date 设置 Calendar 的时间
        *
        *      Public final Date getTime()
        *           返回一个表示此 Calendar 的 Date对象
        *
        *   public void setTimeInMillis(long millis)
        *           从给定的长值设置此 Calendar 的当前时间
        * */

        calendar.setTime(new Date());
        System.out.println(calendar.get(Calendar.YEAR));
        
        Date date = calendar.getTime();
        System.out.println("date = " + date);

        calendar.setTimeInMillis(5000);
        System.out.println(calendar.getTime());

        /*java.text 包
        * SimpleDateFormat
        *   日期格式化，用来格式化和解析日期的具体类。
        *   格式化(日期 -> 文本) 解析(文本 -> 日期)
        *   一种格式化和解析日期的规范
        *
        *构造方法
        *   new SimpleDateFormat()  用默认格式构造
        *   new SimpleDateFormat(String s)  ,按照 s 这个模式pattern去解析或格式化
        * */

        /*日期和字符串相互转换
        * public StringBuffer format(Date date)  格式化日期，让其按照规定变成字符串
        *
        * public Date parse(String text, ParsePosition pos) ,将字符串转为日期，按照某个规定
        * */

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(new Date()));
        System.out.println(sdf.parse("1995-10-02"));
    }
}
