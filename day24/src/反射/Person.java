package 反射;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/31-11:04
 */
public class Person {
    private String name;
    private int age;
    String sex;
    public static final String bir = "23";
    public String address;
    protected  String heh;


    private void eat(){
        System.out.println("eating");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        可以加泛型   类名.class
        Class<Person> c = Person.class;
        System.out.println("c = " + c);

//        对象名.getClass()
        Person p = new Person();  // person类  p可能是它的子类对象，泛型。。 所以 p.getClass() 可能为子类的Class对象
        Class<? extends Person> c1 = p.getClass();

//        Class.forName(全类名String)
        Class<?> c2 = Class.forName("java.lang.String");// forName() 返回的是一个 Class<?> ,,所有的类型可能会被返回


        /*
        * Class<T>
        *     Constructor<?>[]  getConstructors()
        *           返回所有公共 public 构造方法
        *
        * */

        Class<Person> cc = Person.class;
        Constructor[] conArr = cc.getConstructors();
        System.out.println(Arrays.toString(conArr));

        /*
        * Constructor<?>[] getDeclaredConstructors()
        *   获取所有的构造器   declared 宣布，宣称
        * */
        Constructor[] conArr2 = c1.getDeclaredConstructors();
        System.out.println(Arrays.toString(conArr2));
    }

    private Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
