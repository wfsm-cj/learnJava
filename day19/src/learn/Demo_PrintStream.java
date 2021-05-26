package learn;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author chenjie
 * @date 2021/5/25-20:25
 */
public class Demo_PrintStream {
    public static void main(String[] args) {
        StringWriter buffer  = new StringWriter();
        try (PrintWriter pw = new PrintWriter(buffer)) {
            pw.println("Hello");
            pw.println(12345);
            pw.println(true);
        }
        System.out.println(buffer.toString());
    }
}
