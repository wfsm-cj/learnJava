package set集合;

import java.util.*;

/**
 * @author chenjie
 * @date 2021/5/20-14:28
 */
public class Demo_hashset {
    public static void main(String[] args) {
    /*    Set<String> set = new HashSet<>();
        set.add("a");
        set.add("1");
        set.add("05");
        set.add("a");

        System.out.println("set = " + set);

        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        for(String s : set){
            System.out.println("s = " + s);
        }*/

//        test();
        test0();
    }
    public static void test() {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
// 也可以通过 add()  返回的boolean 是否添加成功
        while (set.size() < 5) {
            int number = random.nextInt(99)+1;
            System.out.println(set.add(number));
        }
        System.out.println(set);
    }
//    list
    public static void test0() {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        Random random = new Random();
        while(list.size() < 2) {
            Integer number = random.nextInt(99)+1;
            ListIterator<Integer> it = list.listIterator();//迭代器不是实时更新的，会在创建迭代器的时候就固定了循环次数
            it.add(number);
//            System.out.println(list);
            System.out.println(it.hasNext());
            while(it.hasNext()) {
               Integer i = it.next();
                System.out.println("iiii"+i);
                System.out.println(list);

                if((i.equals(number))) {
                   it.remove();
               }
           }
        }

//        System.out.println(list);
    }
}
