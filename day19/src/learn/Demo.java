package learn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/25-16:15
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        byte[] data = Files.readAllBytes(Paths.get("abc.txt"));
        System.out.println(Arrays.toString(data));
    }
}
