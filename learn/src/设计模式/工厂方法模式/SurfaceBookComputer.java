package 设计模式.工厂方法模式;


/**
 * @author chenjie
 * @date 2021/5/19-20:59
 */
public class SurfaceBookComputer implements Computer {
    @Override
    public void printComputer() {
        System.out.println("this is a surface book");
    }
}
