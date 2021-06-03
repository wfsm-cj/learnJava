package 新特性.接口新特性;

/**
 * @author chenjie
 * @date 2021/6/1-10:18
 */
public interface Demo {

    /*
    * 接口新特性
    *   增加内容
    *       jdk8: default 默认方法 ， static 静态方法
    *       jdk9： private 私有方法
    *
    * 默认方法。静态方法，私有方法。。。 实现类可以不重写
    *   为了维护
    * */
    /*
    * 默认方法 default
    * 修饰符 default
    *       表示方法是默认方法，不是权限修饰符
    * */
//    静态常量  public static final int I = 10;
    int I = 10;
//    抽象方法  public abstract void fun();
    void fun();

//    在jdk8下可以定义出默认方法
    default  void eat() {
        System.out.println("default method");
        /*
        * 默认方法，可以被实现类直接继承使用，不会强制实现类重写
        * 当然，实现类也可以从父接口实现默认方法
        * */
    }
}

