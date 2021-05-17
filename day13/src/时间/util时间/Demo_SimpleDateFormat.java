package 时间.util时间;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chenjie
 * @date 2021/5/17-14:25
 */
public class Demo_SimpleDateFormat {
    /*      java.text 包
    * 日期格式化
    * 构造方法
    *   new SimpleDateFormat()  用默认格式 21-5-17 下午2:31  构造
    *   new SimpleDateFormat(String s)   按照这个模式pattern 去 解析 字符串或者Date
    *       s 表示 目标需要的日期格式
    *
    * SimpleDateFormat 以语言环境有关的方式来格式化和解析日期的具体类。
    * 它允许进行格式化（日期 -> 文本），解析（文本 -> 日期），和规范化
    * 
    * */

    /*
    * final String format(Date d)   将一个Date对象 转换成需要的字符串格式
    * */

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println("simpleDateFormat = " + simpleDateFormat);
        String s = simpleDateFormat.format(new Date());
        System.out.println(s); //21-5-17 下午2:31

        /*
        * 大写的 M  月份
        *   m  分钟数
        *  大写的 H 
        *  yyyy-MM-dd HH:mm:ss
        * */
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat1.format(new Date()));

        /*
        * 将日期  ->  字符串
        *   format(Date date)
        *
        * 字符串  ->  日期
        * Date parse(String source)
        * */

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        处理一个异常  可能传入的不是日期字符的字符串
        System.out.println(sdf.parse("1995-10-02"));

        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date birthday = sdf.parse("1995-10-02 12:20:30");
        System.out.println(birthday);
        sdf = new SimpleDateFormat("yyyy-M-dd");
        System.out.println(sdf.format(birthday));

        /*
        * practice  计算自己在地球多少天了
        * */
//        pattern 里面不能带有多余的空格
        sdf = new SimpleDateFormat("yyyy-MM-dd");
         birthday = sdf.parse("1995-10-02 ");
         Date today = sdf.parse("2021-5-17");
         long birthdayMillisecond = birthday.getTime();
         long todayMillisecond = today.getTime();
         long gap = todayMillisecond - birthdayMillisecond;
        System.out.println(gap/1000/60/60/24);

    }

}
