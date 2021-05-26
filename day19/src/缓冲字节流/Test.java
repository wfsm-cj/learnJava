package 缓冲字节流;

import java.io.*;
import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/25-11:40
 */
public class Test {
    public static final int BUFFER_SIZE = 100;
    public static void FileTest() throws IOException {

        long start = System.currentTimeMillis();
        try( FileInputStream fis = new FileInputStream("abc.txt");
             FileOutputStream fos = new FileOutputStream("c.txt");)
        {
            byte[]  b = new byte[BUFFER_SIZE];
            int len;
            while((len = fis.read(b)) != -1) {
//                System.out.println(Arrays.toString(b));
                fos.write(b,0,len);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public static void BufferedTest() throws IOException{
        long start = System.currentTimeMillis();
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("abc.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"))
        ){
            byte[]  b = new byte[BUFFER_SIZE];
            int len;
            while((len = bis.read(b)) != -1) {
                bos.write(b,0,len);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String[] args) throws IOException {
        FileTest();// 2
        BufferedTest(); //1
    }
}
