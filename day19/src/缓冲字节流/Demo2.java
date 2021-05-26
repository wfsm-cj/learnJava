package 缓冲字节流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author chenjie
 * @date 2021/5/25-10:43
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("111.mp4");
        FileOutputStream fos = new FileOutputStream("H:\\aaa.mp4");
// 底层缓冲了
        int len; //读取到的字节结果
        byte[] b = new byte[1024];
        while((len = fis.read(b)) != -1) {
            fos.write(b,0,len);
        }
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
