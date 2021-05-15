package book.避免创建不必要的对象;

/**
 * @author chenjie
 * @date 2021/5/15-11:41
 */
public class Demo {

    /*
    *   静态工厂方法
    *       除了重用不可变的对象之外，也可以重用那些已知不会被修改的可变对象
    *   正则表达式创建一个 Pattern 实例的成本很高，因为需要将正则表达式编译成一个
    * 有限状态机（finite state machine）
    *   所以在调用 正则 的时候，一般把正则提取出来
    * private static final Pattern ROMAN = "";
    *
    * */

    public static void main(String[] args) {

        /*
        * 自动装箱 也很容易创建多余的对象  比如 long 换为 Long 后每一次 long赋值都会
        * 自动装箱为 Long  ，，相当于多创建了 2的31次方个多余的 Long 实例
        * 要优先使用基本类型，而不是装箱基本类型，要当心无意识的自动装箱
        * */
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE ; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
