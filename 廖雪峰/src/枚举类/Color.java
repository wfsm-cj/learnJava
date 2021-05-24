package 枚举类;

/**
 * @author chenjie
 * @date 2021/5/22-11:04
 */

/*
* Java使用 enum 定义枚举类型， 他被编译器编译为 final class Xxx extends Enum{}
* 通过 name() 获取常量定义的字符串，注意不要使用 toString()
* 通过 ordinal() 返回常量定义的顺序 （无实质意义）
*
* 可以为 enum编写构造方法，字段 和 方法
*   enum 的 构造方法要声明为 private，字段 强烈建议声明为 final;
*   enum 适合用在 switch 中
* */
public enum Color {

    /*
    * enum 类型
    *      enum定义的类型就是 class，只不过他有以下几个特点
    *           1，定义的 enum 类型总是继承自 java.lang.Enum, 且无法被继承
    *           2，只能定义出 enum 的实例，而无法通过 new 操作符创建 enum实例
    *           3，定义的每个实例都是引用类型的唯一实例
    *           4，可以将enum 类型用于switch
    *
    * */
    RED(1,"红色"),GREEN(3),BLANK(2),YELLOW(4);
        /*相当于
        *  public static final Color RED = new Color();
        *  public static final Color GREEN = new Color();
        * private Color(){}
        * */

    /*
    * 因为 enum 是一个 class， 每个枚举的值都是 class 实例。。所以可以调用一些方法
    *       public final String name()
    *           返回此枚举常量的名称。。 但是优先考虑使用 toString() ,因为 toString()可以重写，返回更加友好的名称
    *
    *       public final int ordinal()
    *            返回枚举常量的序数（初始常量序数为 零 ）
    *
    *      可以根据这个 ordinal() 找对应的文件，但是，如果不小心修改了枚举的顺序， ordinal() 返回的数字是不同的，
    * 但不会报错，所以不要依靠 ordinal() 的返回值。。
    * */


//    public final int colorValue;

//    private Color(int colorValue) {
//        this.colorValue = colorValue;
//    }


    /*
    * 如果其含有 public 构造器 ，那么在类的外部就可以通过这个构造器来新建实例，显然这时实例的数量
    * 和值就不固定了，这与定义枚举类的初衷相矛盾，为了避免这样的形象，就对枚举类的构造器默认使用private
    * 修饰，假设为枚举类的构造器显示指定其他访问控制符，编译出错
    * */
//    RED(1,"红"),GREEN(3),BLANK(2),YELLOW(4);

    public final int colorValue;  // 字段也可以是非 final 类型，即可以在运行期修改。。但是不推荐这样做

    private Color(int colorValue){
//        System.out.println(this.ordinal());
//        System.out.println(colorValue);
        this.colorValue = colorValue;
//        System.out.println(this.ordinal());
        this.chinese = null;
    }

   /* protected Enum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }*/

    public static void main(String[] args) {
        System.out.println(Color.RED.ordinal());
        System.out.println(Color.RED.colorValue);
        System.out.println(Color.RED);

        switch (Color.RED) {
            case GREEN:
                System.out.println("red");
            case RED:
                System.out.println("hhh");
                break;
            default:
                throw new RuntimeException("没有匹配的颜色");
                /*
                *  加上 default 语句，可以在漏写某个枚举常量时自动报错，从而及时发现错误
                * */
        }

    }

    private final String chinese;
    private Color(int colorValue, String chinese) {
        this.colorValue = colorValue;
        this.chinese = chinese;
    }


    @Override
    public String toString() {
        /*
        * 覆写 toString() 的目的是在输出时更有可读性
        * */
        return super.toString()+this.chinese;
        /*
        * 判断枚举常量的名字，要始终使用 name() 方法，决不能调用 toString()
        * */
    }
}
