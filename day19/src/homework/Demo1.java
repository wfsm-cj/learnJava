package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author chenjie
 * @date 2021/5/25-20:34
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123dd");
        list.add("aaa");
        list.add("w1");

        Iterator<String> it = list.listIterator();
        while(it.hasNext()) {
            char[] ch = it.next().toCharArray();
            for (char c : ch) {
                if(c >= '0' && c <= '9') {
                    it.remove();
                    break;
                }
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
