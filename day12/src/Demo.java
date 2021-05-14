import javax.lang.model.element.ElementVisitor;
import java.util.Locale;

/**
 * @author chenjie
 * @date 2021/5/14-10:37
 */
public class Demo {

    public static void main(String[] args) {
//        public String  repalce (CharSequence target,CharSequence replacemnet)

//public String[] split(String regex)
        String date = "2021-05-14";
        String[] sArr = date.split("-");
        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }


//        public String trim()  去除两边的空格
        String spaceStr = "                              111dfas d f  ";
        System.out.println("spaceStr.trim() = " + spaceStr.trim());
        System.out.println("spaceStr = " + spaceStr);
        
    String s = "i Love you";
    String initial = String.valueOf(s.charAt(0)).toUpperCase(Locale.ROOT);
    String lastLetter  = s.substring(1).toLowerCase();
        System.out.println( initial + lastLetter);
        initial = s.substring(0,1);
        System.out.println("initial = " + initial);

    }
}
