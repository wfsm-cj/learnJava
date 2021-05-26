package 装饰器模式;

/**
 * @author chenjie
 * @date 2021/5/26-9:33
 */
//  装饰者   接口的抽象装饰类    可以是抽象类也可以是具体类，比如: FileterInputStream
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;//被装饰的对象， 在这个实体类上进行扩展

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
