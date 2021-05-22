package 泛型.网站;


import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author chenjie
 * @date 2021/5/20-11:44
 */
public class Pair<T> {
    private T name;
    private T obj;
    private T gendar;

    public Pair(T name, T gendar) {
        this.name = name;
        this.gendar = gendar;
    }

    public Pair(T name, Class<T> objClass) throws IllegalAccessException, InstantiationException {
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

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getGendar() {
        return gendar;
    }

    public void setGendar(T gendar) {
        this.gendar = gendar;
    }

    /*
    *  不能直接 创建泛型数组 因为擦拭后代码变为 Object[] --  return new T[];
    * */
    T[] createArray(Class<T> cls) {
        return (T[])Array.newInstance(cls,5);
    }

    /*
    * 我们还可以利用可变参数创建泛型数组 T[]
    * */

    static<K> K[] asArray(K...objs) {
        return objs;
    }
}
