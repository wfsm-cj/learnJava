package 泛型.网站;


import java.util.ArrayList;

/**
 * @author chenjie
 * @date 2021/5/20-11:44
 */
public class Pair<T> {
    private T name;
    private T obj;

    public Pair(T name,Class<T> objClass) throws IllegalAccessException, InstantiationException {
        this.name  = name;
        this.obj = objClass.newInstance();
    }
    ArrayList<T> list = new ArrayList<>();

    public static<T> void method(T name) {
        System.out.println(name);
    }

    public void print() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Pair.method(123);
//        Pair<String> pair = new Pair<>("12",new String(123));

    }
}
