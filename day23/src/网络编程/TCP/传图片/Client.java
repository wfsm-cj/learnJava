package 网络编程.TCP.传图片;

import java.io.*;
import java.net.Socket;

/**
 * @author chenjie
 * @date 2021/5/29-16:34
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",6666);
        File f = new File("H:\\1\\111.png");
        try (BufferedInputStream localInput = new BufferedInputStream(new FileInputStream(f))){
                BufferedOutputStream output = new BufferedOutputStream(s.getOutputStream());
                byte[] b = new byte[1024];
                int len;
                while((len = localInput.read(b)) != -1) {
                    output.write(b,0,len);//
                    output.flush();  //
                }
                 s.shutdownOutput();

            }

        //        BufferedInputStream input = new BufferedInputStream(s.getInputStream());
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()))){
//                int len;
//                while((len = reader.read()) != -1) {
//                    System.out.print((char)len);
//                }
                System.out.println(reader.readLine());
            }

        }

    }
