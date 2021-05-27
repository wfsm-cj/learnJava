package IO.标准输入输出流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * @author chenjie
 * @date 2021/5/26-10:57
 */
public class Demo {
    /*
    * System.in  输入流
    * */
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        System.out.println("please input");
//        int x = is.read();//默认从键盘录入读取
//        System.out.println(x);

//        System类  中  setInt(InputStream is) 将System.in 数据输入来源绑定为参数 is 的数据源头
        System.setIn(new FileInputStream("abc.txt"));
        System.out.println(System.in.read());
        System.out.println(System.in.read());
//        System.in 是一个 InputStream   调用 read() 就能读取字节

        /*
        * 输出流 System.out
        *   本质上是一个打印流 PrintStream
        *   默认关联到控制台
        *   System.setoOut( 输出流位置)
        * */
        System.setOut(new PrintStream("abc.txt"));
        System.out.println("cnm");

    }
}
