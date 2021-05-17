package other;

/**
 * @author chenjie
 * @date 2021/5/16-16:20
 */


public class Demo {

    public static void update(StringBuilder str){
        str = new StringBuilder("xyz");
        System.out.println(str);
    }
    public static void main(String[] args) {

//        String str = "abc";
        StringBuilder str = new StringBuilder("abc");
        Demo.update(str);
        System.out.println(str);

        Person person = new Person("cj",26);
        Demo.setObj(person);
        System.out.println(person);
        System.out.println(person.name);
    }
    public static void setObj(Person obj){
        obj.name = "heh";
        System.out.println(obj.name);
        System.out.println(obj.toString());
    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
