package 总结JAVASE;

/**
 * @author chenjie
 * @date 2021/6/3-15:34
 */
public class Demo2 {
    /*
    * StringBuilder
    *       char[] 数组，
    *       操作同一个对象
    *       可变容器
    *       线程不安全
    * StringBuffer
    *       同步
    *
    * 自动拆箱 和 自动装箱
    *
    * 集合
    *   list 集合
    *       有序，有索引，可重复
    *
    *   Set 集合
    *       无序，不可重复
    *
    * add()
    * remove()
    * set()
    * get()
    *
    * 遍历方式
    *   迭代器
    *    forEach
    *   for
    *   toArrays()  集合转数组
    *
    * 并发修改异常  ConcurrentModificationException
    *   ListIterator
    *   for
    *
    *   ArrayList
    *   LinkedList
    *
    *   泛型
    *
    *  LinkedHashMap  存入顺序和取出顺序相同
    *  LinkedHashSet
    *
    * IO流
    * 字节流
    *   FileInputStream
    *   FileOutputStream
    * 字符流
    *   FileReader
    *   FileWriter
    *
    * 缓冲流
    *   BufferedWriter
    *       newLine()
    *   BufferedReader
    *       readLine()
    * 转换流
    *   InputStreamReader
    *   OutputStreamWriter
    *
    * 序列化
    *   ObjectInputStream
    *   ObjectOutputStream
    * 实现标志性接口 Serializable
    * 序列号版本id  private static final long serialVersionUID = xxxL;
    *    writeObject()
    *    readObject() // 放到一个集合里面
    *   或者处理异常，等他报错
    *
    * Properties 双列集合
    *     HashTable 的实现类
    *     load(InputStream instream)  同步到双列集合中
    *       setProperty(String key,String value)
    *       getProperty(String key)
    *
    *      store(OutputStream outputStream)
    *
    * 网络编程
    * InetAddress
    *
    *   UDP
    *       DatagramPacket   封装和解析数据
    *       DatagramSocket      传送数据
    *   TCP
    *       Scoket
    *           根据Socket 连接服务器
    *       ServerSocket
    *           一个服务器端可以对应多个客户端
    *           accept()
    *
    *
    * 反射
    *
    *
    * */
    public static void main(String[] args) {
        System.out.println("ab".hashCode());
    }
}
