package 缓冲字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author chenjie
 * @date 2021/5/25-11:22
 */
public class Demo_tryCatch {
    FileInputStream fis;
    FileOutputStream fos;
    {//JDK 1.7 之前 处理方式
        try {
            fis = new FileInputStream("Info.txt");
            fos = new FileOutputStream("Info1.txt");
            int len;
            while((len = fis.read() )!= -1) {
                fos.write(len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(fos != null) {


                fos.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    if(fis != null) {
                        fis.close();

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
