package IO.对象序列化;

/**
 * @author chenjie
 * @date 2021/5/26-11:40
 */
public class Demo {
    /*
    * 没有数据库的前提条件下，将数据写入文件
    * 考虑节省数据库空间
    *       将对象 写入文件
    * 。。。比如数据库的用户密码-- 必须要先登录数据库，放在文件当中
    *
    * 对象流  序列化和反序列化
    * JDK所有的类型都支持 序列化和反序列化
    * 实现 Serializable 接口  数据的永久存储
    *
    * ObjectOutputStream
    *
    * */
    /*构造方法
    * ObjectOutputStream(OutputSteam o)
    *
    * 常用方法
    *   writeObject(Object o)
    *
    * ObjectInputStream(InputStream o)
    * readObject()
    * */

}
