package 线程.wait和notify;

import java.lang.invoke.VarHandle;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author chenjie
 * @date 2021/5/28-17:25
 */
public class TaskQueue {
    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String s) {
        this.queue.add(s);
        this.notifyAll();
    }

    public synchronized String getTask() {

        while(queue.isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
//        不是空就出队列
        return queue.remove();

    }
}
