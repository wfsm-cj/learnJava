package 设计模式.单例模式;

/**
 * @author chenjie
 * @date 2021/6/1-19:08
 */
public class LazySingleton {
    private volatile static LazySingleton instance;//需要加一个 volatile ，，有指令重排，可能会使后面的线程拿到，开辟了空间，赋值了，但是没有初始化的对象

    private LazySingleton(){}

    public   static LazySingleton getInstance() {

        if(null == instance) {// 锁放在最外面每次判断都会加锁 很浪费时间
            synchronized (LazySingleton.class){
                if(null == instance) {//双重加锁  在锁外面可能会有多个已经进入判断了
                    instance = new LazySingleton();
                }
            }
        }
        return  instance;
    }

    /*
    *  javap  -c  Demo.java 反汇编
    *
    *       new 一个对象的时候
    *   JVM会
    *       0  new  #2  // #2 常量池信息 Constant pool
    *       3 dup   // 复制地址
    *       4  invokespecial   #3  // 初始化
    *       7  astore_1
    *       8  return
    * 1,开辟一个空间
    * 2，初始化空间
    * 3，赋值给 demo 变量
    *
    * compiler，JIT，CPU 都可能会使指令重排序
    *   两个线程，其中一个，开辟了空间，赋值了，但是没有初始化空间，，这就会导致后面线程去访问这个变量就是只是开辟了空间
    * ，赋值了，但是没有初始化， 其他线程拿到了就会报错
    * 使用 volatile
    *
    * */
}
