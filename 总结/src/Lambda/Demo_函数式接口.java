package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author chenjie
 * @date 2021/5/25-21:48
 */
public class Demo_函数式接口 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("南京","田径","北京");
        List<String> strings = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        });
        Comparator<String> com = String::compareTo;
//        String

    }
//  根据规则去过滤字符串     这个规则是 Predicate 的 test方法
    public static List<String> filterString(List<String> list, Predicate<String> pre) {
        ArrayList<String> filterList = new ArrayList<>();
        for (String s : list) {
            if(pre.test(s)) {
                filterList.add(s);
            }

        }
        return filterList;
    }
}
