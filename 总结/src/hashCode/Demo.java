package hashCode;

/**
 * @author chenjie
 * @date 2021/5/20-20:29
 */
public class Demo {
    /*
    * hashCode()
    *   对象必须正确覆写 equals() 和 hashCode()
    *
    * hashCode() 方法严格遵循以下规范：
    *       1，如果两个对象相等，则两个对象的hashCode()必须相等
    *       2，如果两个对象不相等，则两个对象的 hashCode() 尽量不要相等
    * 即对应两个实例 a 和 b
    *   如果 a 和 b 相等，那么 a.equals(b)一定为 true，则 a.hashCode() 必须等于 b.hashCode()
    *   如果 a 和 b 不相等，那么  a.equals(b) 一定为false，则 a.hashCode() 和 b.hashCode()尽量不要相等
    * */

    /*
    * 因为我们在计算 hashCode() 的时候，可能 firstName 或 lastName 为 null，就会抛出NullPointerException
    * 为了解决这个问题，我们在计算 hashCode()的时候，经常借助 Objects.hash() 来计算
    * */
    String firstName;
    String lastName;
    int age;

    @Override
    public int hashCode() {
        int h = 0;
        h = 31 * h +firstName.hashCode();
        h = 31 * h + lastName.hashCode();
        h = 31 * h + age;
        return h; //把每个成员变量的 hashCode()都关联起来而形成的 hashCode
    }

    /*
    * equals() 用到的用于比较的每一个字段，都必须在 hashCode() 中用于计算
    * equals() 没有用到的字段，绝不可放到 hashCode()中计算
    * */

    /*
    * HashMap 内部使用了数组
    *   通过计算 key.hashCode() 定位 value 所在的索引， hashCode()返回的 int 范围高达 正负21亿，
    * 先不考虑负数，HashMap内部使用的数组得有多大？
    *
    * 实际上 HashMap 初始化时默认的数组大小只有16，无论它的 hashCode()有多大，都可以简单的通过
    *   int  index = key.hashCode() & 0xf  //永远都是在16以下的数字
    *
    * 如果添加超过一定数量的 key - value时，HashMap会在内部自动扩容，每次扩容一倍，即长度为16的数组扩展到长度为32
    * 相应的，需要重新请确定 hashCode() 计算的索引位置，，
    * 如  int index =  key.hashCode() & 0x1f //  32的数组的索引
    * 扩容会导致重新分布已有的 key-value  ，所以 频繁扩容对 HashMap的性能影响很大，如果我们确定要使用一个容量
    * 为10000个 的 key-value 的HashMap，更好的方式是创建 HashMap时就指定容量：
    *   Map<String,Integer> map = new HashMap<>(10000)
    *
    * 两个不同的 key  但是它们的 hashCode恰好是相同的。 意味着它们会在相同的索引。
    *   只要 key 不相同，它们映射的 value 就互不干扰
    *   当两个不同的key (“a” 和 “b”)的 hashCode()一样了，在这个索引上 实际存储的不是一个实例，而是一个 List(链表)
    * 它包含两个 Entry， 一个是 “a” 的映射，一个是 “b” 的映射
    * 实际上遍历的时候，还需要遍历这个 List，并找到一个与之对应的 Entry，才能返回对应的实例
    *
    * 我们把不同的 key 具有相同的 hashCode()的情况称为哈希冲突。。
    *       一种最简单的办法就是用 List 存储 hashCode()
    *       显然，如果冲突概率越大，这个 List 就越长， Map 的 get() 方法效率就越低，
    * 这就是为什么要满足：如果两个对象不相等，则两个对象的hashCode()尽量不要相等
    *   hashCode()方法编写的越好，HashMap 工作的效率就越高
    * */
}
