package homework;

import java.util.*;

/**
 * @author chenjie
 * @date 2021/5/19-19:01
 */
public class Demo {
    public static void test() {
        String[] arr = {"1","2","3","4","5","6","7","8","9","10"};
        /*
        * Arrays.asList() 获取的是 Arrays 里面的内部类 ArrayList
        * 和 java.util.ArrayList 都是继承 AbstractList
        * remove，add 等方法 AbstractList中是默认 throw UnsupportedOperationException 而且不作任何操作
        * */
        List list = Arrays.asList(arr);
//   需要把 Arrays 下的 ArrayList 转为 java.util.ArrayList
        list = new ArrayList(list);

        list.add(2,"2ADD");
        System.out.println(list.get(5));
        System.out.println(list.remove(6));
        System.out.println(list.set(7, "7Modify"));

        Iterator it = list.iterator();
        while(it.hasNext()) {
           String s = (String)it.next();
            System.out.print(s+"  ");
        }

    }

    public static void test0() {
        List list = new ArrayList();
        list.add("def");
        list.add("hello");
        list.add("def");
        list.add("def");
        list.add("hi");

        ListIterator it = list.listIterator();
        while(it.hasNext()) {
            String s = (String)it.next();
            if("def".equals(s)) {
                it.remove();
            }
        }
        System.out.println(list);

    }

    public static void test1() {
        List list = new ArrayList();
        list.add(new Person("cj",26,"female","sichuan"));
        list.add(new Person("张三",23,"male","河南"));
        list.add(new Person("李四",22,"male","北京"));
        list.add(new Person("王五",25,"male","河南"));
        ListIterator it = list.listIterator();
       while(it.hasNext()) {
           Person p = (Person) it.next();
           if("李四".equals(p.getName())) {
               it.add(new Person("zhao6",24,"female","guangzhou"));
           }
           if("王五".equals(p.getName())) {
               it.remove();
           }
           p.print();
       }

        for (Object o : list) {
            ((Person)o).print();
        }

    }
    public static void main(String[] args) {
        test();
        /*
        * 会自动识别右边的是什么类型，不会直接按照 Object 的 API 执行
        * */
        Object a = 1;
        System.out.println("a = " + a);
        test0();
        test1();
        test2();

    }

    public static void test2() {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        int listIndex = list.size() ;

        LinkedList linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        long startTime = System.currentTimeMillis();
        list.add(0,"aa");
        list.add(listIndex,"cc");
        list.remove(0);
        list.remove(listIndex);
        long endTime = System.currentTimeMillis();
        long gapList = endTime - startTime;
        startTime = System.currentTimeMillis();
        linkedList.addFirst("aa");
        linkedList.addLast("cc");
        linkedList.removeFirst();
        linkedList.removeLast();
        endTime = System.currentTimeMillis();
        long gapLink = endTime - startTime;
        System.out.println("gapLink = " + gapLink);
        System.out.println("gapList = " + gapList);

    }
}


class Person {
    private String name;
    private int age;
    private String gendar;
    private  String address;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGendar() {
        return gendar;
    }

    public String getAddress() {
        return address;
    }

    public Person(String name, int age, String gendar, String address) {
        this.name = name;
        this.age = age;
        this.gendar = gendar;
        this.address = address;
    }

    public void print() {
        System.out.print("name = " + name);
        System.out.print("age = " + age);
        System.out.print("gendar = " + gendar);
        System.out.println("address = " + address);
    }
}