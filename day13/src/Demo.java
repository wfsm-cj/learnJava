import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author chenjie
 * @date 2021/5/18-8:46
 */
public class Demo {

    public static void main(String[] args) {
        double d1 = 123456.36789;
        DecimalFormat nf = new DecimalFormat("0000.000");
        System.out.println("nf = " + nf.format(d1));

        nf = new DecimalFormat("#");
        System.out.println("nf = " + nf.format(d1));

        nf = new DecimalFormat(".##");
        System.out.println("nf = " + nf.format(d1));

        nf = new DecimalFormat("00,000.00");
        System.out.println("nf = " + nf.format(d1));

        NumberFormat nf1 = NumberFormat.getCurrencyInstance();
        System.out.println(nf1.format(d1));

        nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf1.format(d1));

    }
}
