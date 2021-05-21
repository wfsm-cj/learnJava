package set集合;




public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


/*
* compareTo 比较规则
*   将预计要添加到集合中的元素理解成this对象
*
* 0：表示重复
*  大于 0 ； 证明预计添加到集合中的元素，比集合中元素大，位置靠后排列
* 小于 0 ： 比集合中元素小，位置排前面
* */
    @Override
    public int compareTo(Student o) {// o 表示集合中已存在的每一个元素，
//        System.out.println(this.name);
        /*
        * this代表要添加的对象
        * */
       int number = this.age - o.age;
       return number == 0? this.name.compareTo(o.name) : number;
       /*
       * number不为0 判断姓名 否则直接返回 this.age - o.age
       * */

    }
}
