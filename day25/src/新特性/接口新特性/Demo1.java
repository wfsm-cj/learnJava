package 新特性.接口新特性;

/**
 * @author chenjie
 * @date 2021/6/1-12:22
 */
public interface Demo1 {
   /*
   * jdk 1.9
   *    接口私有方法
   * */
    default void function1(){
        fun();
    }
    static void function2(){
//        静态当中不能直接使用非静态

//        但是可以使用静态的私有方法

    }
    private void fun(){
        /*
        * 把默认的和静态的抽取出来，不被别人进行访问和修改
        *   为其他带有方法体的方法，使用
        * */
    }

    private static void fun2(){
        System.out.println("fun2");
    }
    public static void main(String[] args) {
//        匿名内部类调用接口
        new Demo1(){}.function1();

    }
//    public
}
