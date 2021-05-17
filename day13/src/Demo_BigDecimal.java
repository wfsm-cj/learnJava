import java.math.BigDecimal;

/**
 * @author chenjie
 * @date 2021/5/17-11:24
 */
public class Demo_BigDecimal {
    /*
    * 浮点型 精度损失问题
    *   BigDecimal  可以表示一个任意大小且精度完全准确的浮点数
    * 构造
    *   new BigDecimal(double d)
    *   new BigDecimal(String s)  常用，  double会被底层解析为一长串的数字，可能不是我们想要的数据
    * 常用方法
    *   scale() 表示小数位数   scale 规模，刻度，数值范围
    *   stripTrailingZeros() 去零  strip 脱去衣服，剥掉 trailing 蔓生的，后面的，拖尾的，牵引的
    *   add()
    *   substract()
    *   multiply()
    *   divide()  // 除法，如果结果为无限循环小数，就会报错，因为除不尽  ArithmeticException
    *
    *   public Bigdecimal divide(BigDecimal divisor, int scale ,RoundingMode roundingMode)
    *      scale  :  商的标度，就是小数点后几位
    *       roundingMode  ： 要应用的舍入模式
    *
    *
    * */

    /*
    * 枚举 RoundingMode
    *      public enum RoundingMode extends Enum<RoundingMode>
    *  为可能丢弃精度的数值操作指定一种舍入行为，
    * 这个 enum 拟用于取代 BigDecimal中（BigDecimal.ROUND_UP, BigDecimal.ROUND_DOWN, BigDecimal.ROUND_HALF_UP 等）
    * 中舍入模式常量的基于整数的枚举
    *
    *      HALF_UP :
    *          x向最接近数字方向舍入，如果两个相邻数字的具体
    * */

    /*
    *   BigDecimal(double d)
    *   BigDecimal(String str)
    * */

    public static void main(String[] args) {
        System.out.println((0.65 - 0.6));
//        如果 传入的是 double 它底层就会给你解析 为一长串的数字，，
//      主要使用 字符串形式，转换为 BigDecimal 。 double 传入会解析为一长串的数字
        BigDecimal d1 = new BigDecimal("0.65");
        BigDecimal d2 = new BigDecimal(0.6);

        System.out.println(d1.subtract(d2));

        /*
        *  add()
        *   subtract()
        *   multiply()
        *   divide()   无限循环会报错
        *   在实际的开发中，需要的数据小数点一般就是后2 位（金额），四舍五入
        *   有一些比较特殊的使用场景下，一般会到小数点后四位，利率,税率。四舍五入方式存储
        * divide(BigDecimal divisor , int scale,int roundingMode)
        *   scale  需要保存目标小数的位数
        *   roundingMode  目标数据的取舍方式，通常来讲四舍五入
        *
        * 静态常量
        *   BigDecimal.ROUND_UP
        *   BigDecimal.FLOOR
        *   BigDecimal.ROUND_HALF_UP  四舍五入
        * */

        BigDecimal b3 = new BigDecimal("10");
        BigDecimal b4 = new BigDecimal("3");
        System.out.println(b3.divide(b4, 4, BigDecimal.ROUND_HALF_DOWN));


        BigDecimal dd = new BigDecimal(0.65);
        System.out.println(dd);
        System.out.println(dd.scale());
        System.out.println(dd.stripTrailingZeros());

        dd = new BigDecimal(-0.65);
        System.out.println(dd.scale());

//        dd = dd.setScale()

        /*scale 刻度，比例，数值范围
        * public BigDecimal setScale(int newScale)
        * Public BigDecimal setScale(int newScale,RoundingMode roundingMode)
        * */
    }
}
