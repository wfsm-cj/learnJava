package IO流.IO;

import java.io.*;
import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/24-17:18
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        int n;
        while((n = fis.read()) != -1) {
//            System.out.println(n);
            System.out.print((char)n);
        }


        fis = new FileInputStream("abc.txt");
        byte[] arr =new byte[4];
//        System.out.println(fis.read(arr, 1, 2));
//        System.out.println(Arrays.toString(arr));
        System.out.println();
        int len;
        while((len = fis.read(arr)) != -1) {
            System.out.print(new String(arr,0,len));
        }

        fis.close();


        FileOutputStream fos  = new FileOutputStream("write.txt");
        byte[] b = "得福卡来得及啊".getBytes();
        fos.write(b);//会覆盖之前的内容


        fos.close();
    }
}
