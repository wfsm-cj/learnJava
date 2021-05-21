package 泛型;

import java.util.ArrayList;

/**
 * @author chenjie
 * @date 2021/5/20-11:03
 */
public class Genericity<V> {
    ArrayList<V> list = new ArrayList<>();

    public void addEle(V v) {
        list.add(v);
        System.out.println("list = " + list);
    }
/*
*  类上的泛型确定时间在创建对象的同时，只有创建了对象泛型才能使用
* 静态方法属于类
*   当静态方法被类名直接调用时，泛型也许还有具体类型确定，这个时候泛型不能使用，
* 结论： 静态方法要使用泛型，只能在方法上自定义泛型
* */

}
