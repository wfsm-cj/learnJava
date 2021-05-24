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
            System.out.println(n);
        }
        /*
        * public void close() throws IOException
        *       关闭此文件输入流并释放与此流有关的所有系统资源
        *       如果此流有一个与之关联的通道，则关闭该通道
        * */
        input.close();
    }

}
