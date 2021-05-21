package set集合;

import java.util.TreeSet;

/**
 * @author chenjie
 * @date 2021/5/20-15:19
 */
public class Demo_treeset自然排序 {
    public static void main(String[] args) {
        /*
        * Student 要在TreeSet 集合中进行排序，因此必须实现排序接口
        *
        * */
        TreeSet<Student> tree = new TreeSet<Student>();
        tree.add(new Student("张三",20));
        tree.add(new Student("ww",15));
        tree.add(new Student("cj",18));
        tree.add(new Student("ls",20));
        tree.add(new Student("cc",25));
        System.out.println(tree);
        /*
        *
        * */
    }
}
