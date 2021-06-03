package Homework_;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author chenjie
 * @date 2021/6/1-9:21
 */
public class Person {
    public int getSum(int x, int y ) {
        return x + y;

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Properties p = new Properties();
        File file = new File("H:\\1\\1\\run.properties");
        p.load(new InputStreamReader(new FileInputStream(file),"UTF-8"));
        System.out.println("p = " + p);

        String className = p.getProperty("className");
        System.out.println(className);
        String methodName = p.getProperty("methodName");
        Class c = Class.forName(className);
        Method method = c.getDeclaredMethod(methodName,int.class,int.class);
        method.setAccessible(true);
        Integer i = (Integer) method.invoke(c.newInstance(), 3, 5);
        System.out.println(i);

    }
}
