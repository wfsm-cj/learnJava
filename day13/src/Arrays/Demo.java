package Arrays;
import java.util.Arrays;
/**
 * @author chenjie
 * @date 2021/5/17-16:55
 */
public class Demo {
    /*java.util
    * Arrays 工具类 ， 某一些类型的高封装
    *   对数组操作的各种方法的封装，如果数组引用为null 会抛出 NullPointException
    * */
    public static void main(String[] args) {
        /*Arrays  构造方法 私有了，所有的成员都是静态修饰的
        * sort(Object[] a)
        *   根据元素的自然顺序进行升序
        *
        *
        * */

        int[] arr = {23,44,12,4,5};
        Arrays.sort(arr);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));


//        binarySearch(Object[] obj, Obejct key)  效率最高的一种数据查找方式
//       只能在升序排序下查找，给出的数组 obj 必须是升序排列
//   找不到元素就是 负数
//       他会找到对应插入的位置  -num  num就是插入位置前面的数字个数
    }
}
