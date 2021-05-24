package IO流.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/24-15:25
 */
public class Demo {
    /*IO流  传输数据，文件读写
     * 设备与设备之间数据传输
     *   文件复制，文件上传，文件下载
     *
     * 代码是内存角度
     * 磁盘
     * */

    /*--粒度
    * 字节流
    *   操作的是图片，视频，音频等二进制文件，优先使用字节流
    *   不确定文件类型，优先使用字节流，字节流是万能的流
    * 字符流
    *   如果操作的是纯文本文件，优先使用字符流。。 解决中文？？
    *
    * IO流注意事项
    *   操作之前，要导包， java.io
    *       文件找不到，文件在读写的时候在删除，u盘没读完u盘拔了
    *   在操作流的时候，要处理解决异常 IOException
    *   在操作完流对象之后，必须关闭资源，所有的流资源的关闭 close()
    * */
    /*
    * 字节流
    *   InputStream   抽象类
    *       FileInputStream  实现类
    *           跟磁盘上的文件进行交互，不要去读c盘，可能会被拦截
    *
    * 构造方法
    *    FileInputStream(File f)  相当于绑定一个数据的源头
    *           只能是文件类型的 file， io流资源只读写文件，不能操作文件夹
    *   FileInputStream(String path)
    * */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
//        项目工程根目录 + abc.txt
        FileInputStream fis2 = new FileInputStream(new File("abc.txt"));

        /*
        * read()  调用一次就从文件当中读取出一个字节，放到字节的输出流当中，将这个字节转换成
        * 整数，进行范围， -1 表示读取完毕
        * */
//        System.out.println(fis);
//        int first = fis.read();
//        System.out.println("first = " + (char)first);
        int len; // 读取到的字节的结果  现将 fis.read() 提取出来
        while((len = fis.read()) != -1) {
            System.out.println((char)len);
        }
        /*
        * int read(byte[] arr)
        *       最多读取 arr.length 个字节
        *       返回 本次读取到多个个内容  -1.证明文件读取完毕
        *
        * 实际开发当中，这个 byte[] 一般是 1024 的倍数
        * 常见 1024 * 4
        *       1024 * 8
        * */

        FileInputStream fis3 = new FileInputStream("abc.txt");
        byte[] arr = new byte[4];
        int len1 = fis3.read(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(new String(arr));
//      edcd ?????  前两个数据被覆盖，后两个数据没覆盖
        int len2 = fis3.read(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(new String(arr));

        /*
        * 当你创建一个 FileInputStream
        * 流资源本身不做读写操作的，只是个媒介，
        * 流找到了 JVM，
        * JVM 不会读，因此找到了操作系统，指令，让操作系统最多读取4个字节数据
        * 从文件中到流资源的方法返回值结果，
        * 当文件读取到最后（每一个文件最后都有一个结束标志），读取到结束标志
        * 操作系统不再读取，返回一个 -1 证明读取完毕
        *
        *   使用流资源完毕，必须关闭流资源 close()
        *   让操作系统，将文件从内存中移出
        *
        * */
        System.out.println("------------------");
        fis = new FileInputStream("abc.txt");
        while((len = fis.read(arr)) != -1) {
//            根据字符的长度，来转换成 字符串  fis.read()
            System.out.print(new String(arr,0,len));
        }

        fis3.close();


        fis.close();

    }

//    public static void look
}
