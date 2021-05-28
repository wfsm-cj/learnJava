import java.io.*;
import java.util.Properties;

/**
 * @author chenjie
 * @date 2021/5/27-9:21
 */
public class Demo_IO总结 {
    /*
    * 字节流
    *       FileInputStream
    *       BufferedInputStream
    *
    *       FileOutputStream
    *       BufferedOutputStream
    * 字符流
    *       FileReader
    *       BufferedReader
    *           readLine() 读取一行内容
    *       FileWriter
    *       BufferedWriter
    *           newLine()  换行
    *
    * 转换流
    *   InputStreamReader
    *   OutputStreamWriter
    *
    * 对象流
    *   ObjectOutputStream
    *   ObjectInputStream  (设置 private static final long serialVersionUID = xxxL) 修改了反序列化不会报错
    *
    * */

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("config.properties"),"GBK"
        );
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("config.properties",true),"UTF-8"
        );
        Properties p = new Properties();
        p.load(isr);
        for (String name : p.stringPropertyNames()) {
            System.out.println(name+"----"+p.getProperty(name));
        }
        p.setProperty("123","123");
        p.store(osw,"first modify");
        osw.close();
        isr.close();
    }
}
