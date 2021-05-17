package homework;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author chenjie
 * @date 2021/5/17-9:18
 */
public class Demo_Homework {
    public static void change(String str) {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
//
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if(c >= 'A' && c <= 'Z') {
//                char  --> String   String.valueOf()
//                new String(new char[])
              sb.append(String.valueOf(c).toLowerCase());
            }else if(c >= 'a' && c <= 'z') {
                sb.append(String.valueOf(c).toUpperCase());
            }else{
                sb.append("*");
            }

        }
    }


    public static void answer2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();

        while(number <= 0){
            number = sc.nextInt();
        }
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("input your number"+(i+1)+"数据");
            String count = sc.next();
            if("end".equals(count)) {
                break;
            }else {
                int arrEle = Integer.parseInt(count);
                arr[i] = arrEle;
            }
        }


    }


    public static void answer3(String str) {
        int upperCase = 0;
        int lowerCase = 0;
        int figure = 0;
        int other = 0;

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];

            if (c >= 'A' && c <= 'Z') {
                upperCase++;

            } else if (c >= 'a' && c <= 'z') {
                lowerCase++;
            } else if (c >= '0' && c <= '9') {
                figure++;
            } else {
                other++;
            }
        }
    }

    public static void answer4(){
        for (int i = 0; i < 20 ; i++) {
            for (int j = 0; j < 33; j++) {

            }

        }
    }
    public static void main(String[] args) {
        /*
        * replace()
        * */
        String s = "Hello12345World";
        change(s);
        Thread thread = new Thread();


    }
}
