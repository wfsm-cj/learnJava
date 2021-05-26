package 装饰器模式;

/**
 * @author chenjie
 * @date 2021/5/26-9:37
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("============redBorder");
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
    ShapeDecorator redCircle = new RedShapeDecorator(circle);
    ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
