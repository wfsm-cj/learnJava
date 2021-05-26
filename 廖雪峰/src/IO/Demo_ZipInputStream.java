package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author chenjie
 * @date 2021/5/24-21:54
 */
public class Demo_ZipInputStream {
    public static void main(String[] args) throws IOException {
//        public  ZipInputStream(InputStream in)
//        创建新的 ZIP 输入流     in -- 实际输入流
        try (ZipInputStream zip  = new ZipInputStream(new FileInputStream("abc.rar"))){
            ZipEntry entry = null;
                while((entry = zip.getNextEntry()) != null) {

                }
        }
    }
}
