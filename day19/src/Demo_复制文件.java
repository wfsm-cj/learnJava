import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/25-9:40
 */
public class Demo_复制文件 {
    public static void main(String[] args)  throws IOException {
        File f = new File("111.png");
        byte[] b = new byte[1024];

        try(FileInputStream fis =  new FileInputStream(f);
            OutputStream fos = new FileOutputStream("111copy.png")) {
            int len;
          while((len = fis.read(b)) != -1) {
//              一边读一边写，，不用组合 byte数组
//              读什么写什么
              fos.write(b,0,len);
          }
        }


    }
}
