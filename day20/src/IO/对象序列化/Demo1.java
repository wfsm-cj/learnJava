package IO.对象序列化;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author chenjie
 * @date 2021/5/26-14:19
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try(ObjectOutputStream output = new ObjectOutputStream(buffer)){
//            output.writeInt(12345);
//            output.writeObject(new Person("cj",26));
        }
        System.out.println(buffer.toString());
    }
}
