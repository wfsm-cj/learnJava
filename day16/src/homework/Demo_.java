package homework;

import java.util.*;

/**
 * @author chenjie
 * @date 2021/5/21-9:20
 */
public class Demo_ {
    public static void test() {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        HashSet<String> tels = new HashSet<>();
        for (String str : strs) {
            tels.add(str);
        }
        Iterator<String> it = tels.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
    public static void main(String[] args) {
//        test();
//        test0();
        test2();
    }

    public static void test0() {
        Random random = new Random();
        int blue = random.nextInt(16) + 1;
        TreeSet<Integer> reds = new TreeSet<>(new Comparator<Integer>() {
//            Comparator 重新排序 Integer
            @Override
            public int compare(Integer o1, Integer o2) {
//                既能去重复，又能生成
                return o1 - o2 == 0? 0 : 1;
            }
        });
        while(reds.size() < 6 ) {
            int red = random.nextInt(33) + 1;
            reds.add(red);
        }
        System.out.println("系统红色球："+ reds);

        Scanner sc = new Scanner(System.in);
        System.out.println("输入篮球" + blue);
        int userBlue = sc.nextInt();

        TreeSet<Integer> userReds = new TreeSet<>(new Comparator<Integer>() {
            //            Comparator 重新排序 Integer
            @Override
            public int compare(Integer o1, Integer o2) {
//                既能去重复，又能生成
                return o1 - o2 == 0? 0 : 1;
            }
        });

       while(userReds.size() < 6) {
           System.out.println("input red");

           int red = sc.nextInt();
           userReds.add(red);
       }

       if(userBlue != blue) {
           System.out.println("sorry");
       }else{
//           把 set 集合转为  Array  就有索引了
           Integer[] intUserReds =  userReds.toArray(new Integer[0]);
           System.out.println(intUserReds.length);
       }
/*
* Set存取无序，尤其是 HashSet  但是 HashSet有一个子类  LinkedHashSet
*   子类在作用和使用场景上，和 HashSet 完全一致，唯一不同的 LinkedHashSet底层是双向链表
* 效果：可以保证元素存取有序。。没有索引
*
* */


    }
    public static void test2() {
        HashSet<Integer>  set  = new HashSet<>();
        set.add(14);
        set.add(1);
        set.add(14);
        set.add(17);
        System.out.println(set);
        set = new LinkedHashSet();
        set.add(14);
        set.add(1);
        set.add(14);
        set.add(17);
        System.out.println(set);
    }
}
