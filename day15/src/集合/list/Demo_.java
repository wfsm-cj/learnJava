package 集合.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author chenjie
 * @date 2021/5/19-15:20
 */
public class Demo_ {
    /*List 对索引操作的新方法
    * 曾删改查
    *  void add(int index, E element)
    *  E  remove(int index)
    * E  set(int index, E element)
    * E  get(int index)
    * */

    public static void test() {
        List list = new ArrayList<>();
        list.add("c");
        list.add("j");

        Iterator it = list.iterator();
//        while(it.hasNext()) {
//            String s = (String)(it.next());
//            list.add("hh");
//        }
        it.next();
        System.out.println(list);
    }

    public static void main(String[] args) {
        test();
    }
}
