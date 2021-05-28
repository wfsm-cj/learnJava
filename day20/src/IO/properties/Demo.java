package IO.properties;

import java.util.Properties;
import java.util.Set;

/**
 * @author chenjie
 * @date 2021/5/26-15:50
 */
public class Demo {
    public static void main(String[] args) {
        /*
        * Properties 常用方法
        *
        *   put()
        *   setProperty(String key, String value)
        * */

        Properties p = new Properties();
//        setProperty()  Properties中的 key 唯一，如果key值重复了，value值会覆盖
        p.setProperty("1","a");
        p.setProperty("2","b");
        System.out.println(p);

        /*
        * Properties 本身也是双列集合，因为主要读取配置文件内容，因此有特有方法存在
        * */
        /*
        * getProperties(String key)
        *  获取 key 对应的 String value
        *
        * */
        String value = p.getProperty("1");
        System.out.println("value = " + value);

        /*
        * stringPropertyNames()   将 Properties集合中所有的 key值获取到，放置到 Set<String>
        * */

        Set<String> set = p.stringPropertyNames();
        for (String key : set) {
            System.out.println(key+"---"+p.getProperty(key));
        }

        /*
        * properties  被 map 取代了
        * 它的父类实现了 map 接口
        * */
    }
}
