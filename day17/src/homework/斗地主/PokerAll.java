package homework.斗地主;

import java.util.*;

/**
 * @author chenjie
 * @date 2021/5/22-16:51
 */
public class PokerAll {
    private List<Poker> pokers;

//    构造一副poker
    public PokerAll(){
        List<Poker> list = new ArrayList<>();
        list.add(new Poker("大王",15));
        list.add(new Poker("小王",14));
        String[] arr = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] arr1 = {"红桃","梅花","黑桃","方块"};
        for (String color : arr1) {

            for (int num = 1; num <= 13; num++) {
                Poker p = new Poker(color,num);
                list.add(p);
            }
        }
        this.pokers =  list;
//        System.out.println(list);
    }
    public static void main(String[] args) {
//        Map<String,Poker>  洗牌
        List<Poker> pokerAll = new PokerAll().shuffle();
        System.out.println(pokerAll);
        System.out.println(new Poker("大王").getColor());

//        发牌
        PokerAll.deal(pokerAll);

    }

//洗牌
    public  List<Poker> shuffle() {
        Collections.shuffle(pokers);
        return pokers;
    }

//    发牌
    public static void deal(List<Poker> pokers) {
        Set<Poker> player_1 = new TreeSet<>();
        Set<Poker> player_2 = new TreeSet<>();
        Set<Poker> player_3 = new TreeSet<>();
        Set<Poker> other = new TreeSet<>();


//       遍历牌
        ListIterator<Poker> it = pokers.listIterator();
        int count = 0;
        while(it.hasNext()) {
            Poker p = it.next();
            if(count < 17) {
                player_1.add(p);
                it.remove();
                count++;
            }else if(count >=17 && count < 34){
               player_2.add(p);
               count++;
            }else if(count >= 34 && count < 51){
                player_3.add(p);
                count++;
            }else{
                other.add(p);
                count++;
            }
        }

        System.out.println("player_1 = " + player_1);
        System.out.println("player_2 = " + player_2);
        System.out.println("player_3 = " + player_3);
        System.out.println("other = " + other);
    }

}
