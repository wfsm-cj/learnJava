package 泛型;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author chenjie
 * @date 2021/5/20-10:23
 */
public class Demo {
    /*
    * 泛型
    *   广泛的类型，在定义一个类的时候，
    * 尚未确定的类型，用一个符号表示。这个符号，就称为泛型
    * Collection<E>
    *  List<E>
    *   add(E e)
    *   E get(index)
    * */

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(12);

        /*没有泛型的危害：
        * 1，每一次存储的数据都是Object类型，取出的数据也是Object，需要多态向下转型才能获取到集合中存储的类型本身
        * 2，没有泛型，集合中可以存储不同的数据，因为类型不同，取出的时候，就会报出类型转换错误
        * */
        /*
        * 集合有泛型
        *   泛型的具体类型，在创建对象的时候同时确定
        *
        * 优势
        *       1，将没有泛型时的异常风险提前到代码的编译环节
        *
        *       add(E  e)
        *       E  get(index)
        *       2,可以避免掉多态向下转型的麻烦
        *
        * 使用集合和迭代器的时候必加泛型
        * */

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abc");
        list1.add("12");
        for (String s : list1) {
            System.out.println("s = " + s);
        }
        Iterator<String> it = list1.iterator();
        while(it.hasNext()) {
            String s = it.next();
        }

        /*
        * 泛型的注意事项：
        *       1，泛型使用的时候必须前后一致
        *       2,JDK 1.7 出现了泛型的推断机制，后面泛型的类型可以不写，默认推断成与前面的泛型保持一致
        * */
        ArrayList<Character> list2 = new ArrayList<>();

        /*
        * 泛型类
        *   E element
        *   K  key
        *   V  value
        *   T
        *   W
        *   Q
        *   就相当于这个类型已知的  ctrl+f12
        * */

        /*
        * 泛型通配符
        *    ？表示任意类型，没有任何的限制
        * removeAll(Collection<?> c)
        *       ? 任意
        * */


    }
}
