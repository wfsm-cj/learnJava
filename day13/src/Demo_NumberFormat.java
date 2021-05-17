import java.text.NumberFormat;

/**
 * @author chenjie
 * @date 2021/5/17-16:36
 */
public class Demo_NumberFormat {
    /*
    * 将 数字 表现为 金钱
    * NumberFormat 类
    *   抽象类  但是可以通过静态方法 获取对象实例
    *   static final NumberFormat getInstance()  返回一个对象
    * */
    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getInstance();

        /*
        * void setMaximumFr
        * */

        nf.setMaximumIntegerDigits(2);
        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(5.6999));

        /*
        * getCurrencyInstance()
        * */
        System.out.println(NumberFormat.getCurrencyInstance().format(4.2223435));//￥4.22  四舍五入


    }
}
