package IO.对象序列化;

import java.io.*;
import java.util.ArrayList;

/**
 * @author chenjie
 * @date 2021/5/26-14:44
 */
/*
* 解决 EOF  end of file 问题
* 将 对象 写入一个 集合中， 每次读取就读取这个集合，就不用考虑 是否 end of file
* */
public class Demo_ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writePerson();
//        readPerson();
    }
/*
    public static void writePerson() throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("person.txt")
        )){
            ArrayList<Person> list = new ArrayList<>();
            list.add(new Person("cj",26));
            list.add(new Person("哈哈",17));

            oos.writeObject(list);
        }
    }*/

    /*
    * 反序列化时，由 JVM 直接构造出 Java 对象，不调用构造方法，构造方法内部的代码，在反序列化时根本不可能执行
    * */
    public static void readPerson() throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("person.txt")
        )){
            ArrayList<Person> list = (ArrayList<Person>)ois.readObject();
            for (Person person : list) {
                System.out.println(person.toString());
            }
        }
    }
}
