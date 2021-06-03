package 新特性.接口新特性;

/**
 * @author chenjie
 * @date 2021/6/1-10:28
 */
public class InterfaceImpl implements Demo {
    @Override
    public void fun() {
        System.out.println("interfaceImpl fun");
    }

    @Override
    public void eat() {// 重写接口里的方法，以public 修饰
        System.out.println("interfaceImpl eat");

        /*
        * 类实现多个接口，有矛盾
        * 特殊情况
        *   多个接口有相同的默认方法
        *   就要求这个实现类，必须重写这个 默认方法。。。
        *   如果想使用接口的默认方法：
        *   语法结构：父接口名.super.父接口中默认方法（实际参数）
        *
        * 一个类继承一个父类的前提下，还可以同时实现多个接口 "父优先"
        *   不管方法调用，还是方法的重写，一律以父类为第一使用顺位
        *
        * */
        /*
        *
        * 实现类不能继承到父接口中的静态方法
        *   如果出现了继承的矛盾性，解决方法：就是实现类重写的这个矛盾方法
        *
        * 接口存在静态方法作用：
        *       让接口自己用，不想给子类用
        * */
        /*
        * jdk9 私有方法
        *    主要是用来进一步封装代码，提升相关代码安全性的手段
        *   私
        *     只能提供给接口和静态方法和默认方法使用
        * */
        Demo.super.eat();
    }

    public static void main(String[] args) {
//        Math.addExact()
    }
}
