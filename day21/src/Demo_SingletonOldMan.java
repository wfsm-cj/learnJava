/**
 * @author chenjie
 * @date 2021/5/27-9:35
 */
public class Demo_SingletonOldMan {
//    构造函数私有化
        private Demo_SingletonOldMan(){}

//        创建出唯一一个对象   final设置
   public final static Demo_SingletonOldMan so = new Demo_SingletonOldMan();

}
