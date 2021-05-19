package 异常.exception;

import java.io.IOException;

/**
 * @author chenjie
 * @date 2021/5/18-16:28
 */
public class Demo__overridde {
    public void eat() {
        System.out.println("eatting");
    }

//    public void say() throws
    public void sleep() throws Exception{
        System.out.println("exception");
    }
}
/*
* 重写的方法的异常 必须 小于等于父类的异常
* */
class son extends Demo__overridde {
    /*
    * 父类没有异常，子类不能抛出其他异常，只能在子类处理这个异常
    * 不能抛出
    * */
    @Override
    public void eat()   {
        super.eat();
        try {
            int i = 10/0;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println();
        }
    }


    /*
    * 父类有异常 ，子类重写的异常声明，只能是父类原有异常类型本身
    * 或者是原有异常的子类异常
    * 如果父类声明的异常，没有子类异常存在
    * 因此 重写方法要声明和父类相同的异常，或者不声明异常
    * 如果你抛出 运行时异常也不会报错，，运行异常 是没有处理价值的，所以不会报错
    * */
    @Override
    public void sleep() throws Exception {
        super.sleep();
    }
}
