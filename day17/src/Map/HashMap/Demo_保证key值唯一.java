package Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author chenjie
 * @date 2021/5/21-14:41
 */
public class Demo_保证key值唯一 {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("zs",20),"香港");
        map.put(new Person("zs",20),"新加坡");
        map.put(new Person("zs",20),"上海");

        System.out.println("map = " + map);

        System.out.println(new Person("zs", 20).hashCode());
        System.out.println(new Person("zs", 10).hashCode());
        System.out.println(new Person("z2s", 20).hashCode());

        

    }
}
