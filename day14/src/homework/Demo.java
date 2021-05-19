package homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author chenjie
 * @date 2021/5/18-18:42
 */
public class Demo {
    public static void symmetry(String[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            char[] charArr = arr[i].toCharArray();
            int len = charArr.length;
            /*
             * 将判断对称提出来 ，封装成方法， 将小的功能提出来，以后用
             * */
            for (int j = 0,k = len - 1; j < k; j++,k--) {
                if(charArr[j] != charArr[k]) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    public static double average(String str) {
        String[] arr = str.split(",");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        double average = sum/arr.length;

        return average;
    }
    public static void refactor() {
        String str = "张三@李四@王五@矛盾";
//       replace  将@ 替换成 “  ”
//        String[] arr = str.split("@");
//        String newStr = "";
//        for (int i = 0; i < arr.length; i++) {
//            newStr += arr[i].concat("  ");
//        }
//        System.out.println("newStr = " + newStr);
        String newStr = str.replaceAll("@","  ");
        System.out.println("newStr = " + newStr);
    }

    public static void verify(String tel) {
        Pattern p = Pattern.compile("[1][3-9][0-9]{9}");
        Matcher m = p.matcher(tel);

//        System.out.println(m.matches());
        if(m.matches()) {
//            tel = tel.substring(0,3)+"****"+tel.substring(7);
//            System.out.println("tel = " + tel);
            /*
            * 用replace 返回  先截取你要替换的字符串 ，再 replace
            * */
            tel = tel.replace(tel.substring(3,7),"****");
            System.out.println("tel = " + tel);
            return;
        }


        try {
            if(tel.length() != 11) {
                throw new IllegalLengthException("error length");
            }else if(!tel.startsWith("1")){
                throw new Exception("第一位不为1");
            }else if(tel.charAt(1) < '3' || tel.charAt(1) > '9'){
                throw new Exception("第二位错误");
            }else if(!isNumeric(tel)){
                throw new IllegalCharacterException("不是全数字");
            }
        }catch(IllegalLengthException ex){
                ex.printStackTrace();
                ex.showDetails();
        } catch (IllegalCharacterException ex){
            ex.printStackTrace();
            ex.showDetails();
        }

        catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static boolean isNumeric(String str) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(str);
        return  m.matches();
    }

    public static void create(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        int index = 0;
        while (true){
            int i = random.nextInt(99) + 1;
            System.out.print("i = " + i);
//            public static int binarySearch(int[] a, int key)
//            必须在进行此调用之前对数组进行排序，通过 sort(int[]) 方法，如果没有对数组排序，则结果是不确定的
//            如果数组包含多个带有指定值的元素，则无法保证找到的是哪一个
            /*
            * 二分查找 必须是升序数组
            * */
//            Arrays.sort(arr, Collections.reverseOrder());

            if( Arrays.binarySearch(arr,i) < 0) {
                System.out.println("    "+Arrays.binarySearch(arr,i));
                arr[index] = i;
                index++;
                System.out.println(Arrays.toString(arr));

            }
            if(index == len){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        String[] arr = {"010","3223","666","7890987","123123"};
        Demo.symmetry(arr);
        String s = "23,24,25";
        System.out.println(Demo.average(s));
        Demo.refactor();
        String tel = "13709044036";
        verify(tel);
        create(5);
    }
}
