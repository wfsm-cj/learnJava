package 设计模式2.StructuralPatterns.装饰器模式;

/**
 * @author chenjie
 * @date 2021/6/4-21:06
 */
public class Demo {
    /*
    * 装饰者模式(Decorator Pattern)
    *   允许向一个现有的对象添加新的功能，同时又不改变其结构。
    *   它是作为现有的类的一个包装
    *
    * 意图：
    *   动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更加灵活
    * 何时使用：
    *   在不想增加很多子类的情况下扩展类
    * 如何解决：
    *   将具体功能职责划分，同时继承装饰者模式
    * 关键代码：
    *   1， Component 类充当抽象角色，不应该具体实现
    *   2，修饰类 引用和继承 Component 类，，具体扩展类重写父类方法
    * 应用实例：
    *   1，孙悟空有72变，当它变成“庙宇”后，它的根本还是一只猴子，但是他又有了庙宇的功能
    *
    * 优点：
    *   装饰类和被装饰类可以独立发展，不会相互耦合。
    *
    * 缺点：
    *   多层装饰比较复杂
    *
    * 使用场景：
    *       1，扩展一个类的功能
    *       2，动态增加功能，动态撤销功能
    * 注意事项：
    *   可代替继承
    * */

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        redRectangle.draw();
        redCircle.draw();
        circle.draw();
    }
}

//创建一个接口
interface Shape {
    void draw();
}

// 创建接口的 实现类  rectangle:矩形，长方形
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("shape Rectangle");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("shape circle");
    }
}

// 创建实现了Shape接口的 抽象装饰类
abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}

// 抽象装饰类的  子类，，实体装饰类
class RedShapeDecorator extends  ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();// 最初实体类的实现
        setBorder(decoratedShape);// 装饰类想要添加的功能
//        既实现了最初的类的方法，又添加了自己想要的功能
    }

    private void setBorder(Shape decoratedShape) {
        System.out.println("border color is red");
    }
}
