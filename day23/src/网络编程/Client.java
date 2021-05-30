package 网络编程;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author chenjie
 * @date 2021/5/29-10:49
 */
public class Client {
    public static void main(String[] args) throws IOException {
        /*
        * public Socket(String host,int port)
        *   host - 主机名，或者为null,表示回送地址
        *   port - 端口号   ?? 什么是回送地址
        * */
        InetAddress ia  = InetAddress.getLocalHost();
        String host = ia.getHostName();
        System.out.println(host);
        Socket sock = new Socket(host,6666);
        try(InputStream input = sock.getInputStream()){
            try(OutputStream output = sock.getOutputStream()){

            }
        }
    }

    private static void handle(InputStream input, OutputStream output) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);
        System.out.println("[server]" + reader.readLine());
        while(true) {
            System.out.println(">>>"); //打印提示
            String s = sc.nextLine(); //读取一行输入
            writer.write(s);
            writer.newLine(); // 换行符
            writer.flush();
            String resp = reader.readLine();
            System.out.println("<<< "+ resp);
           /* if(resp.equals("bye")) {
                break;
            }*/

        }
    }
}
