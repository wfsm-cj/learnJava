package 异常.exception;

import sun.applet.Main;

/**
 * @author chenjie
 * @date 2021/5/18-10:54
 */
public class Demo1 {
    public static void getEleFromArr(int[] arr, int index)  throws Exception{
        if (arr == null) {
//            认为不合理。抛出exception
//            throw new Exception 或者 Exception任意一个子类对象（精准表述为什么会发生异常）
            throw new NullPointerException("数组不能为null");
        }

        if(index < 0 || index >= arr.length) {
//            运行时异常
            throw  new ArrayIndexOutOfBoundsException(index+"索引在数组中不存在");
        }

        /*
        * throw 一次只能抛一个异常
        * throws  用于声明异常类型
        *       在你的方法的声明上，声明这个异常
        *
        * */




    }

    public static void main(String[] args) throws Exception{
        int[] arr = {1,23,43,4};
        getEleFromArr(arr,3);

        /*
        * throw 抛出   只能抛出一个  后面必有一个异常对象出现 ，，在 throw 后会跟一个异常对象 new Exception()
        * throws 声明   只是声明，有没有还是个问题,声明和处理异常，就是声明
        * try...catch 处理异常
        * */


        try {
            arr = new int[]{1,2,3,4,5};
            getEleFromArr(arr,3);
        } catch (Exception e) {
            System.out.println("e = " + e);
            e.printStackTrace();
        }

        /*
        * try...catch ... catch...语句
        * */

        /*
        * 多catch 语句中，如果捕获的异常之间没有字符类继承关系，异常捕获没有先后顺序，
        * 如果捕获多个异常之间有子父类继承关系
        *   1，先去捕获子类异常（明确的异常），后捕获
        *   2，
        * */

        try {
//            arr = new int[]{1};
            arr = null;
            getEleFromArr(arr,3);

        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("越界"+e);
        }catch(Exception e) {
            System.out.println(e);
        }


        /*
        *   try{}catch{}
        *  ....
        *   finally{
        *       流资源关闭
        * }
        * */




    }

    public static void use() {
        try {
            int i = 10/1;
//            return i;  // finally 里面不要写return ，写了的话会覆盖finally的return
            /*return 不能阻止 finally 运行，finally中return会覆盖上面的return*/
            System.exit(0); // 能阻止finally不执行的只有停止虚拟机
        } catch (Exception e) {
            e.printStackTrace();
//            return 20;
        }finally{//实际的开发当中都不会去设计return在finally中
//            有没有问题都会执行这个语句
//            必须一定运行的代码
            System.out.println("heheh");
//            return 25;
        }





        /*
        * try{
        *      发生了异常，你并不想处理，但是有一定要处理的方法
        * }finally {
        *
        * }
        *
        * try 代码块不能单独存在
        * try 不一定 必须和 catch 在一起  try。。。finally
        * try 必须跟着 catch 或者 finally
        * */


/*
*
* */



    }

}
