package 缓冲字节流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author chenjie
 * @date 2021/5/25-11:33
 */
public class Demo_tryCatch2 {
    public static void main(String[] args) {
        /*
        * JDK 1.7 推出了针对于 IO流简化处理方式
        * */
        try (
//            IO流资源创建   ，， 小括号中流资源在使用完毕之后，小括号自动进行关闭资源的动作，包括关闭资源的异常
           FileInputStream fis = new FileInputStream("Info.txt");
           FileOutputStream fos = new FileOutputStream("Info1.txt");
            ){
//            IO流处理过程（读写）
            int len;
            while((len = fis.read()) != -1) {
                fos.write(len);
            }

        }catch(IOException e){
//            处理方式
            e.printStackTrace();
        }
    }
}
