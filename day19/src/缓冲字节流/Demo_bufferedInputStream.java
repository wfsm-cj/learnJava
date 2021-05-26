package 缓冲字节流;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/25-10:22
 */

/*
*BufferedInputStream 的比直接用 inputStream 耗时还要多点：
*    BufferedInputStream 从
*
* */
public class Demo_bufferedInputStream {
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
//*
// 有一些流资源底层带有数组缓冲，（数组进行文件操作），如果最终流资源没有刷新或者没有关闭流
//        就会出现问题，， 数据目前存储在缓冲流的底层数组中，没有同步到文件中

//        flush()  刷新流资源
//                将流资源中底层数组缓冲数据同步到文件中，流刷新之后还能继续使用
//        close()  在关闭资源之前，先调用一次 flush() ，将缓冲数据同步到文件中，然后再关闭流资源，流资源关闭之后，不能再继续使用
// */

    }
}
