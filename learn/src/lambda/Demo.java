package lambda;

/**
 * @author chenjie
 * @date 2021/5/14-15:11
 */
public class Demo {
    public static void main(String[] args) {
      Usb usb ;
        new Usb(){

            @Override
            public void insert(String type) {
                System.out.println(type +" use usb");
            }
        };

      usb = (type) -> {
          System.out.println(type+"usb");
      };


    }
}
