package homework;

/**
 * @author chenjie
 * @date 2021/5/19-9:20
 */
public class Demo_ {
    public static void test0() {

    }
//    验证电话
    public static boolean check(String tel) throws Exception{
        if (tel == null) {
            throw new NullPointerException("电话号码不能为空");
        }
        if(tel.length() != 11) {
            throw new Exception("电话号码的长度必须为11");
        }
        if(tel.charAt(0) == '1') {
            throw new Exception("电话号码必须1开头");
        }
        if(tel.charAt(1) < '3' || tel.charAt(1) > '9') {
            throw new Exception("第二位错误");
        }
        /*
        * 验证字符串不是存数字
        *       1，遍历
        *       2， 正则
        * */

      return false;
    }
}
