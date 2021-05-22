package homework;

import java.util.*;

/**
 * @author chenjie
 * @date 2021/5/21-19:12
 */
public class Demo {
    public static void test() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("cj");
        list.add("ccc");
        HashMap<Character,Integer> map = new HashMap();
        for (String s : list) {
            char[] ch  = s.toCharArray();
            for (char c : ch) {
                if(map.containsKey(c)) {
                    map.put(c,map.get(c) + 1);
                }else{
                    map.put(c,1);
                }
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
test1();
    }
    public static void test1() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zsf");
        map.put(2,"zzr");
        map.put(3,"wf");
        map.put(4,"mjst");

        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }
        map.put(5,"lxh");
        map.remove(1);
        map.put(2,"zl");
    }
}
