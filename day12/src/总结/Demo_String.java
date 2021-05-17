package 总结;

/**
 * @author chenjie
 * @date 2021/5/17-8:39
 */
/*
 *   lenth()
 *   charAt(int index)
 *   substring(int beginIndex)
 *   substring(int beginIndex, int endIndex)
 *   concat(String str)
 *   indexOf(String str)
 * lastIndexOf()
 *   replace(CharSequence old, CharSequence new)
 *   contains(CharSequence new)
 *   split(String regex)
 *   isEmpty()
 *   trim()
 *   toLowerCase()
 *   toUpperCase()
 *   equals()
 *  equalsIgnoreCase()
 * startsWith()
 * endsWith()
 *
 * toCharArray()
 * replaceAll()
 * replaceFirst(String regex,String replacement)
 * */
public class Demo_String {
    public static void main(String[] args) {
        String str = new String();
        str = new String(new char[]{'a','b','c'});
//       offset 偏离，偏离量
        str = new String(new char[]{'a','b','c'},1,2);

//        public String concat(String str)   若参数字符串为0，返回此对象，否则创建一个新的String 对象
        System.out.println(str.concat("cj"));

//  public String replace(char oldChar, char newChar)   返回一个新字符
        System.out.println(str.replace("o", "ff"));



    }
}
