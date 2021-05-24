package IO流.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author chenjie
 * @date 2021/5/24-17:35
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("write.txt");
//        写入的数据是覆盖的，如果构造方法只提供文件路径的话，每次写入就是覆盖掉源文件重新写入
        fos.write('k');
        fos.close();

        /*
        * FileOutputStream(String path,boolean boolean)  当boolean为true，追加写入
        * FileOutputStream(File file, boolean boolean)
        * */
        File f = new File("abc.txt");
        FileOutputStream fos2 = new FileOutputStream(f,true);
        fos2.write("\r\n打开东风科技啊".getBytes());

        fos2.close();

    }
}
