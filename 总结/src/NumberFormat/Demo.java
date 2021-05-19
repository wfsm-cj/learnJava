package NumberFormat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author chenjie
 * @date 2021/5/18-20:03
 */
public class Demo {
    /*
    * 工作中，可能经常会遇到 比如数据保留两位小数显示，去除后面多余的 0
    * 按照指定格式输出
    *
    * NumberFormat  抽象类
    *   public abstract class NumberFormat
    * 是所有数值格式的抽象基类，此类提供格式化和解析数值的接口
    *
    * 格式化 或者  解析  数值的
    * */


//    public static NumberFormat getInstance()
//    返回当前默认的 FORMAT 区域设置的通用数字格式
//    这个跟调用 getNumberInstance()相同
//    用于通用数字格式化的 NumberFormat 实例

// maximum 极大，最大限度，最大量  fraction 分数  digits 数字
//    public void setMaximumFractionDigits(int newValue)
//    设置数字小数部分允许的最大位数

//    public void setMinimumIntegerDigits(int newValue)

    public static void main(String[] args) {
        double d =12345.4445655550000;
        NumberFormat nf = NumberFormat.getInstance();
//        系统自带的格式化 只保留小数点后三位
        System.out.println(nf.format(d));

        nf.setMinimumIntegerDigits(9);
        System.out.println(nf.format(d));

        nf.setMaximumIntegerDigits(2);
        System.out.println(nf.format(d));

        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(d));

        nf.setMinimumFractionDigits(3);
        System.out.println(nf.format(d));

        System.out.println("d = " + d);

        /*DecimalFormat  是 NumberFormat 的实现类
        *   “0”  --表示一位数值，如没有，显示 0。 如 "0000.0000"
        * 整数位或 小数位 >4  ,如果位数不够，补零，凑足4位
        *   "#" -- 表示任意位数的整数，如没有，则不显示，
        * 在小数点后使用，只表示一位小数，超出部分四舍五入
        *   "#" -- 无小数，小数部分四舍五入
        *   ".#" -- 整数部分不变，一位小数，四舍五入
        *   ".##" -- 整数部分不变，二位小数，四舍五入
        *
        *   “.”  -- 表示小数点
        *   “.”  -- 与模式 “0” 一起使用，表示逗号，只能用在小数点左边
        * */
        nf = new DecimalFormat("0000.0000");
        System.out.println(nf.format(d));
        nf = new DecimalFormat("#");
        System.out.println(nf.format(d));

        nf = new DecimalFormat(".##");
        System.out.println(nf.format(d));

        nf = new DecimalFormat("0000,00.000");
        System.out.println(nf.format(d));

/*
* 货币格式化
* */

//        public static final NumberFormat getCurrencyInstance()
//        返回当前默认值 FORMAT 区域设置的货币格式

//        public static NumberFormat getCurrencyInstance(Locale inLocale)
        nf = NumberFormat.getCurrencyInstance(Locale.CANADA);
        System.out.println(nf.format(d));


//       public static final NumberFormatter getPercentInstance()
//            返回当前默认值 FORMAT 区域 设置的百分比格式
        nf = NumberFormat.getPercentInstance();

//        public void setGroupingUsed(boolean newValue)
//        设置是否以此格式使用分组  ，， 是否要使用"," 分组
        nf.setGroupingUsed(false);
        System.out.println(nf.format(d));

// public static NumberFormat getPercentInstance(Locale inLocale)
    }
}
