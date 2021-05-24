package 集合;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author chenjie
 * @date 2021/5/22-13:53
 */
public class Demo_TreeMap {
    /*
    *  SortedMap
    *       在内部对Key 进行排序， SortedKey 是接口， 它的实现类是 TreeMap
    * */
    /*
    * 使用 TreeMap 时， 放入的 key 必须实现 Comparable 接口
    *
    * 如果作为 key 的 class 没有实现 Comparable 接口，那么，必须在创建 TreeMap时同时指定一个自定义排序算法
    * */

    public static void main(String[] args) {
        Map<Person,Integer> map1 = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        map1.put(new Person("cj",26),1);
        map1.put(new Person("ss",18),2);
        map1.put(new Person("aa",44),3);
        System.out.println(map1);

        System.out.println(map1.get(new Person("cj", 26)));
        /*
        * TreeMap 不使用 equals() 和 hashCode()
        *      SortedMap 使用 compareTo() 来判断 key 是否相等。不需要通过 equals() 和 hashCode()来判断
        * */

        /*
        * 小结：
        *       SortedMap 在遍历时，严格按照key的顺序遍历，最常用的实现类是 TreeMap
        *       作为 SortedMap 的 key 必须实现 Comparable接口 ，或者 传入 Comparator
        *       要严格按照 compare() 规范实现比较逻辑， 不要忽略相等的情况 0  ， 否则TreeMap将不能正常工作
        * */
    }
}
