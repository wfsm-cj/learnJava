import java.io.*;
import java.util.Scanner;

/**
 * @author chenjie
 * @date 2021/5/25-9:04
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        /*
        * InputStream
        *   FileInputStream
        *       read()
        *       
        *
        *       wirte()
        * */
//        test();
        test2();
    }
    
    public static void test() throws IOException {
        File f = new File("G:\\save");
        System.out.println(f.mkdir());
//        File（File f，String path）
        File f1 = new File(f,"1.txt");
        File f2 = new File(f,"1.ppt");
        f1.createNewFile();
        f2.createNewFile();
    }

    public static void test1() throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("Info.txt");
        if(!file.exists()) {
            file.createNewFile();
        }
        OutputStream fos = new FileOutputStream(file,true);
        System.out.println("please input your number");
        while(true) {
            String s = sc.next();
            if("886".equals(s)) {
                break;
            }else{
                fos.write(s.getBytes());
            }
        }
        fos.close();
        FileInputStream fis = new FileInputStream(file);
        byte[] b = new byte[1024];
        int len;
        while((len = fis.read(b)) == -1) {
            System.out.println(new String(b,0,len));
        }

        fis.close();
    }


    /*
    * 中文乱码问题 ，一个中文占有的字符个数不同，看编码表
    * GBK  ： 一个中文 2个字节
    * UTF-8 ：3个字节
    * 字节流将一个中文拆分读取，造成了中文字符不完整，效果乱码
    * 结论： 不适用字节流读取带有中文的文本
    * */
    public static void test2() throws IOException {
     FileInputStream fis = new FileInputStream("Info.txt");
     int n;
     byte[] b = new byte[10];
      while((n = fis.read(b)) != -1) {
          System.out.println(new String(b, "UTF-8"));
      }
     fis.close();
    }
}
