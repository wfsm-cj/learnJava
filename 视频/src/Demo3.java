import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/6/3-20:14
 */
public class Demo3 {
    public static void main(String[] args) {
//        1
        MyInterface instance1 = (x) -> {
            System.out.println(Arrays.toString(x.getBytes()));
        };
        instance1.show("cc");
//  2
        new MyInterface(){
            @Override
            public void show(String s) {
                System.out.println((Integer.parseInt(s) + 10));
            }
        }.show("20");

//        3
        new MyInterfaceImpl().show("dfaddf");
    }
}
@FunctionalInterface
interface  MyInterface {
    void show(String s);
}

class MyInterfaceImpl implements  MyInterface{

    @Override
    public void show(String s) {
        StringBuilder str = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(i == (arr.length - 1)) {
                str.append(arr[i]);
            }else{
                str.append(arr[i]).append("--");
            }
        }
        String target = str.toString();
        System.out.println(target);
    }
}