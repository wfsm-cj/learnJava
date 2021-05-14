package stringBuilder;

/**
 * @author chenjie
 * @date 2021/5/14-11:12
 */
/*
* StringBuilder  感觉跟集合差不多呢
* */
public class Demo {
    /*
    * StringBuilder 是一个可变的字符序列
    * String 浪费内存空间
    * */
    public static void main(String[] args) {
/*
*       字符串是常量，双引号所包含的字符序列，不能改变
*       存储在常量池中，
*       在进行大量字符串拼接的使用场景下，浪费内存
* */
//        "a"  "b"  "ab"  "c" "abc" "d" "abcd"  浪费空间
        String s = "a" + "b" + "c" + "d";

//        stringBuilder  称为 字符串的缓冲区 ，，字符串的生成器
//        AbstractStringBuilder  继承，，里面有一个 char[]  不是私有的
        /*
        * 可变大小的容器，， 自动增大
        *   这个字符数组 可以自己修改  没有 private 和 final 的限制
        *   StringBuilder  大量拼接的时候用
        * */
        
        
        /*
        * StringBuilder 构造方法
        *   StringBuilder()   创建一个生成器，初始容量大小 16
        * 跟进源代码可以看出 StringBuilder 大小
        * */
        StringBuilder sb = new StringBuilder();
        
//        StringBuilder(int count)  创建一个生成器，初始容量为提供的参数count字符大小
        
        

//      StringBuilder(String str)  创建出一个初始容量为 16 + str.length 字符数组大小
        sb = new StringBuilder("hello");

        /*--capacity  能力，容量，资格，地位，生产力
        * capacity()  获取当前生成器容器大小
        * length()    StringBuilder中你所存储的实际字符的个数
        * */
        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());

        /*
        * 添加功能
        *   append()   将数据追加到序列   返回此对象的一个引用
        *   insert(int offset, obj)    指定位子加
        * */

        StringBuilder sb1 = new StringBuilder();
        sb1.append(15); //返回 this 对象
        sb1.append("cj").append("hello");

        sb1.insert(2,"hehe");
        System.out.println(sb1);

//       sb.append(x)  和 sb.insert(sb.length(),x)  具有相同效果  StringBuilder 感觉跟List 差不多呢
        sb.insert(sb.length(),"end");


        /*
        *  删除功能
        *       deleteCharAt()
        *       delete(int startIndex, int endIndex)
        * */


//        public StringBuilder deleteCharAt(int index)
        sb.deleteCharAt(2);
        System.out.println("sb = " + sb);

//      public StringBuilder delete(int start, int end)
        sb.delete(0,4);
        System.out.println("sb = " + sb);


        /*
        * 替换和反转
        *  public StringBUilder replace(int start, int end ,String str)
        *  public StringBuilder reverse()
        * */

        System.out.println("sb1 = " + sb1);
        sb1.replace(0,4,"*");
        System.out.println("sb1 = " + sb1);

        sb1.reverse();
        System.out.println("sb1 = " + sb1);


/*
* 以上方法返回的都是 StringBuilder
* */








    }



}
