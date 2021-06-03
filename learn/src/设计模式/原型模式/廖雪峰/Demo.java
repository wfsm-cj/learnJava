package 设计模式.原型模式.廖雪峰;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author chenjie
 * @date 2021/6/2-9:34
 */
/*
*
* */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        String[] original = {"Apple","Pear","Banana"};
        /*
        * public static char[] copyOf(char[] original, int newLength)
        *       复制指定的数组，截取或用 null 字符填充，以使副本具有指定的长度
        *       original - 要复制的数组
        *       newLength - 要返回的副本的长度
        * */
        String[] copy = Arrays.copyOf(original,original.length);
        System.out.println(Arrays.toString(copy));

        Student stu = new Student();
        stu.setId(123);
        stu.setName("Bob");

        Student stu1 =  stu.clone();
        System.out.println(stu1 == stu);
        System.out.println(stu1);
        System.out.println(stu1.equals(stu));

    }
}

class Student implements Cloneable{
    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /*
* 要克隆一个对象，这个类必须实现 Cloneable 接口
* 还要 重写 Object类中的 clone() 方法
* protected Object clone()
*   创建并返回此对象的一个副本：
*       x.clone() != x
*       x.clone().getClass()  == x.getClass()
*       x.clone().equals(x)
*
* 如果此对象的类不能实现接口 Cloneable , 则会抛出 CloneNotSupportedException
* 。。
*  这个方法执行的是该对象的 “浅表复制” ，而不是 “深层复制” 操作
* Object 类本身不实现Cloneable， 所以在类为 Object 的对象上调用 clone将会导致在运行时抛出异常
* */
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

   /* public Object clone() { //  Object 中的 clone 方法 返回的是 Object类型，需要强转类型
        Student stu = new Student();
        stu.id = this.id;
        stu.name = this.name;
        return stu;
    }*/

//    重写 Object 父类方法
    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
//        super.clone() 返回的是 Object 强转 为 Student
    }

    /*
    * 原型模式，更好的方式是定义一个 copy() 方法，返回明确的类型：
    *    而不是调用 Object 的 clone() 方法
    * */
    public Student copy() {
        Student stu = new Student();
        stu.id = this.id;
        stu.name = this.name;
        return stu;
    }
    /*
    * 原型模式应用不是很广泛，因为很多实例会持有类似文件，Socket资源，而这些资源是无法复制给另一个对象共享的，只有存储简单类型
    * 的“值” 对象可以复制
    * 小结:
    *       原型模式是根据一个现有对象实例复制出一个新的实例，复制出的类型和属性与原实例相同
    * */
}
