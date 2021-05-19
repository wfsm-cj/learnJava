package 设计模式.简单工厂模式;

/**
 * @author chenjie
 * @date 2021/5/19-20:58
 */
public class ComputerFactory {
    public Computer createComputer(String type){
        Computer c = null;
        /*
        * 简单工厂 这里会 逐个判断， 每次新添加进的 实例，都会去修改这个 工厂
        * */
        if("macbook".equals(type)) {
            c = new MacbookProComputer();
        }else if("surface".equals(type)){
            c = new SurfaceBookComputer();
        }
        return c;
    }
}
