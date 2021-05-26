package 装饰器模式;

/**
 * @author chenjie
 * @date 2021/5/26-9:31
 */
// 接口的实体类
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("rectangel");
    }
}
