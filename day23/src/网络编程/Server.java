package 网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author chenjie
 * @date 2021/5/29-10:37
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss  = new ServerSocket(6666);
        System.out.println("server is running");

        while(true) {
            /*
            * accept() 方法会阻塞并一直等待
            *   如果有多个客户端同时连接起来，ServerSocket 会把连接扔到队列里，然后一个一个处理。
            * 我们只需要通过循环 不断的调用 accept() 就可以获取新的连接
            * */
            Socket sock = ss.accept();
            System.out.println("connected from" + sock.getRemoteSocketAddress());
            Thread t = new Handler(sock);
            t.start();
        }
    }
}

class Handler extends Thread {
    Socket sock;

    public Handler(Socket sock) {
        this.sock = sock;
    }

    public void run(){
//        返回此 套接字 的输入 输出流
        try(InputStream input = this.sock.getInputStream()) {
            try(OutputStream output = this.sock.getOutputStream()){
                handle(input,output);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handle(InputStream input, OutputStream output) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));

        writer.write("hello \n");
        writer.flush();

        while(true) {
            String s = reader.readLine();
            if(s.equals("bye")) {
                writer.write("bye \n");
                writer.flush();
                break;
            }
            writer.write("ok"+ s +"\n");
            writer.flush();

        }


    }

}
