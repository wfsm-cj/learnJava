package 设计模式.抽象工厂模式;


/**
 * @author chenjie
 * @date 2021/5/19-21:19
 */
public class MsFactory implements ProductionFactory {
    @Override
    public Computer createComputer() {
        return new SurfaceBookComputer();
    }

    @Override
    public OperatingSystem createSystem() {
        return new Windows8System();
    }
}
