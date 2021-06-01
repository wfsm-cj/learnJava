package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author chenjie
 * @date 2021/5/31-16:47
 */
public class Demo_暴力反射 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Person> c = Person.class;
        Constructor con = c.getDeclaredConstructor(String.class);
        /*
        * 获取的私有成员，私有构造，但是不能运行或使用
        * 暴力反射   AccessibleObject类  Method，Constructor,Field 共有父类（基类）
        *       提供了将反射的对象标记为在   “使用时 ”  取消默认Java语言访问控制检查的能力
        *   void  setAccessible(boolean flag)
        *       设置为true时
        *   1， true  取消访问权限检查
        *   2， false 或者没有给对象调用该方法，一律认为执行需要有访问权限控制
        * */
        con.setAccessible(true);
        Person p = (Person) con.newInstance("cj");
        System.out.println(p.getName());


        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(p,26);
        System.out.println(age.get(p));


        Method eat = c.getDeclaredMethod("eat");
        eat.setAccessible(true);
        eat.invoke(p);
        /*
        *
        *
        * */

    }
}
