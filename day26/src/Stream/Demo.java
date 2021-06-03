package Stream;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author chenjie
 * @date 2021/6/2-14:01
 */
public class Demo {
    /*
    * Stream接口  提供了一些对容器数据进行操作的规则
    *   集合
    * */
    /*
    * Collection 的获取：
    *   调用 stream() 方法即可， 返回 Stream 接口类型的实现类对象
    *   Stream 是default 默认方法，
    *
    * Map 的获取：
    *   keySet().stream()
    *   values().stream()  // values() 获取所有的value值，放到单列集合
    *   entrySet().stream()
    *
    * 数组的获取
    *   Stream.of(T...values)
    *           可变参数就是数组
    * static<T>  Stream<T>  of(T...values)
    * */

    public static void main(String[] args) {
     /*   ArrayList<String> list =new ArrayList<>();
        list.add("a");
        list.add("b");
        Stream<String> str = list.stream();
        System.out.println(str.count());*/
        /*
        * long count()
        *       返回流的元素数
        * */

      /*  Set<Integer> set = new HashSet<>();
        Stream<Integer> str2 = set.stream();

        String[] arr = {"a","b"};
        Stream<String> str3 = Stream.of(arr);
        System.out.println(str3.count());*/

        /*
        * Stream 中常用方法
        *   Stream filter(Predicate p)
        *      按照指定的条件对 stream 中的数据进行过滤。满足保留
        * */
        String[] arr1 = {"mgh","yj","dd","hht","hh"};
        Stream<String> stream = Stream.of(arr1);
        /*
        * Predicate接口
        *      boolean test(T t)
        * */
        System.out.println(stream.filter((x) -> {
            return x.length() == 2;
        }).count()); // count() 返回的是long 型
//        原容器的数据不会改变

//      void   forEach(Consumer c)  返回void 终结方法，后面不能链式调用了
        Stream<String> s = Stream.of(arr1).filter(x -> x.length() == 2);
        /*
        * Consumer
        *  void  accept(T t)
        * */
       /* s.forEach((x) -> {
            System.out.println(x);
        });*/
        System.out.println(s+"~~~~~~~");
        s.forEach( x -> System.out.println(x));
//        s.forEach( x -> System.out.println(x));
        System.out.println(s+"----");
        /*
        * Stream limit(int num)
        *       只获取Stream 中的前num个元素
        * */
//        s.forEach(System.out::println);

        /*
        * Stream skip(int num)
        *       跳过前 num 个数据获取之后
        * Stream map(Function fun)
        *       Function
        *           R apply(T)
        * */
//        s.map(x -> x.getBytes()).forEach(System.out::println);

        /*
        * Stream concat(Stream s1,Stream s2)
        *       拼接两个流数据
        * */
    }
}
