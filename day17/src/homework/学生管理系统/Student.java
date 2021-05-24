package homework.学生管理系统;

import java.util.Date;

/**
 * @author chenjie
 * @date 2021/5/22-19:37
 */
public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private int age;
    private String birthday;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Student(String id, String name, int age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }



    public Student() {
    }

    @Override
    public int compareTo(Student o) {
       return (int) (Long.valueOf(this.id) -  Long.valueOf(o.id));
    }
}
