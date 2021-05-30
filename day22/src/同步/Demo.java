package 同步;

/**
 * @author chenjie
 * @date 2021/5/28-10:05
 */
public class Demo {
    public static void main(String[] args) {
        /*
        * 1，如果方法是非静态的： 方法的同步锁对象就是 this 关键字  synchronize(this)
        * 2，如果这个方法是静态的： synchronize(Class.class)
        * */

        /*
        * StringBuffer 和 StringBuilder
        *      StringBuffer 每一个方法都带有 synchronize ， 慢
        *
        * 判断锁对象
        * 获取锁对象带走
        * 运行完了归还锁对象
        * */
    }
}
