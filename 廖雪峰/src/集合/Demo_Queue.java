package 集合;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author chenjie
 * @date 2021/5/22-14:33
 */
public class Demo_Queue {
    public static void main(String[] args) {
        /*
        * 队列 Queue 是一种经常使用的集合
        *   先进先出（FIFO  First In First Out）
        * Queue只有两个操作：
        *   1，把元素添加到队列末尾
        *   2，从队列头部取出元素
        *
        * 常用方法
        *      int size()
        *      boolean add(E)  /  boolean offer(E)  添加元素到队尾
        *       E remove() / E poll()   获取队首元素并从队列中删除
        *       E element() / E peek()   获取队首元素但并不从队列中删除
        *
        * add(), remove() ,element()，在操作元素失败时，会抛出异常，
        * 比如：添加失败（可能超过了队列的容量） ，删除失败（列队中压根没有元素）
        *
        * 调用  offer()  poll()  peek() 返回false或者 null，不会抛出异常
        *
        * 不要把 null 添加到队列中，否则 poll()方法返回 null 时，很难确定是取到了null元素还是队列为空
        *
        *
        * */
        Queue<String> q  = new LinkedList<>();
        System.out.println(q);
        /*
        *我们可以发现 LinkedList 即实现了 List 接口，又实现了 Queue 接口，但是，在使用的
        * 时候，如果我们把它当做List 就获取 List 的引用，如果我们把它当做 Queue，就获取Queue的引用
        *
        * */

        /*
        * 小结
        *   队列 Queue 实现了一个先进先出的数据接口
        *       offer()
        *       poll()
        *       peek()
        *   避免把 null 添加到队列中， poll() 取出的不知道是 null ，还是本身队列为空
        * */
    }
}
