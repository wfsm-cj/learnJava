package learn;

/**
 * @author chenjie
 * @date 2021/5/25-19:25
 */
public class Demo_总结 {
    /*
    * 字节流
    *   一般用来处理图像，音频 PPT Word 等类型的文件，
    * 字符流
    *   一般用于处理纯文本类型的文件，如txt 文件。不能处理图像视频等非文本文件，因为会现在编码表中找对应的
    * 字符，如果找不到，会用？表示，随后解析？的时候，解析出来的和之前不一样
    *
    * 字节流可以处理一切文件，而字符流只能处理纯文本文件
    * 字节流本身没有缓冲区，缓冲字节相对于字节流，效率提升非常高。
    * 字符流本身就带有缓冲区，缓冲字符相对于字符流效率提升就不是那么大了，但是有 提取行
    * */

    /*
    * 节点流：
    *   直接操作数据读写的流类，比如 FileInputStream
    * 处理流：
    *   对一个已存在的流的链接和封装，通过对数据进行处理为程序提供功能强大，灵活的读写功能，
    * 如 BufferedInputStream
    * */

    /*
    * FileInputStream  FileOutputStream  字节流
    *       字节流的方式效率较低，不建议使用
    * */
    /*
    *   BufferedInputStream   BufferedOutputStream   缓冲字节流
    * 缓冲字节流是为高效率而设计的，真正的读写还是靠 FileOutputStream 和 FileInputStream
    * 所以其构造方法入参是这两个类的对象也就不奇怪了
    * */


    /*
    *   InputStreamReader  OutputStreamWriter  字符流
    *   字符流适用于文本文件的读写， OutputStreamWriter 类其实也是借助 FileOutputStream 类实现的
    *故其构造方式是 FileOutputStream 对象
    * */

    /*
    * FileWriter   FileReader  字符流便捷类
    *      简化字符流的读写， new FileWriter 等同于 new OutputStreamWriter(new FileOutputStream(file))
    * */

    /*
    * BufferedReader  BufferedWriter   字符缓冲流
    *
    * */
}
