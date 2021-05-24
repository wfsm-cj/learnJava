package IO流.learn;

import java.io.*;
import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/24-19:29
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
         *  ByteArrayOutputStream() 可以在内存中模拟一个 OutputStream
         *
         * */

        /*
        * public ByteArrayOutputStream()
        *       创建一个新的 byte 数组输出流，缓冲区容量最初是32字节
        *
        * public ByteArrayOutputStream(int size)
        *       创建一个新的 byte数组输出流， 以字节为单位
        * */
        byte[] data;
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()){
            output.write("abc".getBytes("UTF-8"));
//            System.out.println(output.toString("US-ASCII"));
            data = output.toByteArray();
            System.out.println(Arrays.toString(data));
//            public byte[] toByteArray()
//            以 byte 数组的形式返回输出流的当前内容

//            public String toString(String charsetName)
        }


        /*
        * 同时使用多个资源，用 ; 隔开
        *
        * */
        try(InputStream input = new ByteArrayInputStream(data);//用 ; 分隔
            OutputStream output = new ByteArrayOutputStream()
        ){
//            。。。
        }

        /*
        * 小结：
        *   FileOutputStream  实现了文件流输出
        *   ByteArrayOutputStream   在内存中模拟一个输出流
        *           toByteArray()  转为 byte数组      toString(charsetName name)
        *
        * 某些情况下需要手动调用 OutputStream 的 flush()方法来强制输出缓冲区
        * 总是使用 try(resource) 来保证 OutputStream  正确关闭
        *
        * */
    }
}
