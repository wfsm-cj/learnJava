package NumberFormat;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author chenjie
 * @date 2021/5/18-20:49
 */
/*
* 工具类
* */
public class NumberDeal {
    /*
    * 移除数字前面和后面冗余的0，只保留3位小数
    * */
    public static String trim0(double num) {
//        系统默认只保留三位数
        NumberFormat nf = NumberFormat.getInstance();
        nf.setGroupingUsed(false);
        String result = nf.format(num);
        return result;
    }
    /*
    *  fractionDigit  要保留的小数位数
    * */
    public static String trim0(double num,int fractionDigit) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(fractionDigit);
        nf.setGroupingUsed(false);
        return nf.format(num);
    }

    public static String trim0(double num,int integerDigit,int fractionDigit) {
        StringBuilder rule = new StringBuilder();
        if(integerDigit > 0) {
            for (int i = 0; i < integerDigit; i++) {
                rule.append("0");
            }
        }else{
            rule.append("#");
        }
        if(fractionDigit > 0) {
            rule.append(".");
            for (int i = 0; i < fractionDigit; i++) {
                rule.append("0");
            }
        }
        DecimalFormat df = new DecimalFormat(rule.toString());
        return df.format(num);
    }

    /*
    * 保留几位小数， 不足 不补零， 小数部分冗余的 0 也不显示
    * */
    public static String fractionDigitFormat(double num,int fractionDigit) {
        StringBuilder rule = new StringBuilder("#");
        if(fractionDigit > 0) {
            rule.append(".");
            for (int i = 0; i < fractionDigit; i++) {
                rule.append("#");
            }
            /*
            * 拼接 0 和 # 的区别
            *   “0”  会让格式化数值自动补零 ，如果没有，则补充 0
            *   “#”  #不会，即使有 多个# ，但是数值位数不够 也不会补 0 。如果没有，则不显示
            * */
            System.out.println("rule = " + rule);
        }
        DecimalFormat df = new DecimalFormat(rule.toString());

        return df.format(num);
    }

    public static String fractionDigitFormat1(double num,int fractionDigit){
        NumberFormat nf = NumberFormat.getInstance();
        /*
        * setMaximumFractionDigits(int newValue) 这个 和 # 一样。数值不会自动补零
        * “0” 会自动补零
        * */
        nf.setMaximumFractionDigits(fractionDigit);
        nf.setGroupingUsed(false);
        return nf.format(num);
    }
    public static void main(String[] args) {
        double num = 1234.4;
        System.out.println(fractionDigitFormat(num, 3));
        System.out.println(fractionDigitFormat1(num, 3));

    }
}
