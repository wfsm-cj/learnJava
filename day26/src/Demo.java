import java.util.function.Function;

/**
 * @author chenjie
 * @date 2021/6/2-10:36
 */
public class Demo {
    /*
    * Function<R,T>
    *   R apply(T t)
    *
    * addThen() 方法
    *   将前一个方法的结果，当做下一个方法传入的参数
    * default<V>  Function<T,V> addThen(Function  after)
    *   一个组合函数首先应该调用次函数
    * */

    public static int testFun(String x, Function<String,Integer> fun, Function<Integer,Integer> fun2,Function<Integer,Integer> fun3){
//        return fun2.apply(fun.apply(x));
        return fun.andThen(fun2.andThen(fun3)).apply(x);
//        addThen() 前一个方法的结果，当下一个方法的参数传入 .. 先调用fun 在调用andThen 里面的函数
    }

    public static void main(String[] args) {
        System.out.println(testFun("2", (x) -> {
            return Integer.parseInt(x);
        }, (y) -> {
            return y + 3;
        },(z) -> {
            return z + 2;
        }));
    }
}
