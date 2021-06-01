package 反射;

/**
 * @author chenjie
 * @date 2021/5/31-10:26
 */
public class Demo {
    /*
    * 虚拟机类加载机制
    *   1，加载
    *   将class文件读入内存，并为之创建一个 Class 对象
    *   2，连接
    *       验证是否有正确的内部结构，再将类的二进制数据中的
    * 符号引用替换为直接引用
    *       。。。
    *   3，初始化
    *       判断是否有父类，先初始化直接父类，然后初始化
    * */

    /*
    * 类的初始化时机
    *   1创建类的实例
    *   2类的静态成员使用
    *   3类的静态方法调用
    *   4使用反射方式来强制创建某个类或接口对应的 java.lang.Class对象
    *   5初始化某个类的子类
    *   6直接使用 java.exe 命令来运行某个主类
    * */

    /*
    * 类加载器
    *   引导类加载器 BootStrap Classloader
    *       java 核心类的加载 如：System ,String
    *   扩展类加载器 Extension ClassLoader
    *       负责JRE的扩展目录中 jar包的加载 JRE 中lib目录下的 ext目录
    *   系统类加载器 Application ClassLoader
    *       在JVM 启动时加载来自 java命令的 class 文件，以及 classpath
    * */

    /*
    * 如果只有一个类加载器，性能就会很差
    *   双亲委派机制，
    *       先看 Application ClassLoader
    *       如果没找到 依次往上找
    *       Extension ClassLoader
    *       Bootstrap ClassLoader
    *
    *       ....
    *       然后返回
    *   如果都加载失败，就会抛出 ClassNotFountException异常
    * */
    /*
    * 反射：
    *   运行状态的类
    * 反射 能获取 类 的所有方法, 所有，包括注解
    * 配置文件中要用到两个类，配置文件不能new 对象， 可以用反射
    * */

    /*
    * 动态效果  ，， 类被加载进去了
    *   使用 Class 对象，获取类型中所有的需要的成员，，
    * 这种使用方式称为反射机制
    * */

    /*
    * 从类加载器中拿出来，对象的信息、。 反射
    * */
    /*基本数据类型都有 class 对象
    * 类名.class
    * */
}
