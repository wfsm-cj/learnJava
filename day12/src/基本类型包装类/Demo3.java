package 基本类型包装类;

/**
 * @author chenjie
 * @date 2021/5/14-16:37
 */
public class Demo3 {
    /*
    * 自动装箱和拆箱   -- 集合数据存储
    *   基本数据类型 与 其对应引用数据类型包装类之间，不需要任何方法，可以自由转换
    * */
    public static void main(String[] args) {
 //     自动装箱  Integer i = Integer.valueOf(10);
        Integer i = 10;

//        自动拆箱  int w = w.intValue(i)
        int w = i;

        /*
        *   1,  i  先拆箱 + 88 然后自动装箱  --> i
        * */
        i = i + 88;
    }
}
