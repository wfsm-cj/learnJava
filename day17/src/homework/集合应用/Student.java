package homework.集合应用;

import java.util.*;

/**
 * @author chenjie
 * @date 2021/5/22-19:20
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
        Set<Student> students = new HashSet<>();
        students.add(new Student("zs",20));
        students.add(new Student("ls",20));
        students.add(new Student("ww",19));
        students.add(new Student("lm",18));
        students.add(new Student("zs",20));

//        System.out.println(students);

        Iterator<Student> it = students.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        Map<String,Integer> map = new HashMap<>();
        for (Student student : students) {
            String key = student.getName().charAt(0)+"";
            boolean flag = map.containsKey(key);
            if(flag) {
                map.put(key,map.get(key) + 1);
            }else{
                map.put(key,1);
            }
        }
        for (String s : map.keySet()) {
            int count = map.get(s);
            System.out.println(s +" -----" + count);
        }


    }
}
