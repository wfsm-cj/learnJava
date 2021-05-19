package other.日志;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author chenjie
 * @date 2021/5/18-21:54
 */
public class Demo {
    public static void main(String[] args) {
//        public static Logger getLogger(String name)
//        查找或创建一个命名子系统的记录器，如果已经使用给定名称创建了记录器，则返回它。否则将创建一个新的记录器
//        name - 记录器名称。通常应该基于子系统的包名或类名 如 java.net 或 java.swing
//        1,获取日志记录对象
        Logger logger = Logger.getLogger("other.日志");
//        2、日志记录输出
        logger.info("hello cj");
//        通用方法进行日志记录
        logger.log(Level.INFO,"hello cc");

//        通过占位符 方式输出变量值
        String name ="chenjie";
        Integer age = 13;
        logger.log(Level.INFO,"用户信息 {0},{1}",new Object[]{name,age});

    }


}
