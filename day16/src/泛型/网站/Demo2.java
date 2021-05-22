package 泛型.网站;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeSet;

/**
 * @author chenjie
 * @date 2021/5/21-20:37
 */
public class Demo2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<String> clazz = String.class;
        System.out.println(clazz);
        String str = clazz.newInstance();
        System.out.println(str+"---");

       /* public Constructor<?>[]  getConstructors()
        返回此类公共构造方法的 Constructor 对象数组

        public Constructor<T> getConstructor(Class<?>...parameterTypes)

        Constructor对象中
            public T newInstance(Object...initargs)
                通过调用此对象表示的构造方法来创建新对象
        */
        Class<TreeSet> clazz1 = TreeSet.class;
//        Constructor<Integer> cons = clazz1.getConstructor(String.class);
//        System.out.println(cons);

        Constructor<TreeSet>[] arr = (Constructor<TreeSet>[]) clazz1.getConstructors();

        for (Constructor<TreeSet> item : arr) {
            System.out.println(item);

        }

        Constructor<Integer>[] arr1 = (Constructor<Integer>[]) Integer.class.getConstructors();
        for (Constructor<Integer> i : arr1) {
            System.out.println("i = " + i);

        }

        Constructor<Integer> cons = Integer.class.getConstructor(int.class);
        System.out.println(cons);

        cons = Integer.class.getConstructor(String.class);
        System.out.println(cons);
        Integer i = cons.newInstance("123");
        System.out.println(i);

        Pair<String>[] ps = null;
//        不能创建带泛型的数组   但是可以把数组创建后强制转换为 想要类型数组
        Pair<String>[] ps1 = (Pair<String>[])new Pair[2];
    }
}
