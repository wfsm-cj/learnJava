package 字符流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author chenjie
 * @date 2021/5/25-14:46
 */
public class Demo1 {
    public static void main(String[] args)  throws IOException {
        /*
        * Writer
        * FileWriter
        *
        * 构造方法
        *   FileWriter(File file)
        *   FileWirter()
        *
        *
        * void write(int c)
        * void write(char[] cbuf)
        * void write(char[] cbuf,int off, int len)
        * void write(String str)
        * void write(String str, int off,int len)
        * 直接写字符串 或者这是 char[]
        * */

       try(           FileWriter fw = new FileWriter("abc.txt",true);
       ){
           fw.write('Y');
           char[] ch = {'1','>','你'};
           fw.write(ch);
           fw.write(ch,2,1);
           String s ="你好 世界";
           /*
           * FileWriter  有一个默认的字节缓冲区，一般来说是1024
           * */
           /*
           * 比字节快
           * */
           fw.flush();

           fw.write(s);

           /*
           * FileWriter(File file,boolean 是否追加写入)
           * */

       }
    }
}
