package homework;

import com.sun.org.apache.bcel.internal.generic.IFNONNULL;

import java.util.Scanner;

/**
 * @author chenjie
 * @date 2021/5/14-19:51
 */
public class Demo {
    //    将字符串中大写字母变成小写字母，小写字母变成大写字母，其他的每一个字符用"*"代替
    public static String change(String str) {
        if (str != null && !str.isEmpty()) {
            final int gap = 'a' - 'A';
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 'a' && arr[i] <= 'z') {
                    arr[i] -= gap;
                } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                    arr[i] += gap;
                } else {
                    arr[i] = '*';
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            return sb.toString();
        } else {
            return "error";
        }
    }

    //    创建数组
    public static void createArray(Scanner sc) {
        System.out.println("please input a number");
        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];
        System.out.println("input your number");
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().trim();

            if (s != null && !s.isEmpty()) {
                try {
               arr[i] = Integer.parseInt(s);
                }catch (NumberFormatException e) {
                    System.out.println(e);
                    System.out.println("输入无效，请重新输入");
                }
            }else if(s.equals("end")){
                break;
            }else{
                System.out.println("输入无效，请重新输入");
            }

        }
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i ==  arr.length - 1) {
                sb.append(arr[i]).append("]");
            }else {
                sb.append(arr[i]+",");
            }
        }
        System.out.println(sb+"最大值为："+max);

    }

// 输入字符串 分类
    public static void classify(Scanner sc) {
        int upperCase = 0;
        int lowerCase = 0;
        int figure = 0;
        int other = 0;
        System.out.println("please input a str");
        while (true) {
            String s = sc.nextLine();
            if (s != null && !s.isEmpty()) {
                char[] arr = s.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 'a' && arr[i] <= 'z') {
                        lowerCase++;
                    }else if(arr[i] >= 'A' && arr[i] <= 'Z') {
                        upperCase++;
                    }else if(arr[i] >= '0' && arr[i] <= '9') {
                        figure++;
                    }else {
                        other++;
                    }
                }
                System.out.println("other = " + other);
                System.out.println("figure = " + figure);
                System.out.println("lowerCase = " + lowerCase);
                System.out.println("upperCase = " + upperCase);
                break;
            }else {
                System.out.println("输入字符为空重新输入");
            }
        }
    }

// 获取单词
    public static void getLetter(String str) {
        String[] arr = str.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].trim().length() == 2) {
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(count);

    }

//鸡
    public static void chicken(int number,int amount) {
         int cock ;
         int hen ;
         int chick ;
         int count = 0;

        for ( cock = 0; cock < number / 5; cock++) {
            for ( hen = 0; hen < number / 3; hen++) {
                if(cock*5 + hen * 3 > 100){
                    break;
                }
                for (chick = 0; chick < number * 3 ; chick += 3) {
                    int price = cock*5 + hen*3 + chick/3;
                    if (price == amount) {
                        count++;
                        System.out.println("chick = " + chick+"hen = " + hen+"cock = " + cock);

                    }
                }
            }
        }

        System.out.println(count);

    }





    public static void main(String[] args) {
        String str = "Hello12345World";
        System.out.println(Demo.change(str));

        Scanner sc = new Scanner(System.in);
//        Demo.createArray(sc);


//        Demo.classify(sc);

        String str1 ="Hi If you want to change your life , you must work hard !";
//        Demo.getLetter(str1);

        Demo.chicken(100,100);
    }
}
