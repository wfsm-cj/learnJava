package 字符流;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/25-14:10
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        /*
        * 字符流 = 字节流 + 编码表
        *       先从文件中读取一个字节，判断这个字节是否是正数，是的话，认为来自于ASCII 编码表，直接通过编码表。如果
        * 读取到第一个字节为负数，那么继续向下读取，根据编码表的不同，决定下来，是读取两个字节还是三个字节
        * */
//        FileInputStream fis = new FileInputStream("Info.txt");
//        byte[] b = new byte[3];
//        int len;
//        while((len = fis.read(b)) != -1) {
//            System.out.println(new String(b,0,len,"UTF-8"));
//        }

        /*
        * Reader  读取字符流的抽象父类
        *
        * FileReader   实现类
        *
        * 构造方法
        *   FileReader(File file)
        *   FileReader(String fileName)
        *
        * int read()       返回这个字符在编码表中对应的整数结果
        * int read(char[] ch)  一次读取到的字符个数
        * */
        FileReader fr = new FileReader("Info.txt");
//        单个字符
//        int n;//读取到的字符在编码表中对应的整数
//        while((n = fr.read()) != -1) {
//            System.out.println((char)n);
//        }


//        数组
        char[] ch = new char[3];
        int len;
        while((len = fr.read(ch)) != -1) {
            System.out.println(Arrays.toString(ch)+"---");
            System.out.println(new String(ch,0,len));
        }
    }
}
