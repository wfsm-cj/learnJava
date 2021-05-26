package 字符流.字符高效缓冲流;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/25-16:56
 */
public class Demo_readLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("abc.txt")
        );
        BufferedWriter bw  = new BufferedWriter(
                new FileWriter("abc1.txt")
        );
        String s;
        while((s = br.readLine()) != null) {
            System.out.println(s);
            bw.write(s);
            bw.newLine(); //写入一个分隔符
        }
        br.close();
        bw.close();
    }
}
