package homework;

import java.util.*;

/**
 * @author chenjie
 * @date 2021/5/20-21:17
 */
public class Demo {
    public static void test0() {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        HashSet<String> tels = new HashSet<>();
        for (String str : strs) {
            tels.add(str);
        }
        System.out.println(tels);
        for (String tel : tels) {
            System.out.println(tel);
        }
        Iterator it = tels.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
//        红色球
        ArrayList<Integer> list = new ArrayList();
        Random random = new Random();
        Integer red = random.nextInt(33) + 1;

        list.add(red);
        while(list.size() < 6) {
            ListIterator it = list.listIterator();
            boolean flag = true;
            red = random.nextInt(33) + 1;
            while(it.hasNext()) {
                 if(it.next() == red) {
                     flag = false;
                 }
            }
            if(flag) {
                it.add(red);
            }

        }
        System.out.println(list);
//        蓝色球
        int blue = random.nextInt(16) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入红球");
        String[] userRed = sc.nextLine().split(" ");
//        sc.nextLine();
        System.out.println("输入篮球" + blue);
        int userBlue = Integer.parseInt(sc.nextLine().trim());

        if(userBlue == blue) {
            int count = 0;
            for (int i = 0; i < userRed.length; i++) {
                int value = Integer.parseInt(userRed[i].trim());
                if(value == list.get(i)) {
                    count++;
                }
            }
            if(count == 1){
                System.out.println("3");
            }else if(count == 0){
                System.out.println("没有中奖");
            }else if(count == 6) {
                System.out.println("1");
            }else{
                System.out.println("2");
            }

        }else {
            System.out.println("sorry");
        }


    }
}
