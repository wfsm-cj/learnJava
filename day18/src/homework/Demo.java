package homework;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/24-19:53
 */
public class Demo {
    public static void main(String[] args) throws IOException {
//  为什么 不写 能出来路径，但不能用
        File path = new File("H:\\中公Java\\learnJava");
//        System.out.println(path.getAbsolutePath());
//        System.out.println(path.isDirectory());
        String fileName = "";
        if(path.isDirectory()) {
            File[] files = path.listFiles();
            for (File file : files) {
                if(file.isFile()) {
                    String name = file.getName();
                    if(name.startsWith("abc") && name.endsWith(".txt")) {
                        System.out.println(name);
                        fileName = name;
                    }
                }

            }
        }else{
            System.out.println("error");
        }


//

//        System.out.println(fileName);
//        读取文件
        InputStream input = new FileInputStream(fileName);
        int n; //返回的 字节大小 int
        while((n = input.read()) != -1) {
            System.out.println((char)n);
        }
        input.close();

        input = new FileInputStream(fileName);
        byte[] finalArr = new byte[12];
        byte[] arr = new byte[4];
        int len;//返回 读入数据的长度
        int count = 0;
        String str = "";
        while((len = input.read(arr)) != -1) {
//            System.out.println(new String(arr,0,len));
            /*System中
            * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
            * src - 源数组  srcPos - 原数组中的起始位置
            * dest - 目标数组  destPos - 目标数据中的起始位置
            * length - 要复制的数组元素的数量
            * */
//            System.out.println(new String(arr) +"----"); // ????????????????????????????????????
//            System.arraycopy(arr,0,finalArr,count++ * arr.length,len);

           str +=  new String(arr,0,len);

        }
        input.close();

//        System.out.println(Arrays.toString(finalArr));
        System.out.println(str);

        OutputStream output = new FileOutputStream("abc1.txt");
        output.write(str.getBytes());

        output.close();
    }
}
