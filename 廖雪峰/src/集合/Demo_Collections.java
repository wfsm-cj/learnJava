package 集合;

import java.util.Collections;
import java.util.List;

/**
 * @author chenjie
 * @date 2021/5/22-16:12
 */
public class Demo_Collections {
    public static void main(String[] args) {
        /*
        *  Collections 工具类
        *       emptyList()
        *       emptyMap()
        *       emptySet()
        * */
//  返回空的列表，还是不可变的
        List<String> list = Collections.emptyList();
//        list.add("a");
        System.out.println(list);

        List<String> list1 = List.of();
        System.out.println(list1);
        /*
        * List.of()  和 Collections.emptyList() 是等价的
        * */

        /*
        * 创建单元素集合
        *       singletonList(T o)
        *       singletonMap(K key,V value)
        *       singleton(T o)
        *
        * 实际上 使用 List.of(T...) 更方便，它既可以创建空集合，也可以创建单元素集合，还可以创建
        * 任意个元素的集合
        * */

        /*
        * Collections 可以对 List 进行排序
        *       Collections.sort()
        * Collections 提供了洗牌算法，即传入一个有序的List，可以随机打乱 List 内部元素的顺序
        *   相当于让计算机洗牌
        * */

        /*
        * 不可变集合
        *   Collections 还提供了一组方法把可变集合封装成不可变集合
        *       unmodifiableList()
        *       unmodifiableSet()
        *       unmodifiableMap()
        *
        * 然而，继续对原始的可变 List 进行增删是可以的，并且，会直接影响到封装后的不可变“List”
        * 因此，如果我们希望把一个可变 List 封装成 不可变 List ，那么不可变 List 返回后，最好立刻扔掉
        * List 的引用，这样可以保证后续操作不会意外改变原始对象。
        *
        * Collections 还提供了一组方法，把线程不安全的集合变成线程安全
        *       synchronizedList()
        * ...
        * */
    }
}
