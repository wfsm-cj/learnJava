package 异常.exception.自定义异常;

/**
 * @author chenjie
 * @date 2021/5/18-16:58
 */
/*
* 年龄，金钱，身份证，，，
* */
/*
* 编译时期异常，发生了必须进行处理
* */
public class MyNumberException  extends Exception{
    public MyNumberException() {
    }

    public MyNumberException(String message) {
        super(message);
    }

//    自定义异常类当中，可以随意定义出任意的方法功能
    public void checkAge(int age) {
        if(age < 0 || age > 200) {
            System.out.println("不符合条件");
        }

    }
}
