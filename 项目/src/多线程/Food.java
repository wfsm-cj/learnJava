package 多线程;

/**
 * @author chenjie
 * @date 2021/5/28-9:54
 */
public class Food {
    private  String name;
    private  String desc; //描述
    private boolean flag = true; // true 表示可以生成， false 表示可以消费
//    可能 消费了 没有生成的东西 就会有 null


    /*
    * public final void notify()
    *   唤醒在此对象监视器上等待的单个线程。如果所有线程都在此对象上等待，则会选择唤醒其中一个线程。
    * 选择是任意性的，并在对时限作出决定时发生
    *
    * public final void wait()
    *   在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
    *   当前线程必须拥有此对象的监视器。该线程释放对此监视器的所有权并等待（放弃对监视器的所有权）（就是关闭锁）
    *
    * */
//    谁有属性谁提供方法
    // 生产产品
    public synchronized void set(String name,String desc) {
        if(!flag) { // 不能生产
//                需要将 cpu 的资源让出来，  sleep() 让出来但是不会释放对象锁
            try {
                this.wait();  // 线程进入等待状态，释放监视器的所有权（对象锁）
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        this.setName(name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setDesc(desc);
        flag = false;
        this.notify();
    }

    public Food() {
    }

    //    消费产品
    public synchronized void get() {
        if(flag) { //  不能消费
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.getName()+ "-->" + this.getDesc());
        flag = true;
        this.notifyAll(); // 唤醒所有的线程
    }

    public Food(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
