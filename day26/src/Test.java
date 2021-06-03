/**
 * @author chenjie
 * @date 2021/6/2-12:18
 */
public class Test {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        if(x++ >4 & ++y >5) {
            x++;
        }
        System.out.println(x+"---"+y);

    }
}
