package 枚举;

/**
 * @author chenjie
 * @date 2021/5/28-17:03
 */
public enum Weekday {
    MON(){
        public void eat(){
            System.out.println("eating");
        }
    };

    public abstract void eat();

    public static void main(String[] args) {
//        有了抽象类就成了子类对象
        System.out.println(Weekday.MON.getClass());

//        没有抽象类就是本类对象
    }
}

/*
* 1,构造私有化
* 2，将对象名字罗列出来
* 3，枚举项必须写在第一行，
* 4，可以定义普通成员，普通方法
* 5，构造方法需要私有
* 6，可以定义抽象方法，但是枚举项要重写抽象方法
*
* */
