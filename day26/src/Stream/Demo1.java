package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author chenjie
 * @date 2021/6/2-15:31
 */
public class Demo1 {
    /*
    * Stream终结型方法 ， 使用了之后不能再操作Stream,不然会报错
    *  long count()
    *   forEach(Consumer con)
    *       void accpet(T t)
    *
    * */
    public static void main(String[] args) {
        String[] arr1 = {"mgh","yj","dd","hht","hh"};
        Stream<String> stream = Arrays.stream(arr1);
        /*
        * Array 和 Stream 转换
        *   Stream Arrays.stream(arr)
        *       将流资源数据同步到数组中
        *  Object[] stream.toArray()
        *
        * */
        String[] sArr = (String[]) stream.filter(x -> x.length() == 2 ).toArray();

        /*
        *
        *   collect(Collector c)
        *   获取List集合 ： Collectors.toList()
        * 获取Set集合 ：  Collectors.toSet()
         */
    }
}
