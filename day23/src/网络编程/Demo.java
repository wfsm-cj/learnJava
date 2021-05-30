package 网络编程;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author chenjie
 * @date 2021/5/29-9:54
 */
public class Demo {
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
