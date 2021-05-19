package 异常.exception;

import java.io.FileNotFoundException;

/**
 * @author chenjie
 * @date 2021/5/18-10:24
 */
public class Demo {
    public static void main(String[] args) {
//        int[] arr = new int[1024*1024*1024];// OutOfMemoryError

        /*
        * Exception
        *   1，编译时期异常
        *
        *   2，运行时异常
        *       RuntimeException
        * */
        /*
        *  JVM 处理 Exception
        * */

        getEle(4);
    }
/*
*  getEle  抛给 main 方法  抛给 JVM虚拟机，于是JVM做了两个动作
* 1，将异常信息以红色突出显示打印在控制台 System.err
* 2，停止代码
*      如果代码中没有对于异常的处理方法，那么JVM虚拟机会将异常一层一层的抛出
* 最后到JVM虚拟机 ，报错和停止代码
*
* */


    public static void getEle(int index) {
        int[] arr = {12, 13};
        System.out.println(arr[index]);
    }
    /*
    * 手动处理异常
    *       异常的声明：
    *           有编译时异常，编译就会无法通过，需要在异常所在的方法声明上，声明该方法可能出现的编译时异常
    *       异常的处理：
    *           通过某些格式来捕获和处理异常，可以定义自己处理异常的逻辑
    *           try ...catch
    *           try...catch ...finally
    *           try.... finally
    * */
    /*thorw 关键字
    *
    *   当程序遇到某种情况时，程序员认为这种情况与现实生活不符合，就把当前的情况的描述
    * 封装到一个异常对象中，通过throw关键字将异常抛出
    * throw new Exception ,,或者 Exception任意一个子类对象（将异常发生的详细信息描述清楚）
    *
    * */

    public static void checkFile(String fileName) throws Exception{
        if (fileName == null) {
            throw new Exception("文件名不能为null");//编译时异常
        }
        if("abc.txt".equals(fileName)) {
            throw new FileNotFoundException("heh");

        }

    }
}
