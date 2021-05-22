package Map.Collections;

/**
 * @author chenjie
 * @date 2021/5/21-15:29
 */
public class Demo {
    /*
    * 如果你的数据类型确定， 但是数据的个数不确定，这种情况下可以用可变参数，作为方法的形参
    *
    * 可变参数：
    *       可变参数写作形式
    *           数据类型...变量名
    *               任意个数据个数，可以是 0 到多
    *
    * 可变参数在方法中使用：
    *       当做一个数组使用
    *           数组是定长容器，可变参数不定长
    * 可变参数传递的实际参数形式
    *       可以是任意多个指定的可变参数类型，也可以是一个指定类型的数组
    * */
    public static int getSum(int...x) {
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        return sum;
    }
/*
* 数据类型确定，传入的数据个数不确定，相当于一个数组来使用
*
* */
    public static void main(String[] args) {
        getSum(3,4);
        int[] arr = {3,4,5};
        getSum(arr);

        getSum(3,4);

    }
/*
* 一个方法中只能有一个可变参数，并且这个可变参数必须在整个参数列表的最后位置
*       只能有一个可变参数，，当你传入多个参数时，不能判断是属于哪个可变参数
*       如果不是最后的位置，当传入多个参数时，不能判断传入的值是否属于其他的不可变参数。
*
*   fun(double...d,String...s)  --> 还是错的
*       风险控制，语法结构是风险评估
*
* */
    public static int getSum(int num1,int num2) {
        System.out.println("------------");
        return  num1 + num2;
    }
}
