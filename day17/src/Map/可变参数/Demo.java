package Map.可变参数;

/**
 * @author chenjie
 * @date 2021/5/21-16:09
 */
public class Demo {
    public static void main(String[] args) {
        Base base = new Sub();
        base.print("hello");

        Sub sub = new Sub();
//        sub.print();
        test("");
        test("Aa","bb");
    }

    public static void test(String s,String...ss) {
        System.out.println(ss.getClass());
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }
}

class Base {
    void print(String...args) {
        System.out.println("base test");
    }
}
class Sub extends  Base {
    @Override
    void print(String[] args) {
        super.print("sub test");
    }
}
