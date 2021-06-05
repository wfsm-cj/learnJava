package 设计模式2.StructuralPatterns.桥接模式;

/**
 * @author chenjie
 * @date 2021/6/4-15:37
 */
public class Demo_廖雪峰 {
    /*
    * 将抽象部分与它的实现部分分离，使他们都可以独立的变化
    * 桥接模式就是为了避免直接继承带来的子类爆炸
    * 桥接模式通过分离一个抽象接口和它的实现部分，使得设计可以按两个维度独立扩展
    *
    * 对于两个独立变化的维度，使用桥接模式再适合不过了
    * */
    /*
    * 在桥接模式中，首先把 Car 按品牌进行子类化。但是，每个品牌选择什么发动机，不再使用
    * 子类扩充，而是通过一个抽象的“修正” 类，以组合的形式引入
    * 这里就是 将  品牌 和 燃料 抽象成两个独立的维度
    * */

    public static void main(String[] args) {
        RefinedCar car = new BossCar(new HybridEngine());
        car.drive();
    }
}

// 定义抽象类 Car 。。它引用一个 Engine
abstract class Car {
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();

  /*  public void drive() {
        this.engine.start();
        System.out.println("Drive" + getBrand() + "car...");
    }

    public abstract String getBrand();*/
}

interface Engine {// 燃料
    void start();
}

// 在一个“修正” 的抽象类 RefinedCar 中定义一些额外操作  refine:精炼，提纯，改善
abstract class RefinedCar extends Car {
    // 没看懂为什么要使用一个修正的抽象类
// 因为：桥接模式需要将抽象部分 和 实现部分分离。使他们都可以独立的变化
    public RefinedCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        this.engine.start();
        System.out.println("Drive " + getBrand() +"car ...");

    }
    public abstract  String getBrand(); // 品牌

}

//  这样一来，最终的不同品牌继承自 RefinedCar
class BossCar extends RefinedCar {
    public BossCar(Engine engine) {
        super(engine);
    }

    @Override
    public String getBrand() {
        return "boss";
    }
}

// 针对每一种引擎，继承自 Engine
class HybridEngine implements Engine {

    @Override
    public void start() {// hybrid  混合的，杂交的
        System.out.println("start Hybrid engine");
    }
}
