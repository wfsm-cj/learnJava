package 枚举类;

import java.time.DayOfWeek;

/**
 * @author chenjie
 * @date 2021/5/22-11:40
 */
public class Demo_Enum {
    public static void main(String[] args) {
//        final 修饰在函数上，表示函数可以被继承 但不能被复写
        /*
        *    public final int compareTo(E o)
        *       将此枚举与指定的对象进行比较，必须是同一枚举对象，
        *       返回 负整数，零，或正整数，表示 小于，等于，大于
        * */
        System.out.println(DayOfWeek.MONDAY.compareTo(DayOfWeek.FRIDAY));

        /*
        * public final Class<E> getDeclaringClass()
        *       该类对象对应于次枚举常量的枚举类型
        * */
        System.out.println(DayOfWeek.MONDAY.getDeclaringClass());
        System.out.println(DayOfWeek.MONDAY.getClass());
        System.out.println(DayOfWeek.FRIDAY.getDeclaringClass());
    }
}
