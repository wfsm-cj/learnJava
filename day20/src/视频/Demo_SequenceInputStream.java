package 视频;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author chenjie
 * @date 2021/5/26-20:06
 */
public class Demo_SequenceInputStream {

    /*
    * SequenceInputStream  表示其他输入流的逻辑串联， 可以将流 合并
    * 构造方法：
    *   public SequenceInputStream(InputStream s1, InputStream s2)
    *   public SequenceInputStream(Enumeration< ? extends InputStream> e)
    *           传入一个输入流的枚举类型对象
    * */
//    merge 合并
    public static void merge(Enumeration<? extends InputStream> es) throws IOException{
        try(SequenceInputStream sis = new SequenceInputStream(es);
            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream("H:\\1\\abc.mp4")
            )
        ) {
            int len;
            byte[] bytes = new byte[1024];
            while((len = sis.read(bytes)) != -1) {
                bos.write(bytes,0,len);
                bos.flush();
            }
        }

    }
    public static void main(String[] args) throws IOException {
        try(
        InputStream in1 = new FileInputStream(new File("H://1//1-temp-a.mp4"));
        InputStream in2 = new FileInputStream(new File("H://1//2-temp-a.mp4"));
        InputStream in3 = new FileInputStream(new File("H://1//3-temp-a.mp4"));
        InputStream in4 = new FileInputStream(new File("H://1//4-temp-a.mp4"));
        ) {
            /*
             * Vector  矢量  List<> 的实现类
             *   public Enumeration<E>  elements()
             *       返回此组件的枚举，
             * */
            Vector<InputStream> v = new Vector<>();
            v.add(in1);
            v.add(in2);
            v.add(in3);
            v.add(in4);

            Enumeration<InputStream> temp = v.elements();
            /*Enumeration
             *   boolean hasMoreElements()
             *       测试此枚举类是否包含更多的元素
             *   E  nextElement()
             *       返回此枚举的下一个元素
             * */
            System.out.println(temp.hasMoreElements());
//            少一部分的原因： nextElement()  已经调用了一次
//            System.out.println(temp.nextElement());
            merge(temp);
        }
    }
}
