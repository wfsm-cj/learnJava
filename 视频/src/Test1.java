/**
 * @author chenjie
 * @date 2021/6/3-20:55
 */
public class Test1 {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.hashCode());
        test(o);
        System.out.println(o.hashCode());
    }
    public static void test(Object s) {// 把引用赋值给 s
        s = new Object();// 只是换了个引用，并没有修改传入参数的引用
        System.out.println(s.hashCode()+"----s");
    }
}
