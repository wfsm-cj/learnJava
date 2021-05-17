import java.math.BigInteger;

/**
 * @author chenjie
 * @date 2021/5/17-10:57
 */
/*
* BigInteger 内部用一个 int[] 数组来模拟一个非常大的整数
*   构造
*       BigInteger(String val)
*       BigInteger(String val, int radix)  按照指定radix来解析 val
*       radix  基数
* 对 BigInteger 做运算的时候，只能使用实例方法
*       add()
*       subtract()
*       multiply()
*       divide()
* 和 long 型整数运算比， BigInteger不会有范围限制，但缺点是速度比较慢
*
* BigInteger 和 Integer，Long 一样，是不可变类，并且 继承自 Number类，Number类定义了转换为基本类型的几个方法
*      byteValue()
*       shortValue()
*       intValue()
*       longValue()
*       floatValue()
*       doubleValue()
*      上述方法，可以把 BigInteger 转换为基本类型，如果 BigInteger 表示的范围超过了基本类型的范围，转换时
* 将丢失高位信息，即结果不一定是准确的，如果需要准确的转换为基本类型
*       可以使用
*       intValueExact()
*       longValueExact()
*           在转换时，如果超出范围，直接抛出 ArithmeticException
*
*   exact 准确的，精密的，精确的
*   arithmetic  算术，算法，数字
*
* 常用方法
*      subtract()
*       multiply()
*       divide()
*       add()
*       remainder()   取余   remainder 余数 ，，
*       pow()
*       abs()
*       negate()  相反数    negate 否定，取消，使无效
*       mod()
*       equals()
*       compareTo(BigInteger val)   比较，小于 -1，大于 1 ，等于 0
*       gcd() 最大公约数
*       max(BigInteger val)  返回较大的 BigInteger
*       min(BigInteger val)  返回较小的 BigInteger
* */
public class Demo_BigInteger {
    public static void main(String[] args) {
        BigInteger big = new BigInteger("-12312123123123123123");
        BigInteger big2 = new BigInteger("56412222222222",8);

        System.out.println(big.abs());
//        返回相反数
        System.out.println(big.abs().negate());

        /* long型数据有限，引入 BigInteger
        * abs()
        * negate()
        * add(BigInteger big)    bigInteger不能用 + 操作  是对象 不是数值
        * subtract()     subtract 减去，扣掉
        * multiply()     多重的，多样的，乘 使增加 ，使繁殖
        * divide()         飞凯
        *
        *这些方法 都返回 BigInteger 对象
        * */
        System.out.println();

        BigInteger i = new BigInteger("1213465");
        System.out.println(i.longValue());
        System.out.println(i.pow(5));
        System.out.println(i.pow(5).longValue());
        System.out.println(i.pow(5).longValueExact());

    }

}
