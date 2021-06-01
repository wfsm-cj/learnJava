package homework.student;

import java.io.FileWriter;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author chenjie
 * @date 2021/5/31-9:40
 */
public class Student implements Comparable<Student>{
    private String name;
    private double total;

    public Student(String name, double total) {
        this.name = name;
        this.total = total;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public int compareTo(Student o) {
        return (int)(o.total - this.total);
    }

    public static void main(String[] args) {
        TreeSet<Student> ss = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("please input");
            String str = sc.nextLine();
            String[] arr  = str.split(",");
            Student s = new Student(arr[0],Integer.parseInt(arr[1]));
           ss.add(s);
            System.out.println(ss);// TreeSet 不用写equals 和 hashcode

//            FileWriter fw  = new FileWriter("Info.txt");
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", total=" + total +
                '}';
    }
}
