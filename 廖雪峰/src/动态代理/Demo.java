package 动态代理;

import java.lang.reflect.Proxy;

/**
 * @author chenjie
 * @date 2021/5/31-19:23
 */
public class Demo {
    /*
    * 动态代理
    *   我们并不去编写实现类，而是直接通过JDK提供的一个 Proxy.newProxyInstance() 创建了一个
    * Hello接口对象，
    *   这种没有实现类，但是在运行期动态创建了一个接口对象的方式。我们称为动态代码。
    *   JDK提供的动态创建接口对象的方式，就叫动态代理
    *
    * 动态代理是通过 Proxy 创建代理对象，然后将接口方法“代理’给 InvocationHandler 完成
    * */
    public static void main(String[] args) {
        /*
        * public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
        *    loader  -  定义代理类的类加载器
        *   interfaces  -  代理类要实现的接口列表
        *      h  -  指派方法调用的调用处理程序
        * 返回;一个带有代理类的指定调用处理程序的代理实例。。它由指定的类加载器定义，并实现指定的接口
        * */
//        Hello hello = Proxy.newProxyInstance(Hello.class.getClassLoader(),new class[]{})

        /*
        * InvocationHandler 作用：
        *      当代理对象的原本方法被调用的时候，会重定向到一个方法，这个方法就是InvocationHandle
        * 里面定义的内容，同时会替代原本方法的结果返回
        *
        * loader 和 interface 基本就是决定了这个类到底是个怎么样的类， 而 h是InvocationHandler，
        * 决定了这个代理类到底是多了什么功能
        *
        * */
    }
}
