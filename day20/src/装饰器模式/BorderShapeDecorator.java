package 装饰器模式;

/**
 * @author chenjie
 * @date 2021/5/26-9:58
 */
public class BorderShapeDecorator extends ShapeDecorator{
    public BorderShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" xxx border");
    }
}
