package homework;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author chenjie
 * @date 2021/5/24-20:57
 */
public class Demo1 {
    public static void test() throws IOException {
        File file = new File("G:\\save");
        if(!file.exists()) {
            file.mkdir();
        }else{
            System.out.println("exist");
        }
        HashMap<String,Integer> map = new HashMap<>();
        map.put(".txt",2);
        map.put(".docx",3);
        map.put(".ppt",2);
        File f2;
        for (String suffix : map.keySet()) {
            for (int i = 0; i < map.get(suffix); i++) {
                f2 = new File(file.getAbsolutePath()+"\\"+i+suffix);
                f2.createNewFile();
            }
        }

    }
    public static void main(String[] args) throws IOException {
//      test1("Info.txt");
        test2();
    }


    public static void test1(String fileName) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String str = sc.nextLine();
            if(str.trim().equals("886")) {
                try ( InputStream input = new FileInputStream(fileName)){
                    byte[] arr = new byte[8];
                    int len;
                    String s = ""; //取出的 文件 转为字符串
                    if((len =input.read(arr)) != -1) {
                        s += new String(arr,0,len);
                    }
                }
                break;
            }else {
                try(OutputStream output = new FileOutputStream(fileName,true)){
                    output.write(str.getBytes());

                }
            }
        }


    }


    public static void test2() throws IOException {
        File file = new File("abc.txt");
        try (InputStream input = new FileInputStream(file)){
            int n;
            while((n = input.read()) != -1) {
                System.out.println(n+"---"+(char)n);
            }
        }
    }

}
