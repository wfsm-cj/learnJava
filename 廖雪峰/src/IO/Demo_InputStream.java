package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author chenjie
 * @date 2021/5/24-8:32
 */
public class Demo_InputStream {
    /*
    * InputStream
    *   抽象类
    *   public abstract int read() throws IOException
    *       这个方法会读取输入流的下一个字节，并返回字节表示的 int 值（0~255），如果已读到末尾，返回 -1 表示不能继续读取
    * FileInputStream  是 InputStream 的一个子类
    * */
    public static void main(String[] args) throws IOException {
        /*
        * public FileInputStream(String name)  通过打开一个实际文件的连接来创建一个FileInputStream
        * public FileInputStream(File file)
        * */
        InputStream input = new FileInputStream("H:\\1\\22.txt");
        while(true) {
            int n = input.read();
            if(n == -1) {
                break;
            }
//            new String(byte[] arr)   将byte变成字符串
            byte[] arr = {(byte)n};
            System.out.println(new String(arr));
            System.out.println(n);
        }
        /*
        * public void close() throws IOException
        *       关闭此文件输入流并释放与此流有关的所有系统资源
        *       如果此流有一个与之关联的通道，则关闭该通道
        * */
        input.close();
        /*
        * 计算机中，类似 文件，网络端口这些资源，都是由操作系统统一管理的。应用程序在运行的过程中，如果打开了一个文件进行读写，
        * 完成后要及时的关闭，以便让操作系统把资源释放掉。否则，应用程序占用的资源会越来越多，不但白白占用内存，还会影响其他应用程序的运行
        * */
    }

}
