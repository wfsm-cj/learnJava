package 基本类型包装类;

/**
 * @author chenjie
 * @date 2021/5/14-16:54
 */
public class Demo_Math {
    public static void main(String[] args) {
        /*
        * 用于执行基本数学运算的方法
        *   Math类在 API 构造方法是私有的  里面的方法都是由静态修饰的
        *
        * */
        System.out.println(Math.E);
        System.out.println(Math.PI);
//        Class<Integer> c = int.class;

        /*
        * 静态
        *   abs(基本数字类型)  绝对值
        *   ceil(double a)  天花板 ，向上取整
        * */
        System.out.println(Math.abs(-9));
        System.out.println(Math.ceil(4.2));
        /*
        * floor() 向下取整
        * max(int a, int b)
        * min(数字1，数字2)
        * pow(int a, int b)  a的 b次幂
        * random()   [0,1)随机数
        * round() 四舍五入
        * */
        System.out.println(Math.floor(4.2));
        System.out.println(Math.max(23, 45.2));

        System.out.println(Math.random());
        System.out.println(Math.round(Math.random()));
        System.out.println(Math.round(7.5));

    }

}
