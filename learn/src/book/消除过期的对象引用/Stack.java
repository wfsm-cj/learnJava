package book.消除过期的对象引用;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author chenjie
 * @date 2021/5/15-15:02
 */
/*          这里只讨论了 过期引用， 2， 3， 没有讨论
* 内存泄漏常见来源：
*       1，过期引用
*       2，缓存，缓存的清楚工作可以由一个后台线程（可能是Timer 或者是 ScheduledThreadPoolExecutor） 来完成
* 或者也可以再给缓存添加新条目的时候顺便进行去清理
*       3，监听器和其他回调。。往往通过 Heap 剖析工具发现内存泄漏
*
* */
public class Stack {

    private Object[] elements;
    private int size = 0;
    public static final int DEFAULT_INITAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }
    /*
    *   不停的 push() pop() size 随着 elements[size] 会随着 push的次数增多而 增多
    * pop减少而 减少，就改变了 栈的大小，
    *   栈中存储的是 elements[size] 指向堆中的引用，这样的垃圾是不会被虚拟机回收的，过多的话就会内存泄漏
    * */
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        Object result = elements[--size];//找个变量将要用的数据存起来
        elements[size] = null; //  显示的清空引用
        return result;
    }
/*
* 只要类是自己管理内存，程序员就应该警惕内存泄漏问题，一旦元素被释放掉，该元素中包含的任何对象引用都应该被清空
* */
    public void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements,2 * size + 1);
        }
    }


    public static void main(String[] args) {
//        public static boolean[] copyOf(boolean[] original,int newLength)
//        赋值 original  按照 newLength 来截取，
        System.out.println(Arrays.toString(Arrays.copyOf(new int[]{1, 2, 3, 4, 5}, 8)));

        /*
        * 一个线程有一个栈
        *   一个方法 是 一个栈帧
        * 成员变量 是在堆中的，
        * 栈里面存储的是 对成员变量的 引用，，
        * 当一系列方法，在操作数组的时候，会对数组进行 增加 或者 删除，
        * 而随之对应在 栈 中指向 数组的 索引 的 栈 的 局部变量，也在增加 或者 删除
        *
        *       如果一个栈先是增长，然后再收缩，从栈中弹出来的对象不会被当做垃圾回收，
        * 即使使用栈的程序不再引用这些对象，它们也不会被回收。
        *       栈内部维护着对这些对象的 过期引用 （obsolete reference），
        * 指永远也不会再被解除的引用
        *
        * 解决方法
        *      清空引用，元素被弹出栈，指向它的引用就过期了
        * */
    }
}
