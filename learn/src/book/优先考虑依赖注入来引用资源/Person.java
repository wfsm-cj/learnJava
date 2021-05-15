package book.优先考虑依赖注入来引用资源;

/**
 * @author chenjie
 * @date 2021/5/15-10:52
 */
public class Person {
/*
   这样写的话， Person 使用的手机 就只能是 苹果手机了，换成Android，
   就会修改Person内部代码,,这样做很傻逼，一般来说，都是在Person类的
   构造函数传入 接口 类，（接口类可以表示各种子类类型），

   依赖注入 (Dependency Injection) 简称DI
*/
    /*Phone phone = IPhone.getInstance();*/

    Phone phone;

    public void playGame() {
        phone.playGame();
    }

    public void pay() {
        phone.pay();
    }

    public void call() {
        phone.call();
    }

   /* public static Person getInstance() {
        return new Person();
    }*/
    public Person(Phone phone) {
        this.phone = phone; // 从外面获取这个phone ，而不是在类中自己定义phone
    }

    public static Person getInstance(Phone phone) {
        return new Person(phone);
    }

    public static void main(String[] args) {
        Person person = new Person(new IPhone());
        person.playGame();
        person.call();
    }
}
