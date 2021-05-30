package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/29-10:24
 */
public class Demo1 {
    public static void main(String[] args) throws UnknownHostException {
//        获取 InetAddress
        InetAddress ia = InetAddress.getLocalHost();
//        返回主机名 / ip地址
        System.out.println("ia = " + ia);//PC202009041951/192.168.48.66


        /*
        * getByName(String host)  通过host获取 ip
        * */
        InetAddress address = InetAddress.getByName("PC202009041951");
        System.out.println(address);
//  getHostName()   返回 hostname
        System.out.println(address.getHostName());

//        getHostAddress()  返回 ip
        System.out.println(address.getHostAddress());

//        getAddress()
        System.out.println(Arrays.toString(address.getAddress()));

//        toString()   返回 主机名+ ip
        System.out.println(address.toString());


    }
}
