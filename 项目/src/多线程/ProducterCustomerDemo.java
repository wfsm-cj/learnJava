package 多线程;

/**
 * @author chenjie
 * @date 2021/5/28-9:53
 */

/*
*  sleep 和 wait 的区别
*   sleep
*       让线程进入休眠状态，让出 CPU 的时间片，不释放对象监视器的所有权(对象锁)
*   wait
*       让线程进入等待状态，让出CPU的时间片，并释放对象监视器的所有权，等待其他线程 notify(),notifyAll() 唤醒
* */
public class ProducterCustomerDemo {

    public static void main(String[] args) {
        Food food = new Food();
        Producter p = new Producter(food);
        Customer c = new Customer(food);
        Thread t = new Thread(p,"producter");
        Thread t1 = new Thread(c,"customer");

        t.start();
        t1.start();

    }
}

/*
* 消费者
* */
class Customer implements Runnable{
    private Food food; // 消费 food

    public Customer(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
//        生产多少次就会消费多少次
        for (int i = 0; i < 20; i++) {
            food.get();
        }
    }
}


//生产者   生产菜
class Producter implements Runnable{
    private Food food;

    public Producter(Food food) {
        this.food = food;
    }


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(i % 2 == 0) {
                food.set("锅包肉","描述，酸甜口味");
            }else{
                food.set("佛跳墙","描述：大补");
            }

        }
    }
}
