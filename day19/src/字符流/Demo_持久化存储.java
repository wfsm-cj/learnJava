package 字符流;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author chenjie
 * @date 2021/5/25-15:20
 */
public class Demo_持久化存储 {
    public static void test() throws IOException {
        Scanner sc = new Scanner(System.in);


        File data = new File("Info.txt");
        try(FileWriter fw = new FileWriter("Info.txt",true)){
            System.out.println("input your username");
            String username = sc.nextLine().trim();
            String s = "username : "+username;
            fw.write(s);
            fw.flush();
            System.out.println("input your password");
            String password = sc.nextLine().trim();
            s = " password : " + password;
            fw.write(s);
            fw.flush();
        }
    }
    public static void main(String[] args) throws IOException {
        test();

        /*
        * 数据库
        * */


    }
}
