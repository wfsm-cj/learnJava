package IO.转换流;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author chenjie
 * @date 2021/5/26-10:09
 */
public class Demo {
    /*
    * GBK
    *   国标码， 英文字符占一个字节，中文字符占两个字节且第一个字节为负
    * UTF-8
    *   万国码，定义了全球所有语言的所有符号，英文一个字节，中文3个字节
    * */

    public static void main(String[] args) throws IOException {
       /* try(FileInputStream fis = new FileInputStream("abc.txt");
            FileOutputStream fos = new FileOutputStream("abc1.txt")
        ){
            int len;
            while((len = fis.read()) != -1) {
                fos.write(len);
            }
        }*/

      /*  try(FileReader fr = new FileReader("abc.txt");
            FileWriter fw = new FileWriter("abc1.txt");
        ) {
            int len;
            while((len = fr.read()) != -1) {
                fw.write(len);
            }
        }*/

        /*
        * 针对不同编码表，复制就会出现乱码问题
        *
        * */
//        转换流
        /*
        * InputStreamReader
        * OutputStreamWriter
        *   构造方法
        *       InputStreamReader(inputStream,"编码集"); // 文件是什么编码集就用什么
        *
        *       OutputStreamWriter(outputStream,"编码表“);// 将获取到的字符，通过编码集转换成对应的字节数据
        * */
        System.out.println(StandardCharsets.US_ASCII);
        try(InputStreamReader isr = new InputStreamReader(
                new FileInputStream("abc.txt"), "GBK"
        );
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("abc1.txt"), StandardCharsets.UTF_8
        )){
            int n;
            while((n = isr.read()) != -1) {
                osw.write(n);
            }
        }

    }
}
