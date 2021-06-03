package 设计模式.单例模式;

/**
 * @author chenjie
 * @date 2021/6/1-19:46
 */
public class InnerClassSingleton {
    /*
    * 需要的时候才初始化，写在内部类里面。。本质上就是懒加载
    * */
    static {
        System.out.println("inner class singleton init");
    }
    private static class singletonHolder {

//        内部类
        private static InnerClassSingleton instance = new InnerClassSingleton();

        private  singletonHolder() {

        }

        static {
            System.out.println("singleton Holder init");
        }

    }
    public static InnerClassSingleton getInstance() {
        return singletonHolder.instance;
    }
    public static String name = "23";
    public static void main(String[] args) {
        /*
        * 只会初始化 InnerClassSingleton
        * */
        System.out.println(InnerClassSingleton.name);//inner class singleton init

        InnerClassSingleton.getInstance(); // 这个内部类才会初始化 ，调用内部类创建了实例
    }
}
