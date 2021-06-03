import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author chenjie
 * @date 2021/6/2-11:22
 */
public class Demo1 {

    public static ArrayList<Integer> testPre(ArrayList<Integer> list, Predicate<Integer> pre) {
        ArrayList<Integer> target = new ArrayList<>();
        for (Integer item : list) {
            if(pre.test(item)) {
                target.add(item);
            }else{
            }
        }
        return  target; // 把筛选出来的 返还回去
    }
// 同时满足两个条件
        public static void test() {

        }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(22);
        list.add(534);
        list.add(11);
        testPre(list,(x) ->{
            return  x % 2 == 0? true : false;
        });


//     将Predicate规则 做一个结合
        Predicate<Integer> pre1 = (x) -> {return x < 100; };
        Predicate<Integer> pre2 = (x) -> {return x % 2 != 0;};
        testPre(list,pre1.and(pre2)); //   相当于 &&  也可以直接写在其中一个里面，
        testPre(list,pre1.or(pre2)); // 相当于 ||

        System.out.println(testPre(list,pre1.and(pre2)));
        System.out.println(testPre(list,pre1.or(pre2)));

    }
}
