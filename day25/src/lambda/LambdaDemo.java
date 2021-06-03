package lambda;

/**
 * @author chenjie
 * @date 2021/6/1-14:31
 */
public class LambdaDemo {
    public static void main(String[] args) {
//        new MyInter(){
//            @Override
//            public void fun() {
//                System.out.println("fun");
//            }
//        }.fun();

        /*
        *    (参数列表) -> { 方法体 }
        *           lambda  箭头运算符。你需要实现的唯一的抽象方法，分割成两部分
        * 唯一抽象方法的参数列表，，只需要写参数名称，不用写参数类型
        * {方法体}  表示方法的实现过程
        * lambda 表示一个函数式接口的实现类对象
        * */
//        MyInter my = () -> {
//            System.out.println("hehe");
//        };
//        my.fun();

        MyInter my4 = new MyInter() {
            @Override
            public boolean fun(int x,int y) {
                return false;
            }
        };
        my4 = (x,y) -> x == y;
    }
}

@FunctionalInterface
interface MyInter{
    public abstract boolean fun(int x,int y);
}
