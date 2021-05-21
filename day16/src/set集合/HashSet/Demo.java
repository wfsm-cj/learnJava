package set集合.HashSet;

import java.util.HashSet;

/**
 * @author chenjie
 * @date 2021/5/20-16:53
 */
public class Demo {
    /*
    * HashSet 保证元素唯一
    * */
    public static void main(String[] args) {
        HashSet<Person> hash = new HashSet<>();
        hash.add(new Person("zs",20));
        hash.add(new Person("zs",20));
        hash.add(new Person("zs",20));
        hash.add(new Person("zs",20));

        /*
        * hashCode()
        *       表达获取到对象的哈希码值
        * 所谓的哈希码值就是将一个对象地址，通过算法转换成有个整数。
        * 同一个对象，哈希码值必须相同，不同对象，哈希码值不同（90%以上）
        *
        * */

        /*
        * 1.计算出对象的hashCode值
        * 2，比较对象之间的hashcode值是否相同，如果不相等，会直接添加元素到集合中
        * 3，比较对象的 hashCode值相同，继续调用 equals方法，
        * 4，如果 equals 返回值为 true ，那么认为元素重复，添加失败
        * 自定义引用数据类型，如果要通过HashSet进行去重复，那么需要重写hashCode 和 equals方法
        *
        * Object类型 hashCode计算对象内存地址， equals也是比较的内存地址，无法进行成员变量值
        *
        * 当我重写了 hashcode 和 equals 时，，可以比较成员变量内容
        * */


        /*
        * 哈希表：
        *   数组+链表 结构
        *       二叉树，？
        *   hashCode 结果值
        * */
    }
}
