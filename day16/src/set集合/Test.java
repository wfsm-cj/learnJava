package set集合;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author chenjie
 * @date 2021/5/20-15:56
 */
public class Test {
    public static void main(String[] args) {
        /*
        * ？？？？？？？？？？？？？？
        * */
        ArrayList<String> list = new ArrayList<>();
        ListIterator<String> it = list.listIterator();
        list.add("abc");
//        it.add("abc");
        System.out.println(it.hasNext());

        System.out.println(list.listIterator().getClass());
    }
}
