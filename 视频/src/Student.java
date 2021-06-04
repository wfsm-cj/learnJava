import java.util.*;

/**
 * @author chenjie
 * @date 2021/6/3-19:55
 */
public class Student {
    private String name;
    private int age;

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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("张三",20));
        students.add(new Student("李四",20));
        students.add(new Student("王五",20));
        students.add(new Student("李柳",20));
        students.add(new Student("王萌萌",20));
        students.add(new Student("李四",20));

        for (Student student : students) {
            System.out.println(student);
        }

//        2
        Iterator<Student> it = students.iterator();
        Map<String,Integer> map = new HashMap<>();
        while(it.hasNext()) {
            String firstName = String.valueOf(it.next().getName().charAt(0));
            if(map.containsKey(firstName)) {
                map.put(firstName,map.get(firstName) + 1);
            }else{
                map.put(firstName,1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"有"+entry.getValue()+"个");
        }

    }
}
