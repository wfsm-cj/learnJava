package learn;

/**
 * @author chenjie
 * @date 2021/5/21-10:14
 */
public class Demo_super通配符 {
    public static void main(String[] args) {
        Pair<Number> p1 = new Pair<>(12.3,4.5);
        Pair<Integer> p2 = new Pair<>(123,456);
        setSame(p1,23);

        System.out.println("p1 = " + p1.getFirst());
    }
    static void setSame(Pair<? super Integer> p,Integer n) {
        p.setFirst(n);
        Object obj = p.getFirst();
        Integer x = (Integer) p.getFirst();
        /*
        * 使用 <? super Integer> 通配符表示
        *       允许调用  set(? super Integer) 方法传入 Integer 的引用
        *       不允许调用get() 方法 获得 Integer的引用 ，， 因为你获取的是Integer 的父类和 Integer 不确定类型，需要强制转换
        * 或者使用 Object obj = p.getXxx() 或者强制转型
        *<?  super Integer> 通配符作为方法参数，表示方法内部代码只能写，不能读。。。 读取需要设置为Object 或者 强转
        *
        * */


        /*
        * Java标准库的 Collections 类 定义的 copy() 方法
        *   public static<T> void copy(List<? super T> dest, List<? extends T src>)
        *       dest 目的地，目的对象
        *
        * 这个 copy() 方法的定义就完美地展示了 extends 和 super 的意图
        *       copy() 方法内部不会读取 dest，因为不能调用 dest.get() 来获取 T 的引用
        *       copy() 方法内部也不会修改 src，因为不能调用 src.add(T)
        * 这是由编译器检查来实现的，如果在方法代码中修改了 src 或者意外读取了 dest 就会导致一个编译错误
        * 所以 这个 copy() 方法，可以安全的把一个 Link<Integer> ,添加到 Link<Number>中，但是无法反过来添加
        *
        * */

        /*
        * PECS原则 （Producer Extends Consumer Super）
        *   如果需要返回 T， 他是生产者 （Producer），要使用extends 通配符，
        *   他是消费者(Consumer) 要使用 super 通配符
        *
        * */

        /*
        * 无限定通配符
        *   ？ （Unbounded Wildcard Type）
        * 因为 <?> 通配符既没有 extends ，也没有 super ，因此
        *   不允许调用 set(T) 方法并传入引用 （null 除外）
        *   不允许调用 T get() 方法并获取 T 引用（只能获取 Object引用）
        * 换句话说，既不能读，也不能写，，那只能做一些 null 判断
        *
        * <?>通配符有一个独特的特点，就是 Pair<?> 是所有 Pair<T>的超类
        * */
        Pair<Integer> p1 = new Pair<>(123,23);
        Pair<?> p2 = p;
        System.out.println(p2.getClass());
        /*
        * <?> 通配符有一个独特的特点，  Pair<?> 是 所有 Pair<T>的超类
        * 可以用<T> 替换，同时他是所有<T> 类型的超类
        * */
        System.out.println(Pair.class.getSuperclass());
    }
}
