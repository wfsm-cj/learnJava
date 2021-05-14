package 基本类型包装类;

/**
 * @author chenjie
 * @date 2021/5/14-15:19
 */
public class Demo_Integer {
    /*
    * 需要解析字符串 ，，
    *   比如将字符串 解析 为 int  日历类型，
    *       与字符串相互转换
    *       int 是基本类型
    *       String 为引用类型
    *       所以 将 基本类型 变为 基本类型包装类
    * */
    /*
    * byte  Byte
    * short Short
    * int   Integer
    * long  Long
    * float  Float
    * double Double
    * char  Character
    * boolean  Boolean
    * */

    public static void main(String[] args) {
        /*
        * Integer 构造方法   没有空参构造
        *       Integer(int value)
        *
        * */
        Integer i = new Integer(1);
//        Integer中将 toString() 重写了    Object中 toString() 返回 getClass().getName() + @ + hashcode()
        System.out.println(i.toString());

//        Integer(String s)  如果传入的是不认识的字符会报错 NumberFarmatException
        Integer i2 = new Integer("120");

        /*
        * 成员方法
        *   xxxValue() 将Integer类型的对象，转成其他的基本数据类型
        *       byteValue()
        *       doubleValue()
        *       floatValue()
        *       shortValue()
        *       longValue()
        *       intValue()
        *
        * 静态方法
        *       parseInt(String str)  将str 以十进制转换为 int
        * */

        Integer  ii  = new Integer(10);
        byte b = ii.byteValue();
        System.out.println(b);
        System.out.println(ii.getClass());

        /*  String --> int */
//        public static  int parseInt(String s)
//        parseInt(String s ,radix 进制)  以二进制解析字符串为 int
//        返回十进制的整数

        /*
        *  int  --> String
        *   w+""
        *   String.valueOf()
        *   obj.toString()
        *   new String(int i)
        * */


        /*
        * toBinaryString(int i)     2进制
        * toOctalString(int i)      8进制
        * toHexString(int i)      变为16 进制
        * */

        /* 都是静态方法，除了 xxxValue()
        *   toString(int i , int radix)  将整数i 以 进制转换为指定 string
        *   valueOf(int i ,int radix)
        * */

//        将 str  转为 Integer 以2进制形式  ，，最后返回的是十进制
        System.out.println(Integer.valueOf("1010", 2));



        /*
        * Integer 常量
        *     public static final
        *    MAX_VALUE
        *    MIN_VALUE
        *    SIZE   表达 int 所占的 比特位数  32  4个字节
        *     TYPE
        * */

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
//        public static final Class<Integer>  TYPE
//        interger 类型的 Class 实例
//        Integer.class  就属于 Class Integer;
        System.out.println(Integer.TYPE);  //Integer中 封装的是 什么类型的 数据
        System.out.println(Integer.class);

//        Class<Integer> hehe;
        System.out.println(Integer.TYPE == Integer.class);
    }
}
