package 设计模式2.creationalPatterns.抽象工厂模式;


/**
 * @author chenjie
 * @date 2021/5/19-21:20
 */
public class AppleFactory implements ProductionFactory {
    @Override
    public Computer createComputer() {
        return new MacbookProComputer();
    }

    @Override
    public OperatingSystem createSystem() {
        return new MacOsSystem();
    }
}
