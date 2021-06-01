package 反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenjie
 * @date 2021/5/31-17:16
 */
public class Demo4 {
    /*
    * 定义出一个ArrayList<String> 集合,泛型中只能存储String类型数据, 利用反射机制,向该集合中成功添加Integer类型数据*/
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<String> list = new ArrayList<>();
        Class<ArrayList> c  = ArrayList.class;
        Method add = c.getMethod("add",Object.class);
        add.invoke(list,23);
        System.out.println(list);
    }


}
