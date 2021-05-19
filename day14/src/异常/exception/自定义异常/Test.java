package 异常.exception.自定义异常;

/**
 * @author chenjie
 * @date 2021/5/18-17:02
 */
public class Test {
    public static void main(String[] args) {
        int age = -50;

        try {
            if(age < 0 ) {
                throw new MyNumberException("age not 小于 0");
            }
        } catch (MyNumberException e) {
//            e.printStackTrace();
            e.checkAge(age);
        }


    }
}
