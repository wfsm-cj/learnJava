package 设计模式2.creationalPatterns.工厂方法模式;

/**
 * @author chenjie
 * @date 2021/5/19-21:20
 */
public class AppleFactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new MacbookProComputer();
    }
}
