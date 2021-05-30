package 网络编程.TCP.传图片;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author chenjie
 * @date 2021/5/29-16:34
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        System.out.println("server is running");

        Socket s = ss.accept();
        System.out.println("connected form" + s.getRemoteSocketAddress());
        try(BufferedInputStream input = new BufferedInputStream(s.getInputStream());){
            try(BufferedOutputStream localOutput = new BufferedOutputStream(new FileOutputStream("H:\\11\\1.png"))){
                byte[] b = new byte[1024];
                int len;
                while((len = input.read(b)) != -1) {
                    localOutput.write(b,0,len); //关了流会自己 push 进去
                    localOutput.flush();
                }
            }
            try(        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()))
            ){
                writer.write("上传成功");
//            s.shutdownOutput();
            }

        }






    }

    public static byte[] getImageBytes() throws FileNotFoundException,IOException{

        return  null;
    }
}
