package 异常.exception;

/**
 * @author chenjie
 * @date 2021/5/18-15:41
 */
public class Demo_异常常用方法 {
    public static void main(String[] args) {
        /*
        * 构造方法
        *   new Throwable(String message)
        *   可以通过构造来更精准的描述
        * */

        int[] arr = {1,4,3};
        try {
            getEleFromArr(arr,5);
        } catch (Exception e) {
//            获取构造方法中封装的信息  getMessage()
            System.out.println(e.getMessage());
//            toString() 获取到 异常类型，以及封装在构造函数中的msg
            System.out.println(e.toString());
//            printStackTrace() 异常发生的详细信息（异常类型，异常信息描述，代码的异常位置），追踪到标准的错误流中
            e.printStackTrace();
            /*标准的异常信息追踪方式  printStackTrace() */
        }

    }

    public static void getEleFromArr(int[] arr ,int index) throws Exception{
        if (arr == null) {
            throw new Exception("数组不能为null。。。。。。。。");
        }
        if(index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("索引不存在");
        }

        System.out.println(arr[index]);


        /*
        * 重写异常
        *   子类重写父类方法情况下，要求子类声明的异常不能多于和大于父类异常
        * */







    }
}
