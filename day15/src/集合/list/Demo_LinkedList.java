package 集合.list;

import java.util.LinkedList;

/**
 * @author chenjie
 * @date 2021/5/19-17:31
 */
public class Demo_LinkedList {
    /*
    * 数据域 + 指针域
    *      在内存中的地址不一定连续，利用内存中的零散空间
    *
    * 早期的 LinkedList 是单向链表
    * LinkedList 是双向链表
    *   指针域+ 数据域 + 指针域
    *   查询慢，增删相对比较快
    *   元素地址空间不连续，没办法通过索引位置计算出元素的内存地址
    * 只能，从头开始一个个的往下寻找，
    *   LinkedList存储的数据越多，未来查找起来需要的时间越多
    *
    * 后期LinkedList 优化成了 双向链表，为了提升查询的效率
    *       有了双链表之后我的 ，会记录两个地址，如果现在需要数据的查找
    * 会根据目标的索引位置，会去判断这个元素离头比较近，还是离尾比较近，离谁进
    * 从那一侧开始查找，相对提高了一些查询效能，但是还是比 ArrayList慢很多
    * 从两个方向查
    *
    * 增加删除只需要修改 指针域的数值，
    *
    * */

    public static void main(String[] args) {
        /*
        * LinkedList 常用方法
        *
        * */
        LinkedList list =new LinkedList();
        list.addFirst("1");
        list.addFirst("cj");
        list.addLast("hello");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        list.removeLast();
    }
}
