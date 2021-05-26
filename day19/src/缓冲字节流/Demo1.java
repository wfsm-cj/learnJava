package 缓冲字节流;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/25-10:41
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("111.mp4");
        FileOutputStream fos = new FileOutputStream("H:\\aaa.mp4");
// 底层缓冲了
        int len; //读取到的字节结果
        while((len = fis.read()) != -1) {
            fos.write(len);
        }
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
