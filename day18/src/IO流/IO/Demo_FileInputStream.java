package IO流.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author chenjie
 * @date 2021/5/24-16:59
 */
public class Demo_FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        /*
        * read()
        * read(byte[] arr)
        * */
        byte[] arr = new byte[4];
        int len;
        while(( len = fis.read(arr)) != -1) {
            System.out.print(new String(arr,0,len));
        }

    }
}
