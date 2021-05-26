package 字符流.字符高效缓冲流;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/25-16:25
 */
public class Demo {
    public static void main(String[] args)  throws IOException {
        /*
        * BufferedReader
        *   自动为你创建 8 * 1024 的字符数组
        * BufferedWriter
        *
        * */

        try (BufferedReader br  = new BufferedReader(
                new FileReader("abc.txt")
        );
             BufferedWriter bw = new BufferedWriter(
                     new FileWriter("abc1.txt")
             )){
            int len;
            char[] ch = new char[6];
            while((len = br.read(ch)) != -1) {
//                bw.write(ch,0,len);
                System.out.println(new String(ch,0,len));
                bw.write(ch,0,len);
            }



            /*
            * readLine() 按行读取
            * */
        }
    }
}
