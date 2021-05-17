/**
 * @author chenjie
 * @date 2021/5/17-17:31
 */
public class Demo_Problem {
    /*
    * String
    * StringBuilder
    *
    * StringBuffer
    * 的区别
    *
    * StringBuilder （字符串的生成器，字符串的缓冲区）
    *       用于表示可变的字符序列，主要 通过 append  insert 添加数据到生成器中
    * 返回的都是同一个 StringBuilder 对象 ，因此，在字符串拼接的时候节省内存
    *
    * StringBuffer
    *   不需要考虑线程安全的条件下，优先使用 StringBuilder
    *
    * StringBuffer 和 StringBuilder 是等价类
    *       StringBuffer 是线程安全的，因此运行的效率较低 ，JDK1.0
    *       StringBuilder  JDK1.5 ，线程不安全，运行效率高
    *       如果在不涉及到安全问题的情况下，优先使用 StringBuilder
    * */
}
