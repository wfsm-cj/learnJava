package IO流.learn;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author chenjie
 * @date 2021/5/24-17:44
 */
public class Demo {
    public static void main(String[] args)  throws IOException {
        /*
        * int read(byte[] b)
        * int read(byte[], int off,int len)
        * */

        /*
        * ByteArrayInputStream
        *   可以在内存中模拟一个InputStream
        * */
        byte[] data = {97,98,99,100};
//        public ByteArrayInputStream(byte[] buf)
//        创建一个 ByteArrayInputStream, 使用 buf 作为其缓冲区数组

//        public ByteArrayInputStream(byte[] buf, int offset,int length)
//        buf - 输入缓冲区   offset - 缓冲区中要读取的第一个字节的偏移量  length - 从缓冲区中读取的最大字节数

        try(InputStream input = new ByteArrayInputStream(data)){
            int n;
            while((n = input.read()) != -1) {
                System.out.println((char)n);
            }
        }
    }

    public static String readAsString(InputStream input) throws IOException {
        int n;
        StringBuilder sb = new StringBuilder();
        while((n = input.read()) != -1) {
            sb.append((char)n);
        }
        return sb.toString();
    }
}

/*
* java.io.InputStream
*   所有输入流的超类
* FileInputStream   实现了文件流输入
* ByteArrayInputStrem  在内存中模拟一个字节流输入
*
* 总是使用 try(resource) 来保证该 InputStrem 正确关闭
* */




