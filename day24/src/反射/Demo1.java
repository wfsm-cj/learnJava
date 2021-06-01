package 反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/31-14:02
 */
public class Demo1 {
    /*
    * Class.class
    * obj.getClass()
    * Class.forName(String s)
    *
    * 返回构造
    * Constructor<?>[]  getConstructors();
    * Constructor<?>[]  getDeclaredConstructors();   返回所有的构造器
    * 返回一个构造
    *   Constructor getConstructor(Class<?>...parameterTypes)
    *       返回单个公共构造方法  Class<?> 表示各种类型的数据
    *
    * */

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Person> c = Person.class;
        System.out.println(c);
        System.out.println(Person.class);

//        返回某一个公共的构造器  getConstructor(Class<?>...elementsType)
        System.out.println(c.getConstructor());
        System.out.println(c.getConstructor(String.class, int.class));

//        返回某一个私有的构造器  getDeclaredConstructor(Class<?>...elementsType)
        System.out.println(c.getDeclaredConstructor(String.class));

        /*Constructor
        * 创建对象
        *  T newInstance(Object...initargs)  //构造器是什么类型 返回就是什么类型
        *                  构造运行的时候传递的实际参数
        * */

       Person p =(Person) c.getConstructor(String.class,int.class).newInstance("cj",26);
//       如果之前没有加泛型  需要 强制转换
        System.out.println(p.getName());

//        私有的只能拿不能用
//        Person p1 = c.getDeclaredConstructor(String.class).newInstance("cc");
//        System.out.println(p1.getName());

//        利用反射的机制，可以快速创建
        /*Class
        * T  newInstance()
        *      创建此 Class 对象所表示的 公共修饰的，空参数构造。在Class对象中
        * 直接调用 newInstance() 方法
        * */
        System.out.println(Person.class.newInstance());

        /*
        * 获取成员变量
        *   Filed[]  getFields()
        *       返回公共成员变量对象的数组
        * */
        System.out.println(Arrays.toString(c.getFields()));

        /*
        * getDeclaredFields();
        * 获取Person类型 所有的成员变量
        * */
        System.out.println(Arrays.toString(c.getDeclaredFields()));

//        System.out.println(Arrays.toString(c.getDeclaredConstructors()));

        /*
        * getFiled(String s)  返回某个 public 的 公共成员变量
        * */
        Field field = c.getField("bir");
        System.out.println("field = " + field);

        /*
        * getDeclaredFiled()   可以获取私有的成员变量
        * */
        System.out.println(c.getDeclaredField("name"));

//        对成员变量的操作
        /*Field
        *  set(Object obj,Object value)
        *       给 obj 赋值 value  。。 在 field字段上
        *   get(Object obj)
        *       获取 obj 对象中的 field 字段的值
        * */
        field = c.getField("address");
        p = Person.class.newInstance();
        field.set(p,"china");
        String s = (String) field.get(p); // 返回的是 Object
        System.out.println(s);

        Person cj = c.getConstructor(String.class, int.class).newInstance("cj", 26);
        field.set(cj,"chengdu");
        System.out.println(field.get(cj));

        /*
        * 获取成员方法
        * Method[]  getMethods()
        *       返回公共成员方法对象的数组
        * Method[] getDeclaredMethods()
        *       返回所有的方法，但不包括继承的方法
        *
        * */
        System.out.println(Arrays.toString(c.getMethods()));
        System.out.println(Arrays.toString(c.getDeclaredMethods()));
//        c.getMethod(String methodName,Class<?>... parameterTypes);
//                            方法名                参数列表
        Method setName =  c.getMethod("setName",String.class);
        System.out.println("setName = " + setName);

//        Method getDeclaredMethod(String methodName, Class<?> ... parameterTypes)
        Method eat = c.getDeclaredMethod("eat");

        /*Method
        * 使用方法
        *       invoke(Object obj, Object ... values)
        *           obj 方法所在对象     values - 实际参数列表
        * */
        setName.invoke(p,"haha");
        System.out.println(p.getName());


        /*
        * 暴力反射
        *     对私有成员进行访问和使用时
        *
        * */
    }
}
