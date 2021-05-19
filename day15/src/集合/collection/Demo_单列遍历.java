package 集合.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author chenjie
 * @date 2021/5/19-14:05
 */
public class Demo_单列遍历 {
    /*
    * 迭代器遍历
    *   专门对于单列集合进行遍历的类型对象，称为迭代器
    * */
    /*
    * Collection
    * Iterator<E> iterator() 返回在此collection 进行迭代的迭代器
    *       返回的是个接口的 实现类对象（Iterator 的 实现类对象）
    * */

    /* 用 Collection 里的 iterator()生成 Iterator
    * Iterator
    *    boolean hasNext()  是否还有下一个元素
    *   Object  next()   返回迭代的下一个元素
    *
    * */
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
//  Iterator 实际上是一个接口， 调的是实现类
        Iterator it = c.iterator();

        int index = 0;
        while (it.hasNext()){//是否有元素判断

//            将指针移到这个位置，并取出值
            Object obj = it.next();
//
            String s = (String)obj;
            System.out.println("s = " + s);
            index++;


            if (index == 2) {
//                void  remove() 从迭代器指向的 collection 中一处迭代器返回的最后一个元素
//                每次调用 next 只能调用一次此方法，。如果进行迭代时期，用调用此方法之外的其他方式修改了该迭代器所指向
//                的 collection  ，则迭代器的行为是不确定的
//                必须要先 next()  获取了元素，才能remove() 不然找不到
                it.remove();
            }
        }
        System.out.println("c = " + c);

        /*
        *  如果集合中的元素已经遍历获取完毕，你还想通过 next()继续获取元素，报错
        *   NosuchElementException
        * */

        /*
        * 单靠 next() 实现  next()是操作指针
        * */
        it = c.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());


        /*
        * 增强for （foreach）遍历
        * JDK5 之后推出 ，内部原理就是一个 iterator 迭代器
        *
         *  iterator只对 collection 生效
            增强for 对 collection 和 array 都生效
         */

        for(Object item : c){
//            集合获取的都是 Object 对象
            String s = (String)item;
            System.out.println("s = " + s);
//            不玩索引位置的，只管你有没有数据
        }

        int[] arr = {12,13,14,15,16,17,18,19,20,21,22};
        for (int i : arr) {
            System.out.print("i = " + i);
        }

    }
}
