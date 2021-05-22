package Map.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author chenjie
 * @date 2021/5/21-16:15
 */
public class Demo_Collections {
    /*
    * Collections 单列集合工具类
    * 都是静态方法
    * */
    /*
    * 常用方法
    *   sort(List<T> list)  将指定的列表按升序排序
    * */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);
        /*
        * sort(List<T>,Comparator比较器)
        * */
        /*
        * max(Collection c)
        * min(Collection c)
        * */
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        /*
        * replaceAll(List<E> list,T oldValue, T newValue)
        * */
        Collections.replaceAll(list,2,222);
        System.out.println(list);
        /*
        * reverse(List<E> list)  翻转
        * */
        Collections.reverse(list);
        System.out.println("list = " + list);
        
        /*
        * shuffle(List<E> list)  将 list 集合中的元素进行随机置换（混乱排序）
        * */
        Collections.shuffle(list);// 斗地主  shuffle 拖着脚走，坐立不安，洗牌，调动，洗牌
        System.out.println(list);
    }
}
