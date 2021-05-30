package homework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * @author chenjie
 * @date 2021/5/30-21:57
 */
public class Demo {
    public static void copyTxt() throws FileNotFoundException {
        File dir = new File("H:\\1");
        if(dir.isDirectory()) {
         File[] files =  dir.listFiles();
            File newDir = new File("H:\\1\\1");
            if(!newDir.exists()) {
                newDir.mkdirs();
            }
            for (File file : files) {
                if(file.getName().endsWith(".txt")){
                    InputStream input = new FileInputStream(file);


                    OutputStream output = new FileOutputStream(new File(newDir,file.getName()));
                    copyFile(input,output);
                }
            }

        }else{
            System.out.println("目录不是一个文件夹");
        }


    }

    public static void copyFile(InputStream input, OutputStream output) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(input, "GBK"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output,StandardCharsets.UTF_8))){
            String str;
                while((str = reader.readLine()) != null) {// 读不到了返回 null
                    writer.write(str);
                    writer.newLine();
                    writer.flush();
                }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        copyTxt();
    }
}
