package Map.学生管理系统;

/**
 * @author chenjie
 * @date 2021/5/21-16:49
 */
public class Student {
    private String name;
    private String id;
    private int age;
    private String birthday;

    public Student(String name, String id, int age, String birthday) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.birthday = birthday;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
