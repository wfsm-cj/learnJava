package set集合;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author chenjie
 * @date 2021/5/20-16:26
 */
public class Demo_comparator {
    public static void main(String[] args) {
        TreeSet<Student> tree  = new TreeSet<>(
                new Comparator<Student>(){
                    @Override
                    public int compare(Student o1, Student o2) {
                        /*
                        * 第一个参数表示预计要添加到集合当中的元素
                        * 第二个参数，表示集合中已存在的元素
                        * */
                        int number  = o1.getAge() - o2.getAge();
                        return number == 0? o1.getName().compareTo(o2.getName()) : number;
                                /*
                                * Compare 和 Comparator
                                * */
                    }
                }
        );
        tree.add(new Student("张三",20));
        tree.add(new Student("ww",15));
        tree.add(new Student("cj",18));
        tree.add(new Student("ls",20));
        tree.add(new Student("cc",25));
        System.out.println(tree);


        /*
        * 区别：
        *      如果是TreeSet调用的空参构造，直接默认调用Comparable接口中 compareTo
        *       有参构造，比较规则根据 Comparator 实现类的 compare规则进行比较
        *
        *       参数方面
        *           compareTo  一个参数  this表示要添加进去的元素
        *           compare    两个参数  第一个参数表示预计要添加数据
        *
        *           comparator 更灵活一些
        * */
    }
}
