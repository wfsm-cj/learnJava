package homework;

import java.io.File;
import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/27-19:05
 */
public class Demo {
    public static void main(String[] args) {
        File file = new File("H:\\2222");
        int count = 0;
        while(file.isDirectory()) {
            String[] str = file.list();
            count++;
            if(str.length == 0) {
                break;
            }

            file = new File(file,str[0]);
            System.out.println(file.getName());

            if(!file.exists() || !file.isDirectory()) {
                break;
            }

        }
    }

}
