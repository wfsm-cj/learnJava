package 视频;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/26-21:59
 */
public class Person implements Serializable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       /* ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("abc.txt")
        );*/
//        writePerson();
        readPerson();
    }

    public static void writePerson() throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("Info.txt")
        );


        ){
            oos.writeObject(new Person("cj",26));
            oos.writeObject(new Person("zs",21));

        }
    }

    public static void readPerson() throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("Info.txt")
        );
//            InputStreamReader isr = new InputStreamReader(ois)
        ){

                while(true) {
                    System.out.println(((Person) ois.readObject()).toString());
                }


        }catch(EOFException e){
//
            System.out.println("已读完");
        }
    }
}
