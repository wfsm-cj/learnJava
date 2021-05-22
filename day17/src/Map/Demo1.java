package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author chenjie
 * @date 2021/5/21-14:08
 */
public class Demo1 {
    public static void main(String[] args) {
      /*  HashMap<Character,Integer> map = new HashMap<>(24);
        String str = "abcdsscchdyti12";
        char[] arr = str.toCharArray();
        Set<Character> set = map.keySet();

//        System.out.println(map);
        for (char c : arr) {
            if(c > 'a' && c <'z') {
                map.put(c,0);
            }
        }
        for (Character character : set) {
            for (char c : arr) {
                    if(c == character) {
                        map.put(c,map.get(c) + 1);
                    }


            }
        }
        System.out.println(map);*/

test();
    }
    
    public static void test() {
        String s ="abcdsscchdyti12";
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if(map.containsKey(c)) {//是否包含这个 key
                map.put(c,map.get(c) + 1);
            }else{
                map.put(c,1);
            }
        }

        Set<Character> set = map.keySet();
        for (Character character : set) {
            Integer value = map.get(character);
            System.out.println(character + "有" + value +"个");
        }
    }
}
