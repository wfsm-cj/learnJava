package 设计模式2.StructuralPatterns.桥接模式;

/**
 * @author chenjie
 * @date 2021/6/4-15:09
 */
public class Demo {
    /*
    * 注意事项：
    *      对于两个独立变化的维度，使用桥接模式再适合不过了
    *
    * */
}

// 创建桥接实现接口
interface DrawAPI {
    public void drawCircle(int radius, int x, int y);
}

// 创建实现 DrawAPI 接口的 实体桥接实现类
class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing  red  circle  radius = " + radius + ", " +
                "x = " + x + ", y = " + y);
    }
}

class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing green circle radius = " + radius +
                ", x = " + x + ", y = " + y);
    }
}

// 使用DrawAPI 接口创建抽象类 Shape
abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

// 实现了 Shape 抽象类的实体类
class Circle extends Shape {

    private int x,y,radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}