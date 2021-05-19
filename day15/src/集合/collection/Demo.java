package 集合.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author chenjie
 * @date 2021/5/19-10:43
 */
public class Demo {
    public static void main(String[] args) {
/*
* java.util 包 Collection
* */
        Collection c = new ArrayList();
        /*
        * 常用方法
        *   add(Object obj)
        *   remove(Object obj)
        *   size()
        *   isEmpty()
        *   contains()
        *   clear()
        * */
        c.add("abc");
        c.add("hi");
        c.add("world");
// 有序的，因为 ArrayList是有序的
        System.out.println("c = " + c);

        /*
        * boolean remove(Object obj)
        * */
        c.remove("hi");
        c.remove("hiiii");// 不存在的删除 不会报错，也不会删除
        System.out.println("c = " + c);

        /*
        * void clear()  清空
        * */
//        c.clear();
        System.out.println("c = " + c);

        /*
        * boolean contains(Object o)  是否包含
        * */
        System.out.println(c.contains("abc"));

        /*
        * boolean isEmpty()  判断集合是否为空
        *   获取元素，判断包含关系，先判断是否为空
        * */
        System.out.println(c.isEmpty());
        c.clear();
        System.out.println(c.isEmpty());

        /*
        * int size()  集合的长度，大小
        * */
        System.out.println(c.size());

        /*
        * 数组长度  length
        * 字符串   length()
        * 集合长度   size()
        * */

        /* 集合 -> 数组   然后可以遍历，向下转型，Object对象
        * Object[]  toArray()
        *
        * */
        c = new ArrayList();
        c.add(12);
        c.add(-8);
        c.add(99);

        Object[] objArr = c.toArray();
        for (int i = 0; i < objArr.length ; i++) {
            Object obj = objArr[i];
            Integer num = (Integer)obj;

        }

        /*
        * add(E e)  添加一个
        * addAll(Collection c)  添加集合。
        *   clear()
        * contains()
        * containsAll(Collection c)  完全包含这个集合 返回true
        * isEmpty()
        * remove()
        * removeAll(Collection c)  删除集合c包含的元素，只要是属于集合c中的
        *       删除交集
        * retainAll()  ---------retain
        *       只将交集保留下来 ，retain 保持，记住 ，，和 removeAll()相反
        * */
        Collection c1 = new ArrayList();
        c1.add("hello");
        c1.add("cj");

        Collection c2 = new ArrayList();
        c2.add("cj");
        c2.add("eee");

        System.out.println(c2.containsAll(c1));

//        c2.removeAll(c1);
        c2.retainAll(c1);
        System.out.println("c2 = " + c2);

//        c2.addAll(c1);
//        System.out.println("c2 = " + c2);
//
//        System.out.println(c2.containsAll(c1));
    }
}
