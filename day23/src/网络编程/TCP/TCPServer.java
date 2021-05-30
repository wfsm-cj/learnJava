package 网络编程.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author chenjie
 * @date 2021/5/29-15:17
 */
public class TCPServer {
    /*Socket类
    *   Socket(String address, int port)   监听的主机
    * */
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        /*ServerSocket
        * 一个服务器端对应多个客户端请求
        *    Socket accept()
        *        获取到目前正在向我发送请求的套接字对象
        *
        * 通过你所获取到的 Socket 对象，获取到指定的流资源
        * */
        System.out.println("server is running");

//        while(true) {
            Socket s  = ss.accept();
            System.out.println("connected from" + s.getRemoteSocketAddress());

            InputStream input = s.getInputStream();
            OutputStream output = s.getOutputStream();

//            从客户端接收
            byte[] b = new byte[1024];
            int len;
            while((len = input.read(b)) != -1) {
                System.out.println("客户端： "+ new String(b,0,len));
            }

//            发送给客户端
            output.write("呵呵".getBytes());
            output.write("哦".getBytes());
            /*
            * public void shutdownOutput()
            *   禁用此套接字的输出流
            * */
            s.shutdownOutput();
             ss.close();
//        }

    }
}
