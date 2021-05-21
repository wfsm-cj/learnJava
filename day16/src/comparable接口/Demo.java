package comparable接口;

import set集合.Student;

import java.util.TreeSet;

/**
 * @author chenjie
 * @date 2021/5/20-16:51
 */
public class Demo {
    public static void main(String[] args) {
        TreeSet<Student> tree = new TreeSet<>();
        tree.add(new Student("张三",20));
        tree.add(new Student("ww",15));
        tree.add(new Student("cj",18));
        tree.add(new Student("ls",20));
        tree.add(new Student("cc",25));
//        System.out.println(tree);
    }
}
