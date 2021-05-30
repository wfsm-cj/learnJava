package 枚举;

import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/28-17:36
 */
public class Demo_Enum {
    /*
    * Enum接口  是所有枚举的公共基本类
    * int ordinal()  枚举声明的位置
    * */

    public static void main(String[] args) {
        Demo mon = Demo.MON;
        System.out.println(mon.ordinal()); // 0
        Demo tue = Demo.TUE;
        System.out.println(tue.ordinal()); // 1
        /*
        * compareTo(E o)   比较枚举项之间的顺序大小
        * */
        System.out.println(mon.compareTo(tue));
        /*
        * name()
        *   将此枚举项的名字
        * toString()
        *
        * */
        System.out.println(Demo.MON.name());
//        toString() 可以复写
        System.out.println(Demo.MON.toString());

        /*
        * static values()
        *   可以将你当前枚举类型中所有的枚举项获取到，返回值结果枚举类型的数组
        * */
        Demo[] arr = Demo.values();  // 将 枚举 变为  数组
        System.out.println(Arrays.toString(arr));


    }
}
