package homework;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/24-21:30
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        File ff = new File("\\.\\/heh");
        InputStream input = new FileInputStream("abc.txt");
        System.out.println(ff.getAbsolutePath());
        byte[] arr = new byte[4];
        int len;
        while((len = input.read(arr)) != -1) {
//            System.out.println(len);
            //???????????????????  空 和绝对路径  文件里面有回车换行
            System.out.println(new String(arr,0,len)+"-----");
        }
        input.close();
    }
}
