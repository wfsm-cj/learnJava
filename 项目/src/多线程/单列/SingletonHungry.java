package 多线程.单列;

/**
 * @author chenjie
 * @date 2021/5/28-15:16
 */
public class SingletonHungry {

    private SingletonHungry() {}

    private static SingletonHungry sh = new SingletonHungry();

    public static SingletonHungry getInstance(){
        return sh;
    }
}
