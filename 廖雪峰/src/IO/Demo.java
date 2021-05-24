package IO;

/**
 * @author chenjie
 * @date 2021/5/23-11:56
 */
public class Demo {
    /*
    * IO  Input/Output
    * Input
    *       从外部读入数据到内存，把文件从磁盘读取到内存，从网络读取数据到内存
    * Output
    *       把数据从内部输出到外部，把数据从内存写入到文件，把数据从内存输出到网络
    * */

    /*
    * InputStream / OutputStream
    *      IO流以 byte(字节)为最小单位，因此也称字节流
    *       InputStream 代表输入字节流
    *       OutputStream  代表输出字节流。
    * */

    /*
    * 如果我们需要读写的是字符，那么，按照 char 来读写显然更方便，这种流称为字符流
    * Reader 和 Writer 表示字符流，字符流传输的最小数据单位是 char
    *
    * Reader 和 Writer 本质上是一个能自动编解码的 InputStream 和 OutputStream
    *
    * */
    /*
    * 使用 Reader 还是 InputStream ，要取决于具体的使用场景，如果数据源不是文本，就只能用
    * InputStream，如果数据源是文本，使用Reader更方便一些
    *
    *   字节流接口  InputStream / OutputStream
    *   字符流接口 Reader / Writer
    * */



}
