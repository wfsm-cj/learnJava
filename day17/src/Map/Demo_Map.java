package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author chenjie
 * @date 2021/5/21-10:25
 */
public class Demo_Map {
    public static void main(String[] args) {
        /*
        * Map 常用方法
        *   put(K,V)   返回以前key 对应的值 ，如果没有返回null
        *         如果 K 值在map集合中不存在， 那么 put方法表示新增价值对数据
        *
        *   V remove(K)  删除
        *     V  get(K)
        * boolean  containsKey(Object key)
        * */
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        System.out.println(map.put(2, "b"));
        map.put(3,"c");
        System.out.println(map.remove(3));
        System.out.println(map);

        System.out.println(map.get(2));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.get(5));
        /*
        *  void clear()
        * boolean isEmpty()
        * int size()
        * */
        System.out.println(map.size());


        /*
        * Map遍历
        *    键遍历（KeySet）
        * */
        HashMap<Integer,String> dates = new HashMap<>();
        dates.put(1,"a");
        dates.put(2,"b");
        dates.put(3,"c");
        dates.put(4,"d");
        dates.put(5,"e");

        Set<Integer> set = dates.keySet();
        System.out.println("--------------------");
        for (Integer key : set) {
            System.out.println(dates.get(key));

        }
        /*
        * 嵌套类
        *   Map.Entry<K,V>
                映射项（键值对）
                * Set<Map.Entry<K,V>>  值 = map.entrySet()
        *
        * */
        Set<Map.Entry<Integer,String>> all = dates.entrySet();
        for (Map.Entry<Integer, String> entry : all) {
            String s = entry.getKey()+" "+entry.getValue();
            System.out.println(s);
        }

    }

}
