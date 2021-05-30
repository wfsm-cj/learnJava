package 多线程.单列;

/**
 * @author chenjie
 * @date 2021/5/28-15:19
 */
public class SingletonOldMan {

    private SingletonOldMan(){}
    public static final SingletonOldMan  s = new SingletonOldMan();
}
