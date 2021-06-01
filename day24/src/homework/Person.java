package homework;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

/**
 * @author chenjie
 * @date 2021/5/31-21:09
 */
public class Person {
    public int getSum(int x, int y){
        return x+y;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        /*Properties类
        * public void load(InputStream inStream)
        * public void load(Reader reader)
        *       从输入流中读取属性列表
        *       将 .properties 配置文件的键值对数据读取到双列集合 Properties。。配置文件默认的编码在 idea中是GBK
        *
        * public void store(OutputStream out,String comments)
        * public void store(Writer writer, String comments)
        *      把双列集合的数据同步到 .properties  文件中
        *
        * public Set<String> stringPropertyNames()
        *       返回此属性列表中的键集  .. 属性列表的 Set<String>
        *
        * public String getProperty(String key, String defaultValue)
        *       用指定的键在属性列表中搜索属性
        *
        * public Object setProperty(String key, Stringg value)
        *   调用 Hashtable 的方法 put。使用 getProperty 方法提供的并行性。
        *   返回 属性列表中指定键的旧值，如果没有值，则为 null
        * */
        File config = new File("H:\\1\\1\\run.properties");
        if(config.isFile()) {
            Properties p = new Properties();
            p.load(new InputStreamReader(new FileInputStream(config),"GBK"));
            Set<String> set = p.stringPropertyNames();
            String className =p.getProperty("className");
            String methodName = p.getProperty("methodName");

            Class c = Class.forName(className);
           Method getSum =  c.getDeclaredMethod(methodName,int.class,int.class);
           /*
           * invoke(调用的对象，调用的参数。。。)
           * */

            System.out.println(getSum.invoke(c.newInstance(), 2, 2));

        }else{
            System.out.println("error path");
        }

    }
}
