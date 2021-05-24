package IO;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author chenjie
 * @date 2021/5/23-18:41
 */
public class Demo_Path {

    public static void main(String[] args) {
        Path p = Paths.get(".", "project", "study");
        System.out.println(p);
        /*
        * Paths.get()
        * toAbsolutePath()
        * normalize()
        * toFile()
        * 如果需要对目录进行复杂的拼接遍历等操作，使用 path对象更方便
        * */
    }
}