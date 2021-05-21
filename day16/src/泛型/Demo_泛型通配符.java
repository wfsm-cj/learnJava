package 泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenjie
 * @date 2021/5/20-14:05
 */
public class Demo_泛型通配符 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
//        Collection<?>   ?表示泛型的通配符，表达任意泛型
        list.removeAll(list1);

        /*
        * Collection<E>
        *  addALL(Collection<? extends E>)
        * */
        List list2 = new ArrayList<>();
        list2.add("abc");
        list2.add(12);
        list.removeAll(list2);
        System.out.println(list);

        ArrayList list3 = new ArrayList();
        list3.addAll(list1);

        /*
        *  ? super E
        *       未来泛型？可以是 E类型本身，也可以是E类型父类
        * static<T> void sort(T[]a,Comparator<? super T>)
        * */
    }
}
