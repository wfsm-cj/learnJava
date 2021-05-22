package learn;

/**
 * @author chenjie
 * @date 2021/5/21-8:25
 */
public class Demo {
    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(12,32);
        add(p);
        new Pair<Integer>(2,3){
            public void eat() {
                System.out.println("eat"+this.getFirst());
            }
        }.eat();
    }
    static int add(Pair<? extends Number> p) {//可以传入，但是不能修改操作，不知道具体的类型
//        System.out.println(p.getClass());
        Number first = p.getFirst(); //后面是 捕获的 ？extends Number ，不可预测实际类型,具体类型无法请确定
        Number last = p.getLast();

//        p.setFirst(null);

        /*
        * List<? extends Integer> 的限制
        *   1，允许调用 get() 方法获取 Integer的引用
        *   2， 不允许调用 set(? extends Integer) 并传入 任何 数据类型的引用（null除外），因为你传入的 通配符有很多种类型，不能识别那种类型与之匹配
        *
        * 总结： 使用 extends 通配符 表示可以读，不可以写
        * 使用类似 < T extends Number> 定义泛型类时表示：
        *       泛型类型限定为 Number 以及 Number 的子类
        * */
        return p.getFirst().intValue()+p.getLast().intValue();
    }
}
