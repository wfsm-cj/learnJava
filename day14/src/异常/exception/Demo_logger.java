package 异常.exception;

import java.util.logging.Logger;

/**
 * @author chenjie
 * @date 2021/5/18-13:21
 */
public class Demo_logger {
    public static void main(String[] args) {
//        public static final Logger getGlobal()
//        返回名为 Logger.GLOBAL_LOGGER_NAME的全局记录器对象
        Logger logger = Logger.getGlobal();
        System.out.println(logger);

//        public void info(String msg)
//        记录INFO消息，如果当前为INFO消息级别启用了记录器，则给定的消息将转发给所有注册的输出处理程序对象
        logger.info("hello cj");

//        public void warning(Supplier<String>  msgSupplier)
//        记录一条警告消息，只有当纪录级别实际上记录消息时，才能构建一条警告消息
        logger.warning("memery is running out");

//        public void fine(Strging msg)
//        记录一个FINE消息，如果当前为FINE消息级别启用了记录器，则给定的消息就转发给所有注册的输出处理程序对象
        logger.fine("ignored");

//        public void severe(Supplier<String> msgSupplier)
//        记录一个 SEVERE 消息，只有当记录级别 实际上记录该消息时，才会构建一个 SEVERE 消息
//        如果当前为 SEVERE 消息级别启用了记录器， 则 通过调用提供的供应商功能并转发给所有注册的输出处理程序
//        对象来构建消息
        logger.severe("process will be terminated");
//        severe 严肃的


    }
}
