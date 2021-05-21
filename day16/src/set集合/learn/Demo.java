package set集合.learn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

/**
 * @author chenjie
 * @date 2021/5/20-19:54
 */
public class Demo {
    public static void main(String[] args) {
//
        Map<String,Integer> map = new HashMap<>();
        String key1 = "a";
        map.put(key1,123);

        String key2 = new String("a");
        System.out.println(map.get(key2));

    }
}
