package homework;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/31-9:23
 */
public class 复制一个类型的文件 {
    public static void test() {

    }

    public static void main(String[] args) {
        File director  = new File("H:\\1");
        File target = new File("H:\\1\\1");
        if(!target.isDirectory()) { //  判断它是否存在 。。 不能判断是否为路径，因为你不知道这个东西是不是路径
//            不能判断他是否存在，因为他可能是个文件
            target.mkdirs();
        }

        if(director.isDirectory()) {
            File[] files = director.listFiles();
            for (File file : files) {
                if(file.isFile()) {
                    String fileName = file.getName();
                    if(fileName.endsWith(".txt")) {
                        String name = target + "\\" + fileName;
                        copyFile(file,name);
                    }
                }



            }
        }else{
            System.out.println("error director path");
        }

    }

    public static void copyFile(File file,String target) {
        try(OutputStream output = new FileOutputStream(target);
            InputStream input = new FileInputStream(file)
        ){

            byte[] b = new byte[1024];
            int len;
            while((len = input.read(b)) != -1) {
                System.out.println("!11");
                output.write(b,0,len);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
