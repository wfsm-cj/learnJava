package 缓冲字节流;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/25-10:22
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        /*
        * 字节缓冲流
        *   BufferedOutputStream
        *    创建对象时，会在代码底层默认创建出一个大小为 8192（1024 * 8）的字节数组，提供数组缓冲区
        * 先把数据写在 数组中，当你把文件写满了，会给你把数据输出出去，或者 关闭流资源的时候，给你输出数据
        *
        * BufferedInputStream
        *   包装流
        * */

        /*
        * BufferedOutputStream(OutputStream out)
        * BufferedInputStream(InputStream in)
        * */
    long start = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("111.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("H:\\aaaa.mp4"));
// 底层缓冲了
        int len; //读取到的字节结果
        while((len = bis.read()) != -1) {
            bos.write(len);
        }
        bos.close();
        bis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);


    }
}
