package 集合.list;

import java.util.*;

/**
 * @author chenjie
 * @date 2021/5/19-15:09
 */
public class Demo {
    /*
    * List
    *    ArrayList
    *   LinkedList
    *  
    * List集合特点
    *   有序： 元素存入集合与从集合中取出的顺序一致
    *   有索引
    *   元素可以重复
    * */
    
    /*
    * List 中常用方法  有索引的，就有些索引方法  增删改查
    *   void add(int index, E element)   指定索引添加元素
    *         在此集合中指定位置添加元素
    * */
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("c");
        list.add("j");
        list.add("hello");
        System.out.println("list = " + list);
        
        list.add(1,"***");
        System.out.println("list = " + list);

        /*
        * E  remove(int index)  删除指定索引的元素，并且返回
        * */
        System.out.println(list.remove(1));

        /*
        * E  set(int index, E element)  修改
        * */
        System.out.println(list.set(2, "****"));
        System.out.println(list);

        /*
        * E  get(int index)  返回指定索引的元素
        * */
        System.out.println(list.get(2));

/*
* List 集合遍历
* */
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);//实际上是字符串，调用的也是 字符串的 toString
            System.out.println(obj.toString());
        }
/*
*  集合遍历方式:
*       toArray()    转为数组
*       Iterator
*       forEach
*       fori
* */

        String[] arr = (String[]) list.toArray(new String[10]);
        System.out.println(Arrays.toString(arr));

         list = new ArrayList();
        list.add("ok");
        list.add("java");
        list.add("hello");
        list.add("world");
//        test();
test0(list);

/*
* 增强for 也会出现 并发修改错误 ,增强 for 底层也是 iterator 原理
* */
      /*  for (Object o : list) {

            list.add("end");
            }*/


    }
// 迭代器报错 test
    public static void test() {
        List list = new ArrayList();
        list.add("ok");
        list.add("java");
        list.add("hello");
        list.add("world");

        Iterator it = list.iterator();
        while(it.hasNext()){
//            ConcurrentModificationException
//            并发修改  某个线程在 Collection上进行迭代时，通常不允许另一个线程修改该Collection
//            一边使用迭代器进行迭代器进行集合的遍历，一边使用集合对象修改集合中的元素（新增，删除，改值）
//            导致了集合中元素的不确定性，这种情况下，迭代器遍历不能保证正确，对于这种风险
//            迭代器不承担,于是报出并发修改异常..
            String s = (String)it.next();
            if("hello".equals(s)) {
                list.add("end");
            }

        }
    }

//    迭代器报错解决方法 test0   ListIterator<E>
    public static void test0(List list) {
        /*
        * ListIterator<E>
        *   允许你一边遍历，一边迭代器间修改
        *   必须要通过 ListIterator 动手，操作集合，才不会报错，不能直接在集合中操作
        * */
        ListIterator it = list.listIterator();
        while (it.hasNext()){
            String s = (String)it.next();
            if("hello".equals(s)) {
//                System.out.println();
                it.add("end");
                it.add("232");
            }

        }
        System.out.println("list = " + list);


        /*
        * 迭代器，是把你的集合交给了 迭代器对象，迭代器对象操作的时候，不允许，其他操作
        *   是不是两个线程？？？？？？？？？？？？
        *
        * */
    }

    public static void test1(List list) {
        for (int i = 0; i < list.size() ; i++) {
            String s = (String)list.get(i);
            if("hello".equals(s)) {
                /* 死循环， 不能放在 hello的前面， 如果加在了前面， hello的索引值也会跟着 +1 ，然后又
                * 继续进入循环，形成死循环*/
//                list.add(0,"23");
            }


        }
    }
}
