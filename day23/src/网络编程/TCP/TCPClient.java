package 网络编程.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author chenjie
 * @date 2021/5/29-15:18
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
//        如果 IP 和 端口 无法连接，直接报错  拒绝连接
        Socket s = new Socket("127.0.0.1",8080);

//        对服务器发送数据，输出流
//        OutputStream getOutputStream()
        OutputStream output = s.getOutputStream();
        output.write("在吗?服务器".getBytes());

        s.shutdownOutput();

//        接受从服务器返回的数据   输入流
        InputStream input = s.getInputStream();
        byte[] b = new byte[1024];
        int len;
//        int len = input.read(b); // 因为数据很少 不用判断
        while((len = input.read(b)) != -1) {
            System.out.println(new String(b,0,len));
        }


//        关闭资源
        s.close();
    }

}
