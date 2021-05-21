package 泛型.网站;

/**
 * @author chenjie
 * @date 2021/5/20-22:16
 */
public class Demo1<T> {
    /*
    *  equals(T t)方法实际上会被擦拭成 equals(Object t),而这个方法是继承自 Object的，编译器会阻止一个实际上会变成
    * 覆写的泛型方法定义
    * */
//    public boolean equals(T t) {
//        return false;
//    }
}
