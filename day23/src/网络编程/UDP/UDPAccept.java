package 网络编程.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chenjie
 * @date 2021/5/29-11:40
 */
//服务器端
public class UDPAccept {
    /*
    * 聊天室要写显示类，和写入类
    * */
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8888);
        byte[] buffer = new byte[100];
        Scanner sc = new Scanner(System.in);

        while(true) {

        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        /*DatagramSocket
        *   public void receive(DatagramPacket p)
        *   从此套接字接受数据报包。当此方法返回时，DatagramPacket 的缓冲区填充了接收的数据，数据报包也包含发送方
        * 的Ip地址，和端口号
        * */
//        receive() 带有阻塞的效果，等待你的发送端有发送数据
//        System.out.println("准备接收数据");
        ds.receive(packet);
//        System.out.println("接收数据完毕");
        /*DatagramPacket
        *   public int getOffset()
        *       返回将要发送或接受到的数据的偏移量
        *   public int  getLength()
        *       返回将要发送或接受的数据的长度
        *
        *   getPort()
        *       返回某台远程主机的端口号，此数据报将要发往该主机或者是从该主机接受到的
        *   getAddress()
        *       获取发送端的地址
        * */
//        System.out.println(Arrays.toString(buffer));
        String s  = new String(packet.getData(),packet.getOffset(),packet.getLength());
        System.out.println(s);


//        发送数据

        byte[] data = sc.nextLine().getBytes();
        /*DatagramPacket
         *   public void setData(byte[] buf)
         *       为此包设置数据缓冲区
         * */
        packet.setData(data);
        ds.send(packet);

        }


    }
}
