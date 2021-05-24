package IO流.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author chenjie
 * @date 2021/5/24-17:05
 */
public class Demo_FileOutputStream {
    public static void main(String[] args) throws IOException {
        /*
        * FileOutputStream
        * 构造方法
        *   FileOutputStream(File f)
        *   FileOutputStream(String path)    数据目的，只能对文件进行操作
        * */

//        文件名不存在会给你自己创建
        String path = "write.txt";
        FileOutputStream fos = new FileOutputStream(path);
//        FileOutputStream fos2 = new FileOutputStream(new File("write.txt"));
        File f = new File(path);

        if(!f.exists()) {//如果不存在 新建一个
            f.createNewFile();
            // 不写 FileOutputStream 会给你重新创建一个
        }
//        write(int i) 每次写入一个字节
        fos.write('a');

//        write(byte[] arr)  每次写入 arr中所有数据
        byte[] arr = {97,98,99,100};
        fos.write(arr);
//      write(byte[] arr,int index, int length)
//        从index索引开始，截取 length个字节写入
        fos.write(arr,1,2);

//        getBytes()  将字符串转为字节数组
        fos.write("今天一会要下雨".getBytes());

        fos.close();
    }
}
