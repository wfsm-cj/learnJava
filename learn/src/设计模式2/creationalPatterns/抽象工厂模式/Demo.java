package 设计模式2.creationalPatterns.抽象工厂模式;



/**
 * @author chenjie
 * @date 2021/5/19-21:29
 */
public class Demo {
    public static void main(String[] args) {
        ProductionFactory pf = new AppleFactory();
        Computer computer = pf.createComputer();
        OperatingSystem os = pf.createSystem();

        /*抽象工厂模式
        *   缺点在于产品类的扩展，将会是十分费力， 假如在需要加入新的产品，那么几乎所有
        * 的工厂类都需要进行修改，所以在使用抽象工厂模式时，对产品等级结构的划分是十分重要的
        *
        * */

        /*
        *  无论是简单工厂模式，工厂模式方法，还是抽象工厂模式，它们都属于工厂模式，在形式和特点上也是极为相似
        * 它们的最终目的都是为了解耦。
        * 所以，在使用工厂模式时，只需要关心降低耦合度的目的是否达到了，使用工厂方法后，调用端的耦合度大大降低了，并且
        * 对于工厂来说，是可以扩展的。。，如果想组装其他的产品，只需要再增加一个工厂类的实现就可以。
        * 但是 工厂类在加入新的种类的产品 会非常费力， 所有的工厂类都要为这个新种类产品，而进行修改，，
        * 并且还要添加这个新种类产品 在每个不同的工厂中的实现类。。 改的内容就会超级多
        * */

    }
}
