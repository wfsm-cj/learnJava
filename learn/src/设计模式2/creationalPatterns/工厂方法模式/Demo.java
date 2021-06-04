package 设计模式2.creationalPatterns.工厂方法模式;

/**
 * @author chenjie
 * @date 2021/5/19-21:09
 */
public class Demo {
    /*
    * 工厂模式
    *       工厂方法模式是针对每个产品提供一个工厂类，在客户端中判断使用哪个工厂类去创建对象。
    *
    *   实例抽象成接口   工厂也抽象成接口
    *
    * 工厂模式横向扩展很方便，假如该工厂又有新的产品 Macbook Air 要生产，那么只需要创建
    * 相应的工厂类，和产品类去实现抽象工厂接口和抽象产品接口即可。而不用去修改已经存在的代码
    * */

    public static void main(String[] args) {
        ComputerFactory cf = new AppleFactory();
       Computer computer = cf.createComputer();
       computer.printComputer();
    }
}
