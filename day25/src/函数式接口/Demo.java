package 函数式接口;

import java.util.function.Consumer;

/**
 * @author chenjie
 * @date 2021/6/1-16:22
 */
public class Demo {
    /*
    * Consumer<T>  消费型接口
    *       void accept(T t);
    *
    * Supplier<T>   供给型接口
    *       T get();
    *
    * Function<T,R>  函数型接口
    *   R apply(T t);
    *
    * Predicate<T>  断言型接口
    *   boolean test(T t);
    *       判断 t 是否符合某种规则
    * */

    public static void main(String[] args) {
        /*
        * Consumer<T>
        *    void accept(T t)
        * */
//        接口传入到函数中，传入接口中的方法
        test(500,x -> System.out.println("大宝剑"));
    }
//    /*
//      Consumer<T>
//            void accept()
//    */  money 钱，  con - 钱的处理方式
    public static void test(double money, Consumer<Double> con) {
        con.accept(money);
    }
}
