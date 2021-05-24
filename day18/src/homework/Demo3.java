package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author chenjie
 * @date 2021/5/24-21:30
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("abc.txt");
        byte[] arr = new byte[4];
        int len;
        while((len = input.read(arr)) != -1) {
            //???????????????????  空 和绝对路径
            System.out.println(new String(arr,0,len)+"-----");
        }
        input.close();
    }
}
