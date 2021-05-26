package 装饰器模式;

/**
 * @author chenjie
 * @date 2021/5/26-9:32
 */
// 实体类 circle
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("circle");
    }
}
