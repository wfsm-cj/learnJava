package singleton;

/**
 * @author chenjie
 * @date 2021/5/14-12:29
 */

/*singleton  一人 独身
*  Singleton 是指仅仅被实例化一次的类。 Singleton 通常被用来代表一个无状态的对象
* 如函数，或者那些本质上唯一的系统组件
* */
public class Elvis {//猫王
    /*
    * 实现 Singleton 有两种常见方法
    *      都要保持构造器为私有，并导出共有的静态成员，以便允许客户端能够访问该类的唯一实例
    * */

    public static final Elvis INSTANCE = new Elvis();
    /*
    公有域方法
    * 构造器仅被调用一次，用来实例化 共有的静态的 Elvis.INSTANCE
    * 不设置 public 和 protected 的构造器，保证了 Elvis.INSTANCE 全局唯一性
    * 一旦类被实例化，将只会存在一个 Elvis 实例
    * */
    private Elvis(){}


    /*
    静态工厂方法
    * 第二种方法，公共的成员是个静态工厂方法
    *       对于静态方法 Elvis.getInstance 的所有调用，都会返回同一个对象引用，所以，
    * 永远不会创建其他的 Elvis 实例
    * */
    public static Elvis getInstance() {
        return INSTANCE;
    }
    /*
    **
    * 公有域方法优势：
    *       1，API 很清楚的表名了这个类是一个 Singleton
    *       2，简单
    *
    * 静态工厂方法的优势就在于：
    *       1,它提供了灵活性，在不改变其 API 的前提下，我们可以改变该类是否应该为 Singleton 的想法
    * 可以修改返回的实例
    *       2,如果应用程序需要，可以编写一个泛型 Singleton 工厂 (generic singleton factory)
    *        3,可以通过方法引用 （method  reference） 作为提供者
    *
    * ------- 2,3 没看懂
    * */

    public static void main(String[] args) {
    }

}
