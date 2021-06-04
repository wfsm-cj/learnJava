package 设计模式2.creationalPatterns.原型模式;

/**
 * @author chenjie
 * @date 2021/5/20-8:57
 */
public class CreateProtype extends Prototype{
    public CreateProtype(String id) {
        super(id);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new CreateProtype("1");
        Prototype p2 = p1.clone();
        System.out.println(p1 == p2);
        System.out.println("p2.getId() = " + p2.getId());
    }
}
