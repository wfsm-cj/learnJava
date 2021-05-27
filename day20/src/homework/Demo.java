package homework;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author chenjie
 * @date 2021/5/26-19:04
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File f = new File("Info.txt");
        try(FileReader fr = new FileReader(f)){
            char[] ch = new char[20];
            String str = "";
            int len;
            while((len = fr.read(ch)) != -1) {
                str += new String(ch,0,len);
            }
            System.out.println(str);
        }
    }
}
