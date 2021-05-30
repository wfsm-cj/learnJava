package homework;

import java.io.*;
import java.util.*;

/**
 * @author chenjie
 * @date 2021/5/30-22:22
 */
public class Student implements Comparable<Student>{
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public int compareTo(Student o) {
       return  (o.getChinese()+ o.getMath()+ o.getEnglish()) - (this.chinese+this.english+this.math) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return chinese == student.chinese && math == student.math && english == student.english && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, chinese, math, english);
    }

    public static void test() {
       Scanner sc = new Scanner(System.in);
        Set<Student> students = new TreeSet<>();
        for (int i = 0;i < 2; i++) {
            System.out.println("please input a student");
            String str = sc.nextLine();
            String[] arr  = str.split(",");
            Student s = new Student(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
            students.add(s);
        }

        System.out.println(students);
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("H:\\1\\1\\1111.txt")));
            Iterator<Student> it = students.iterator();
            while(it.hasNext()) {
                Student s = it.next();
                writer.write(s.getName()+","+(s.getEnglish()+s.getMath()+s.getChinese()));
                writer.newLine();
                System.out.println(s.getName()+","+(s.getEnglish()+s.getMath()+s.getChinese()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", total=" + (chinese+math+english) +

                '}';
    }

    public static void main(String[] args) {
        test();
    }
}
