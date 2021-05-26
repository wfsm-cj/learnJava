package 字符流;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author chenjie
 * @date 2021/5/25-15:41
 */
public class Demo_字符流拷贝 {
    /*
    *  字符流，可以复制纯文本文件，但是效率不高，一般都用字节流
    *   字符流，不能复制非纯文本文件
    * */
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("111.png");
             FileWriter fw = new FileWriter("1111.png")){
            int n;
            char[] b = new char[100000];
            while((n = fr.read(b)) != -1) {
                System.out.println("----");
                fw.write(b,0,n);
            }
        }
/*
* 不能用 字符流拷贝 图片 视频，
*   将图片字节数据参考编码表转换成字符， 不能对应出正确字符，使用 ？ 代替
*
*   将 ？ 参考编码表，转换为字节，可以转换，但是已经不是源字节的数据
*
* */

    }
}
