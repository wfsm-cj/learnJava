package book.对象通用方法;

import java.util.regex.Pattern;

/**
 * @author chenjie
 * @date 2021/5/15-17:03
 */
public class Demo {

    public void eat() {
        System.out.println("demo eat");
    }
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {

        });
        Thread thread1 = new Thread(() -> {

        });
        /*为什么调用父类方法不调用子类复写方法*/
        System.out.println(thread.equals(thread1));
        System.out.println(thread.toString());
        System.out.println(thread1);

        Pattern p = Pattern.compile(" ");
        p.equals(thread);
        /*
        *  覆盖 equals 时遵守通用约定
        *   1，类的每个实例本质上都是唯一的
        *           对于代表活动实体而不是 值（value） 的类来说 确实如此， 如 Thread
        *   2，类没有必要提供“逻辑相等（logical equality） 的测试功能”
        *           比如比较两个 Pattern 实例 是否代表同一个正则表达式，没必要比较
        *   3，超类已经覆盖了 equals 。超类的行为对于这个类也是合适的
        *           都已经继承了父类的 equals 实现了想要的效果，就没必要复写
        *   4，类是私有的，或者是包级私有的，可以确定它的equals 方法永远不会被调用
        *             没看懂，是单例吗？？？？？？？？？？？、
        * */

        /*
        * 什么时候应该覆盖 equals
        *    如果类具有自己特有的 “逻辑相等” (logical equality) 概念（不同于对象等同的概念），而且超类还没有覆盖equals。
        *
        * 通常属于 “值类” (value class)
        *               值类 仅仅是一个表示值的类。 比如 Integer 或者 String
        *
        *    不仅必须覆盖 equals 方法，而且这样做也使得这个类的实例可以被用作映射表（map）的键(key),或者集合(set)的元素，
        * 使映射或者集合（set） 的元素，使映射或者集合表现出预期的行为
        *   有一种“值类”不需要覆盖 equals 方法，。确保“每个值至多只存在一个对象”的类。如：枚举类型
        * */

        /*
        * equals 方法实现了等价关系 （equivalence relation）
        *       自反性(reflexive)
        *           对于任何非 null 的引用值 x ，  x.equals(x)  必须返回 true
        * */

    }

}
