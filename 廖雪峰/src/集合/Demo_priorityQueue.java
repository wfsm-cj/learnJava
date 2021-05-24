package 集合;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author chenjie
 * @date 2021/5/22-15:11
 */
public class Demo_priorityQueue {
    /* priority 优先，优先权，优先考虑的事
    * PriorityQueue
    *         银行柜台办业务时，取号 A1，A2...An ，按照号码顺序依次办理，实际上就是队列
    * 但是我们要实现 vip 插队业务，用 Queue就不行了。。我们需要使用 PriorityQueue
    *
    * PriorityQueue 和 Queue 区别：
    *       它的出队顺序与元素的优先级有关，对PriorityQueue 调用 remove() 或 poll() 方法，返回的总是优先级最高的元素
    *
    * 要使用PriorityQueue 就必须给每个元素定义 "优先级"
    *   必须实现 Comparable接口，PriorityQueue 会根据元素的排序顺序决定出队的优先级
    * 如果我们要放入的元素并没有实现Comparable接口，PriorityQueue 允许我们提供一个 Comparator对象来判断两个元素的顺序
    * */
    public static void main(String[] args) {
        Queue<Person> q  = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                System.out.println(o1.getName().compareTo(o2.getName()));
                return o1.getName().compareTo(o2.getName());
            }
        });
        q.offer(new Person("cj",26));
        q.offer(new Person("zz",18));
        q.offer(new Person("aa",5));
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());

/*
* 小结：
*
*       PriorityQueue 实现了一个优先队列，从队首去元素时，总是获取优先级最高的元素
*       PriorityQueue 默认按元素比较的顺序排序 （必须实现Comparable接口），也可以通过 Comparator 自定义排序算法
* */

    }
}
