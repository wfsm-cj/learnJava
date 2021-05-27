package 单例模式;

/**
 * @author chenjie
 * @date 2021/5/26-17:34
 */
// 饿汉式    一进去就创建了这个对象
public class SingletonHungry {
//    1，构造方法私有化     ： 为了不让你进行对象的创建
//    2, 私有构造在本类可以用，在当前类型中创建出一个唯一的对象
    private SingletonHungry() {

    }
//    外部不能创建这个类，只能通过静态来访问。 但是用 调用的时候可以修改 ，，不安全
    private static SingletonHungry sh = new SingletonHungry();
//    私有后，对这个唯一的私有成员提供对外的公共访问方式
    public static SingletonHungry getInstance(){
        return sh;
    }

}
