package other.日志;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

/**
 * @author chenjie
 * @date 2021/5/18-22:25
 */
public class Demo1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("other.日志");

//        自定义配置日志级别

//        创建ConsolHandler
        ConsoleHandler consoleHandler = new ConsoleHandler();

//        日志记录输出
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");

    }
}
