package 设计模式.单例模式;

/**
 * @author chenjie
 * @date 2021/6/1-20:12
 */
public class EnumSingletonTest {

//    EnumSingleton instance = EnumSingleton.INSTANCE
}

enum EnumSingleton {
    INSTANCE;
    public void print() {
        System.out.println("xxxx");
    }
}
