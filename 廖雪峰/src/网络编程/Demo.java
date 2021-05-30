package 网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author chenjie
 * @date 2021/5/28-21:40
 */
public class Demo {
    /*
    * ServerSocket类
    *      实现对指定IP 和 指定端口 的监听
    *
    * */
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);// 监听指定端口
        System.out.println("server is  running");
        
        while(true) {
//            public Socket accept()
//            侦听到要连接到此的 套接字 并接受它。 该方法将阻塞直到建立连接
            Socket sock = ss.accept();
            /*Socket
            * public SocketAddress getRemoteSocketAddress()
            *       一个SocketAddress 表示此套接字的远程端点，如果尚未连接，null
            * */
//            SocketAddress 抽象类：这个类代表一个没有协议附件的 Socket 地址
            System.out.println("connected from" + sock.getRemoteSocketAddress());
        }
        
    }
}

class Handler extends Thread {
    Socket sock;
    public Handler(Socket sock) {
        this.sock = sock;
    }

    public void run() {
        /*Socket类
        * public InputStream getInputStream()
        *   返回此套接字的输入流
        * public OutputStream getOutputStream()
        *   返回此套接字的输出流
        * */
        try(InputStream input = this.sock.getInputStream()){
            try(OutputStream output = this.sock.getOutputStream()){

//
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void handle(InputStream input, OutputStream output) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
    }
}
