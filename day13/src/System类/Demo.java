package System类;

/**
 * @author chenjie
 * @date 2021/5/17-10:20
 */
public class Demo {
    /*
    * System 类
    *   成员变量
    *       流
    *       System.in  输入流  InputStream  默认关联到键盘上
    *       System.out 输出流  PrintStream
    *       System.err   PrintStream
    * */

    public static void main(String[] args) {
//        System.out.println("abc");
//        System.err.println("abc");
//        System.out.println(123);
//        System.err.println(123);
        /*
        * 静态方法
        *   currentTimeMillis()
        *       获取到当前时间的毫秒值。从1970,1月1日0点0分
        * */

        /*
        * 有一些需求，需要时间间隔， 有效时间为 几天
        * */
        long time = System.currentTimeMillis();
        System.out.println(time);

        /*
        *  测试计算代码需要的时间
        * */

        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += i;
        }

//        exit(0)
        System.exit(0);
//        Process finished with exit code 0
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - time);

        /*
        * static void exit(int status) 退出JVM虚拟机，零表示正常终止
        * 非正常状态的数字都不是 0 ，JVM日志会打印
        * */
    }
}
