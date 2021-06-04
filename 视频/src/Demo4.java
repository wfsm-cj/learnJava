import java.io.File;

/**
 * @author chenjie
 * @date 2021/6/3-20:34
 */
public class Demo4 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("a");
        StringBuffer b = new StringBuffer("b");
        System.out.println("a = " + a.hashCode());
        System.out.println("b = " + b.hashCode());
        test(a,b);
        System.out.println("a = " + a.hashCode());
        System.out.println("b = " + b.hashCode());
        System.out.println(a +"  "+ b);

    }
    public static void test(StringBuffer x,StringBuffer y) {
        x.append(y);
        System.out.println(x+"--- "+ y);
        y =x;
//        System.out.println(x.hashCode()+"--- "+ y.hashCode());

    }
}
