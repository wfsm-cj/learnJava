package 集合;

import java.util.LinkedList;

/**
 * @author chenjie
 * @date 2021/5/22-15:44
 */
public class Demo_Deque {
    /*
    * Queue 是队列，只能一头进，另一头出
    * 如果把条件放松一下，允许两头都进，两头都出，这种队列叫 双端队列 (Double Ended Queue) 学名：Deque
    *
    *
    * */

  /*
  * 常用方法
  *     addLast(E) / offerLast(E)
  *     removeFirst() /  pollFirst()
  *     getFirst()  / peekFirst
  *     addFirst()  / offerFirst()
  *     removeLast() /  pollLast()
  *     getLast()  /  peekLast()
  * */
    /*
    * Deque 接口 继承于 Queue   它的实现类有 ArrayDeque 和 LinkedList
    *   Queue中的 add()/offer() 也可以使用，但是使用Deque，最好不要调用 offer(),而是调用 offerLast()
    *
    * offer() 实际上就是 offerLast()。只是用 offerLast() 显得明确点，一眼就看出是添加在后面
    *
    * */

    /*
    * LinkedList 即是 List，又是 Queue,还是 Deque。但是我们在使用的时候，总是用特定的接口来引用它，
    * 这是因为持有接口说明代码的抽象层次更高，而且接口本身定义的方法代表了特定的用途
    *   面向抽象编程的一个原则就是： 尽量持有接口，而不是具体的实现类
    * */

    /*
    * 小结:
    *       Deque 双端队列 (Double Ended Queue)
    *           offerLast()    offerFirst()
    *       pollLast()   pollFirst()
    *       peekLast()  peekFirst()
    * 总是调用 xxxFirst()   xxxLast() 以便与 Queue的方法区分开
    * 避免把 null 添加到队列
    * */
}
