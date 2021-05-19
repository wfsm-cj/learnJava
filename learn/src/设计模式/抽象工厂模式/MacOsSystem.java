package 设计模式.抽象工厂模式;

/**
 * @author chenjie
 * @date 2021/5/19-21:31
 */
public class MacOsSystem implements  OperatingSystem{
    @Override
    public void printSytem() {
        System.out.println("this is  a mac os");
    }
}
