package 设计模式2.creationalPatterns.单例模式;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author chenjie
 * @date 2021/6/1-19:30
 */
public class HugrySingletonTest{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*
         * 类加载过程
         *     加载，链接，初始化
         * */
        System.out.println(HungrySingleton.class);//为什么调用 .class 不会调用静态方法

        /*
         * 触发的方式有很多种， 访问静态变量，反射访问类,类是启动类即main函数所在类，直接new操作，访问静态方法。
         * 初始化一个类的子类等。。。有些时候不是我们真正需要就被触发了
         * */


//        用反射 -->  私有构造器 --> 创建实例
        /*
        * 通过反射，会产生多例子
        * */
        Constructor<HungrySingleton> con = HungrySingleton.class.getDeclaredConstructor();
        con.setAccessible(true);
        HungrySingleton h = con.newInstance();
        System.out.println(h == HungrySingleton.getInstance()); // false
    }
        }
 class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){
        if(instance != null) { // 有可能通过反射--> 调用构造函数 --> 来创建的对象
            throw new RuntimeException("单例不允许多个实例");
        }


    }

    public static HungrySingleton getInstance(){
        return instance;
    }
    static{
        System.out.println("HungrySingleton init");
    }

}
