package IO.对象序列化;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/26-14:05
 */
public class Person implements Serializable {
//    private static final long serialVersionUID = 123L;
    private String name;
    private int age;
//    private  String birthday;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    public static void writePerson() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("person.txt")
        );

        Person p = new Person("cj",20);
        Person p1 = new Person("张三",19);
// NotSerializableException  当实例需要序列化时
            oos.writeObject(p);
            oos.writeObject(p1);

        oos.close();
    }

    public static void readPerson() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("person.txt")
        );
//        EOF   end of file 文件到达末尾
        Person p = (Person)ois.readObject();
        System.out.println(p.getName()+ p.getAge());
//  必须强制转型  Object   可能抛出的异常 ClassNotFoundException   InvalidClassException
        Person p1= (Person)ois.readObject();
        System.out.println(p1.getName()+ p1.getAge());
//        ois.readObject()
        ois.close();


        /*
        * 把对象写到集合中，
        *       读取集合，不用管它读几个对象
        *
        * */
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writePerson();
        readPerson();
    }
}
