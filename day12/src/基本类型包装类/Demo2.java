package 基本类型包装类;

/**
 * @author chenjie
 * @date 2021/5/14-16:00
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Integer.toString(234, 2));
        System.out.println(Integer.toOctalString(16));
        System.out.println(Integer.toHexString(16));
        System.out.println(Integer.toBinaryString(16));

        System.out.println(Integer.valueOf("10101010", 2));


    }
}
