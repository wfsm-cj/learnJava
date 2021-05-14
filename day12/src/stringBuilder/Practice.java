package stringBuilder;

import java.util.Scanner;

/**
 * @author chenjie
 * @date 2021/5/14-14:37
 */
public class Practice {
    public static String reverse(String s) {
        if(s != null && !s.isEmpty()) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            return sb.toString();
//            return String.valueOf(sb);
//            return sb+"";
        }else {
            System.out.println("不能为null");
        }

        return null;
    }


    public static String arrayToString(int[] arr) {
        if (arr != null && arr.length > 0) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    sb.append(arr[i]+"]");
                }else{
                    sb.append(arr[i]).append(",");
                }
            }

            return sb.toString();
        }else {
            System.out.println("null");
            return "[]";
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please input letter");
//        String s = sc.nextLine();
        String s = "abc";
        StringBuilder sb = new StringBuilder(s);
        System.out.println("sb.reverse() = " + sb.reverse());

        int[] arr = new int[]{1,2,3};
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if( i  == 0) {
                sb1.append(arr[i]).append("[");
            }else if(i == arr.length - 1){
                sb1.append(arr[i]+"]");
            }else {
                sb1.append(arr[i]).append(",");

            }
        }
//        System.out.println("sb1 = " + sb1);
        System.out.println(Practice.reverse("abc"));
        System.out.println(Practice.arrayToString(arr));

    }
}
