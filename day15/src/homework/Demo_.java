package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author chenjie
 * @date 2021/5/20-9:24
 */
public class Demo_ {
    public static void test() {
      List list = new ArrayList<>();

        list.add("abc");
        list.add("abc");
        list.add("def");
        list.add("def");

        list.add("def");
        list.add("hello");
        List list1  = new ArrayList();
        list1.add("def");
        System.out.println(list.removeAll(list1));
        System.out.println("list = " + list);
        /*
        * removeAll()
        * 或者 ListIterator
        * */
    }

    public static void test0() {
        ArrayList list = new ArrayList();
        list.add(new Person());
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        addArrayList(list);

        LinkedList list1 = new LinkedList();
        test1(list1);
    }


    public static void addArrayList(ArrayList list) {
        long start = System.currentTimeMillis();
        for (int i = 0;i < 10000;i++) {
            list.add("abc");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void test1(LinkedList list) {
        long start = System.currentTimeMillis();
        for (int i = 0;i < 10000;i++) {
            list.addFirst("abc");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }


}
