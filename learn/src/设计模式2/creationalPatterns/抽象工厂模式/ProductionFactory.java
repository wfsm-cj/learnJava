package 设计模式2.creationalPatterns.抽象工厂模式;

/**
 * @author chenjie
 * @date 2021/5/19-21:18
 */
public interface ProductionFactory {
    public Computer createComputer();
    public OperatingSystem createSystem();
}
