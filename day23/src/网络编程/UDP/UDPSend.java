package 网络编程.UDP;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author chenjie
 * @date 2021/5/29-11:28
 */
public class UDPSend {
//    UDP 的发送端

public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    while(true) {
       String s = sc.nextLine();
        byte[] b = s.getBytes();


    //    将要发送的数据  封装和解析
//    DatagramPacket dp = new DatagramPacket(b,b.length, InetAddress.getLocalHost(),8080);
DatagramPacket dp = new DatagramPacket(b,b.length,InetAddress.getByName("127.0.0.1"),8888);

//   发送数据  DatagramSocket
    DatagramSocket ds = new DatagramSocket();
    /*
    * send(DatagramPacket dp)
    * */
    ds.send(dp);//将 dp 数据报包，发送到指定的ip 和端口

//    关闭资源
//    ds.close();

//    接收
    byte[] buffer = new byte[1024];
    DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
    ds.receive(packet);
    String resp = new String(packet.getData(),packet.getOffset(),packet.getLength());
        System.out.println(resp);
//ds.disconnect();
//    if("886".equals()) {
//
//    }

    }

}
}
