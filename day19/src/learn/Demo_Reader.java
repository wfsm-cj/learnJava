package learn;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

/**
 * @author chenjie
 * @date 2021/5/25-19:59
 */
public class Demo_Reader {
    /*
    * Reader
    *   是java 的 IO库提供的另一个输入流接口。和 InputStream 的区别是，
    * InputStream 是一个字节流，以 byte 为单位读取
    * Reader 是一个字符流，以 char 为单位读取
    * */
    /*
    * java.io.Reader 是所有字符输入类的超类
    * */
    public static void main(String[] args) throws IOException {
//        可能会出现乱码。。 要避免乱码问题，我们需要在创建 FileReader 时指定编码
        /*如：Windows系统的默认编码可能是 GBK ，打开一个 UTF-8 的文本文件就会出现乱码
        * */
        Reader reader = new FileReader("abc.txt", StandardCharsets.UTF_8);//设置编码是版本 11 的
        /*
        * FileReader 构造方法
        *   new FileReader(File file)
        *   new FileReader(String s)
        * */
        char[] ch = new char[20];
        while(true) {
            int n = reader.read(ch);
            if(n == -1) {
                break;
            }
            System.out.println(new String(ch,0,n));
        }
        reader.close();

/*
* CharArrayReader
*     可以在内存中模拟一个 Reader， 它的作用实际上是把一个 char[] 数组变成一个 Reader，
* 和 ByteArrayInputStream 类似
*
* 构造
*   CharArrayReader(char[] buf)
*   CharArrayReader(char[] buf, int offset, int length)
*
* */

        /*
        * StringReader
        *   StringReader 可以直接把 String 作为数据源，他和 CharArrayReader几乎一样
        *
        * */
/*
* InputStreamReader
*
*       FileReader  =  new InputStreamReader(new FileInputStream(),编码)
*
* */



    }
}
