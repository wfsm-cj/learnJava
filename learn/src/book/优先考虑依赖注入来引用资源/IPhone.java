package book.优先考虑依赖注入来引用资源;

/**
 * @author chenjie
 * @date 2021/5/15-10:55
 */
public class IPhone implements Phone {
    @Override
    public void playGame() {
        System.out.println("iphone play game");
    }

    @Override
    public void pay() {
        System.out.println("iphone pay");
    }

    @Override
    public void call() {
        System.out.println("iphone call");
    }

    public static Phone getInstance() {
        return new IPhone();
    }
}
