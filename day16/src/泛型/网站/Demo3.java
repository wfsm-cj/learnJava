package 泛型.网站;


/**
 * @author chenjie
 * @date 2021/5/21-21:21
 */
public class Demo3 {


    public static void main(String[] args) {
//        Pair<String> p = new Pair<String>("1","2")

        Pair[] arr = new Pair[2];
        Pair<String>[] ps = (Pair<String>[])arr;

        ps[0] = new Pair<String>("a","B");
        arr[1] = new Pair<Integer>(1,3);

        Pair<String> p = ps[1];
        System.out.println("p = " + p);
//        System.out.println(p.getName());
        /*
        *
        * 要安全的使用泛型数组，必须扔掉 arr 的引用。。 如果存在原来数组arr的引用
        * arr，就可以随意的修改里面的数据，当使用泛型数组去提取内容的时候，就会类型转换错误
        * */

        Pair<String>[] ps1 = (Pair<String>[])new Pair[2];
        /*
        * 带泛型的数组实际上是编译器的类型擦除
        * */
        Pair[] arr1 = new Pair[2];
        System.out.println(ps1.getClass() == arr1.getClass());//true
//        带泛型
        String s1 = ps1[0].getName();
//        不带泛型 强转
        String s2 = (String) arr1[0].getName();

//      所以我们不能直接创建泛型数组 T[] , 因为擦拭后代码 变为 Object[]
//        必须借助 Class<T> 来创建泛型数组


//        可变参数创建数组
        String[] arr4 = Pair.asArray("23","34","df");
        for (String s : arr4) {
            System.out.println(s);
        }
    }

}
