package 异常.exception.自定义异常;

/**
 * @author chenjie
 * @date 2021/5/18-16:52
 */
public class Demo {
    /*
    * 定义一个类 以 Exception 结尾  如： IllegleAgeException
    * 必须在 Throwable 类 下
    *       继承一个 Exception 或者是 RuntimeException
    *
    * 如果自定义异常发生，需要让代码停止，可以称为RuntimeException，因为代码不会对运行时期异常
    * 提示进行处理
    * 如果自定义的异常发生之后，代码可以优化和解决的余地，不需要停止，可以让自定义类称为Exception
    *
    * RuntimeException  明确的错误
    * Exception  可以挽回的错误
    *
    * */
}
