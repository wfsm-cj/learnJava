package 回顾.斗地主;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author chenjie
 * @date 2021/5/24-9:31
 */
public class Poker {
    /*
    *   给一个数组，分出去后排序，
    *   可以现在原数组保证元素不变，设计一个 序号数组，将序号进行排序，然后通过序号将 数组元素提取出来
    * 将一组数字分配很多组， 可以用 余数 来控制
    *
    * */
    public static void main(String[] args) {
//        组合牌
        String[] flower = {"♥","♠","♣","♦"};
        String[] poker = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
//        poker牌 54张
        ArrayList<String> pokers = new ArrayList<>();
//        poker number 混乱number
        ArrayList<Integer> pokersNum = new ArrayList<>();
        pokers.add("大王");
        pokers.add("小王");
        pokersNum.add(0);
        pokersNum.add(1);
//
        int count = 2;
        for (String p : poker) {
            for (String f : flower) {
                pokers.add(f+p);
                pokersNum.add(count);
                count++;
            }
        }
//        System.out.println(pokers);

//        洗牌

//        发牌
        ArrayList<Integer> play1 = new ArrayList<>();
        ArrayList<Integer> play2 = new ArrayList<>();
        ArrayList<Integer> play3 = new ArrayList<>();
        ArrayList<Integer> bottom = new ArrayList<>();
//        洗牌
        Collections.shuffle(pokersNum);
        for (int i = 0; i < pokersNum.size(); i++) {
            if(i < 3) {
                bottom.add(pokersNum.get(i));
            }else if(i % 3 == 0) {
                play1.add(pokersNum.get(i));

            }else if(i % 3 ==1) {
                play2.add(pokersNum.get(i));

            }else {
                play3.add(pokersNum.get(i));
            }
        }

        show(play1,pokers);
        show(play2,pokers);
        show(play3,pokers);
        show(bottom,pokers);

    }
    public static void show(ArrayList<Integer> player,ArrayList<String> pokers) {
        Collections.sort(player);
StringBuilder sb = new StringBuilder();
sb.append("[");
        for (Integer i : player) {
            sb.append(pokers.get(i)).append(", ");
        }
        sb.append("]");
        System.out.println(sb);
    }
}
