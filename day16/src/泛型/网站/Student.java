package 泛型.网站;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author chenjie
 * @date 2021/5/20-22:26
 */
public class Student extends Person<String>{
    public Student(String name, String gendar) {
        super(name, gendar);
    }

    public static void main(String[] args) {
        Class<Student>  clazz = Student.class;
//        public Type getGenericSuperclass()
//          返回表示此 Class 所表示的实体的直接超类的 Type

       Type t =  clazz.getGenericSuperclass();
       if(t instanceof ParameterizedType) {
           ParameterizedType pt = (ParameterizedType) t;
           Type[] types = pt.getActualTypeArguments();
           Class<?> typeClass = (Class<?>) types[0];
           System.out.println("typeClass = " + typeClass);
       }

    }
}
