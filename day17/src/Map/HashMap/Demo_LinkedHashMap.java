package Map.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @author chenjie
 * @date 2021/5/21-15:13
 */
public class Demo_LinkedHashMap {
    /*
    * HashMap的子类
    *   LinkedHashMap
    * */
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"hi");
        map.put(11,"hi");
        map.put(6,"hello");
        map.put(3,"hi");
        System.out.println(map);

        LinkedHashMap<Integer,String> map1 = new LinkedHashMap<>();
        map1.put(1,"hi");
        map1.put(11,"hi");
        map1.put(6,"hello");
        map1.put(3,"hi");
        System.out.println(map1);

        /*
        * HashSet<T>
        *   LinkedHashSet<T>
        * */
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
    }
}
