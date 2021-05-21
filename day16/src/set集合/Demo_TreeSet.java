package set集合;

import java.util.TreeSet;

/**
 * @author chenjie
 * @date 2021/5/20-15:04
 */
public class Demo_TreeSet {
    /*
    * TreeSet 按照你的想法来排序
    *       元素有序
    *   TreeSet() 根据元素的自然排序进行排序
    *   TreeSet(Comparator c)  根据指定的比较器进行排序
    * */
    public static void main(String[] args) {
//        既想去重复，又想排序 。。才使用 TreeSet
//        TreeSet 中 存储的引用数据类型，必须要实现排序的接口，才能完成排序，如果没有实现排序接口，那么直接报错
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(88);
        tree.add(22);
        tree.add(9);
        tree.add(-6);
        tree.add(88);
        System.out.println("tree = " + tree);
    }

}
