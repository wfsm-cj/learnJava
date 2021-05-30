package 多线程;

/**
 * @author chenjie
 * @date 2021/5/28-14:12
 */
public class Demo_ {
    /*
    * 生命周期
    *       新建状态
    *       就绪态
    *       运行状态
    *       阻塞状态
    *       结束状态
    *   阻塞结束之后，回到就绪态
    *
    *   还有一种等待状态
    *
    * */
    /*
    * Thread 类中 内部的枚举类型 State。用于表示一个线程可以出现的所有状态
    *   六种状态
    *   Thread.State
    *       枚举类型
    *       NEW
    *       RUNNABLE   就绪
    *       BLOCKED      阻塞 被锁住了
    *       WAITING     无限期的等待另一个线程来执行特定操作
    *       TIMED_WAITING    休眠 sleep
    *       TERMINATED     退出线程
    * */

}
