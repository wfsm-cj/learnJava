package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenjie
 * @date 2021/5/31-19:45
 */
public class DynamicProxy {
    /*
    * Dynamic  动态的，动力的，有活力的
    * proxy   代理人，委托书，代用品
    * ordinary  普通的，平凡的，平常的
    * invocation 祈求，缓引，引起，等于 invoke == invocate
    * */
    public static void main(String[] args) {

    Student ordinaryStudents = new OrdinaryStudents();

    /*
    * 现在有一位特殊的学生， 区长的儿子， 要对他额外照顾
    * 定义一个类： 区长的儿子类，他继承自学生类。。但世上儿子千千万，有区长的儿子，也有市长的儿子，有很多儿子，不能
    * 把他们挨个定义出来
    *
    * 现在就可以使用动态代理机制，动态的给区长的儿子加上功能，以后碰到，市长，省长的儿子也同理
    *
    * InvocationHandler接口
    *       作用就是，当代理对象的原本方法被调用的时候，会重定向到一个方法，这个方法就是InvocationHandler里面
    * 定义的内容，同时会替代原本方法的结果返回
    *       InvocationHandler 是代理实例的 调用处理程序 实现的接口、
    *  每个代理实例都具有一个关联的调用处理程序。对代理实例调用方法时，将对方法调用进行编码并将其指派
    * 到它的调用处理程序的 invoke 方法
    *
    *   Object invoke(Object proxy, Method method, Object[] args)
    *       proxy:代理后的实例对象  
    *       method ：对象被调用的方法
    *       args ： 调用时的参数
    * */
    InvocationHandler handler = new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(proxy);// 在外面掉会堆栈溢出， 他是个虚拟对象

//            重新定义eat 方法
            if("eat".equals(method.getName())) {
                /*Method
                * public String getName()
                *    以 String 形式返回 Method 对象表示的方法名称
                * */
                System.out.println(proxy);// null  已经调用这个方法了，但是已经进入调用方法了， 所以不会报错，但又不知道这个对象
                System.out.println("eating too much");
                return null;
            }
//            重新定义write方法
            if("write".equals(method.getName())) {
                System.out.println("my father is warden");
                return null;
            }

            
            return null;
        }
    };

/*
* 对这个实例对象生成一个代理对象
* 被代理后生成的对象，是通过People接口的字节码增强方式创建的类而构造出来的，他是一个临时构造的实现类对象
* loader  和 interfaces 基本就是决定了这个类是个怎么样的类 ，。而 h ，是 InvocationHandler决定了这个
* 代理类到底是多了什么功能
*
* 通过这些接口和类加载器，拿到这个代理类class。
* 然后通过反射，，复制拿到代理类的构造函数
* 最后通过这个构造函数 new 一个对象出来，同时用 InvocationHandler 绑定这个对象
* 最终实现可以在运行的时候才切入改变类的方法，而不需要预先定义它
* */
    /*Proxy
    * public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h)
    *   loader  - 定义代理类的类加载器
    *   interfaces -  代理类要实现的接口列表
    *   h - 指派方法调用的 调用处理程序
    *   返回： 一个带有代理类的 指定调用处理程序 的代理实例。它由指定的类加载器定义，并实现指定的接口
    * */
    Student sonOfDistrict = (Student) Proxy.newProxyInstance(ordinaryStudents.getClass().getClassLoader(),
        ordinaryStudents.getClass().getInterfaces(),handler );

    sonOfDistrict.eat();
    sonOfDistrict.write();
    }

}
class OrdinaryStudents implements Student {

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void run() {
        System.out.println("running");
    }

    @Override
    public void write() {
        System.out.println("writing");
    }
}


/*
* 其实就是JVM帮我们自动编写了一个 静态代理 类（不需要源码，可以直接生成字节码）
*   在代理类中传入 一个你原本要使用的对象的方法，也就是传入一个对象，用这个对象调用你要复写的方法， 然后再
* 修饰一些自己的东西，可以操控这个对象方法的执行。
* */

/*
* 小结：
*   Java标准库提供了动态代理功能，允许在运行期动态创建一个接口的实例；
*   动态代理是通过 Proxy 创建代理对象
*       Proxy.newProxyInstance(类加载器，要实现的接口，要调用的处理程序 InvocationHandler)
*   。。然后将接口方法 “代理” 给InvocationHandler 完成
*       InvocationHandler 接口 中 invoke(Object proxy,Method method,Object[] args)
*                                       proxy - 在其上调用方法的代理实例
* */