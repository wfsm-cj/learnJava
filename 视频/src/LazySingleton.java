/**
 * @author chenjie
 * @date 2021/6/3-20:08
 */
public class LazySingleton {
    private volatile static LazySingleton instance;
    private LazySingleton(){}

    public LazySingleton getInstance(){
        if(instance == null) {
            synchronized (LazySingleton.class){
                if(instance == null) {
                    instance = new LazySingleton();

                }
            }
        }
        return  instance;
    }
}
