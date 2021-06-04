import java.io.Serializable;

/**
 * @author chenjie
 * @date 2021/6/3-19:55
 */
public class Test {
    public static void main(String[] args) {
      int i =99;
      test(i);
        System.out.println(i +100);

    }
    public static void test(int i) {
        i += 100;
    }


    public static void test0() {
        for (int i = 0; i < 6; i++) {
            int k = ++i;
            while(k<5) {
                System.out.println(i);
                break;
            }
        }
    }
}

interface He extends Serializable,Cloneable {}
