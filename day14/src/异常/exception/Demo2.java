package 异常.exception;

/**
 * @author chenjie
 * @date 2021/5/18-11:40
 */
public class Demo2 {
    public static void main(String[] args)  {
            String s = null;
//            int n = Integer.parseInt(s);

        try {
            if (s == null) {
                throw new Exception("不能为null");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("hello");
        }
    }
}
