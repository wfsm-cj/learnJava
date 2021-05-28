import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author chenjie
 * @date 2021/5/27-9:02
 */
public class Demo {
    /*
    * OutputStreamWriter(OutputStream os, String charSetName)
    * InputStreamReader
    * 
    * */
    /*
    * 序列号 serialVersionUID  和 transient 关键字
    *   trasient 不想序列化的字段，就不会被序列化
    * */
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<>();
        map.put(1,"32");
        Properties p = new Properties();
        p.setProperty("fdsa","cj");
        for (Object o : p.keySet()) {
            System.out.println(o);
        }
        for (String name : p.stringPropertyNames()) {
            System.out.println(name);
            String s = p.getProperty(name);
        }
    }
}
