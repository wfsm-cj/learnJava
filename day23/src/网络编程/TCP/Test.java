package 网络编程.TCP;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/29-21:44
 */
public class Test {

    public static void main(String[] args) throws IOException {
        File f = new File("H:\\11\\1.png");
        try(BufferedInputStream input = new BufferedInputStream(new FileInputStream("H:\\1.txt"))){
            try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("H:\\111.txt"))){
                int len;
//                byte[] b = new byte[1024];
                while((len = input.read()) != -1) {
                    output.write(len);
                }
            }
        }
    }
}
