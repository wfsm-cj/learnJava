package 视频;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

/**
 * @author chenjie
 * @date 2021/5/26-21:41
 */
public class Demo_StreamTokenizer {
    /*
    *StreamTokenizer
    *   StreamTokenizer类获取输入流并将其解析为 ”标记“ ，允许一次读取一个标记
    *
    * 构造方法
    *   public StreamTokenizer(Reader r)
    *   创建解析给定字符流的标记生成器
    * */
    /*
    * public int ttype
    *      在调用 nextToken 方法之后，此字段将包含刚读取的标记的类型
    *       TT_WORD  指示该标记是一个文字
    *       TT_NUMBER  指示该标记是一个数字
    *       TT_EOL  指示已读到行的末尾
    *       TT_EOF  指示已到达输入流的末尾
    *
    * */
    public static void main(String[] args) throws IOException {
        String info = "good good study day day up";
        StringReader sr = new StringReader(info);

//        流标记器
        StreamTokenizer st = new StreamTokenizer(sr);

        int count = 0;
        while(st.ttype != StreamTokenizer.TT_EOF) {
//            public int nextToken()   从此标记生成器的输入流中解析下一个标记，返回ttype字段的值
//            是单词
            if(st.nextToken() == StreamTokenizer.TT_WORD) {
                count++;
            }
        }
        System.out.println("count = " + count);
        sr.close();
    }

}
