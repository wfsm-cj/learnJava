package 视频;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/5/26-19:32
 */
public class Demo_文件的分割 {
    /*
    * source 源文件
    * tempSize 被分割的大小
    * */
    public static void division(File source,int tempSize) throws IOException {
        long sourceLength = source.length();
//        tempNum  被拆分的文件个数
        int tempNum = (int)( sourceLength % tempSize == 0 ? (sourceLength / tempSize) : (sourceLength / tempSize + 1));

        InputStream in = new BufferedInputStream(
                new FileInputStream(source)
        );
        final int number = (tempSize % 1024 == 0) ? tempSize /1024 : (tempSize/1024 + 1);
        for (int i = 0; i < tempNum; i++) {
            OutputStream out = new BufferedOutputStream(
                    new FileOutputStream("H:\\1\\"+(i + 1) + "-temp-" + source.getName())
            );
            int len = 0;
            int count = 0;  // 记录读取了多少次
            byte[] bytes = new byte[1024];
            while((len = in.read(bytes)) != -1) {
                out.write(bytes,0,len);
                out.flush();
                count++;
                if(count >= number) {
                    break;
                }

            }
            out.close();
        }


        in.close();
    }
    public static void main(String[] args) throws IOException {
        division(new File("H:\\1\\a.mp4"),1024*1024*10);
    }


}
