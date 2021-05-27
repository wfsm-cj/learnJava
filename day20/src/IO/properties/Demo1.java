package IO.properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @author chenjie
 * @date 2021/5/26-16:43
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
        * load(InputStrem inStream)  一般配置文件中没有中文
        * load(Reader read)
        * */
        Properties p = new Properties();
//        load() 将 config.properties配置文件的键值对数据读取到双列集合 Properties   ，，配置文件默认的编码在 idea中是GBK
        p.load(new InputStreamReader(new FileInputStream("config.properties"),"GBK"));
//        p.load(new FileInputStream("config.properties"));
//        System.out.println();
        Set<String> set = p.stringPropertyNames();
        for (String s : set) {
            String value = p.getProperty(s);
            System.out.println(s+"------"+value);
        }


        /*
        * store(OutputStream out, String comments)
        *
        * */

        p.setProperty("username","2323");
        p.setProperty("heh","积分完了");
//        store 同步到配置文件中  把双列集合的数据同步到properties文件中
       FileOutputStream fos =  new FileOutputStream("config.properties");
        p.store(new OutputStreamWriter(fos,"UTF-8"),"为什么");

    }
}
