package 网络编程.UDP;

/**
 * @author chenjie
 * @date 2021/5/29-11:21
 */
public class Demo {
    /*
    * DatagramSocket类    基于UDP协议的 Socket
    * DatagramPacket  ，来自于 java.net 包，表示数据包，就是进行数据的封装和解析
    *       数据封装
    *       数据解析
    * DatagramSocket  来自于 java.net 包，  表示数据的发送和接收
    *       数据发送
    *       数据接收
    * */


    /*
    *
    * 发送端
    *      将你要发送的数据封装在 DatagramPacket 中，，投递服务，无连接方式
    *    构造方法   传递的是 byte[] 数组  构造方法传递的都是 byte[]
    *       DatagramPacket(byte[] buf, int length,InetAddress address,int port)
    * length - 传递多少个
    * InetAddress 发送到哪个 计算机
    * port - 端口号
    * */
}
