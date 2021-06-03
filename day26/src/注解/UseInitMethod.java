package 注解;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author chenjie
 * @date 2021/6/2-17:02
 */
public class UseInitMethod {
    @InitMethod
    public void eat(){
        System.out.println("eat");
    }

    @InitMethod
    public void learn() { // 会自动运行的方法，不会带参数，没办法传参数
        System.out.println("learn");
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        /*
        * 先获取到带有 InitMethod ，，然后用反射 获取所有方法-->
        * 逐个验证，哪些方法有 这个InitMethod 注解
        * */
        Class c = UseInitMethod.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            /*
            * AccessibleObject
            *    boolean   isAnnotationPresent(Annotation 注解.class)
            * 验证一个方法是否带有指定注解的方式
            * */
            if (method.isAnnotationPresent(InitMethod.class)) {
                method.invoke(c.newInstance());
            }
        }

    }
}
