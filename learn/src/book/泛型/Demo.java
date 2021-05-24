package book.泛型;


import java.util.HashSet;
import java.util.Set;

/**
@author chenjie
@date 2021/5/22-9:54
*/

public class Demo {

    public static void main(String[] args) {
        /*
        * 27：消除非受检的警告
        *       用泛型时会遇到许多编译器警告，
        *       非受检转换警告(unchecked cast warning)
        *       非受检方法调用警告，非受检参数化可变参数类型警告（unchecked parameterized vararg type warning）
        *       非受检转换警告 （unchecked conversion warning）
        * */

        /*
        * 在 Java7 中开始引入的菱形操作符(diamond operator) <>  ,随后编译器就会推测出正确的实际类型参数
        * */
        @SuppressWarnings("unused")
        Set<String> exaltation = new HashSet<>();
        exaltation.add("12");

        /*
        * 要尽可能地消除每一个非受检警告。
        *   这意味着可以确保代码是类型安全的，意味着不会在运行时出现 Class-Cast-Exception 异常
        * */
        /*
        *   如果无法消除警告，同时可以证明引起警告的代码是类型安全的（只有在这种情况下），才可以用一个
        * @SuppressWarnings 注解来禁止这条警告    suppress 抑制，镇压，废置
        *   应该始终在尽可能小的范围内使用 SuppressWarning 注解。它通常是个变量声明，或是非常简短的方法或 构造器，永远不要
        * 在整个类上使用 SuppressWarnings，这么做可能会掩盖重要的警告
        *   每当使用 SuppressWarnings 注解时，都要添加一条注释，说明为什么这么做事安全的
        * */



    }

  /*  public <T> T[] toArray(T[] a) {
        if(a.length < ) {

        }

        return  null;
    }*/

}
