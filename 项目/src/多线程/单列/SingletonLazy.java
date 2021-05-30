package 多线程.单列;

/**
 * @author chenjie
 * @date 2021/5/28-15:21
 */
public class SingletonLazy {

    private SingletonLazy(){}
    public static Object obj = new Object();

//    成员位置声明一个本类对象
    private static SingletonLazy sl;
//    没有创建空间 ，需要的时候才创的空间

//    创建和使用唯一的对象
    public static SingletonLazy getInstance() {
//
        if(sl == null) { // 双重判断锁，，进入锁会浪费时间，设置一个判断，拦截不必要的进入锁
        synchronized (obj){

            if(sl == null) {// 多线程 就会创建多个对象
                sl = new SingletonLazy();

            }
        }
        }

        return sl;
    }
}


/*
*   饿汉式比懒汉式好
*       饿汉式： 用空间换时间
*       懒汉式： 用时间换空间
*       时间比空间更珍贵
*
* */
