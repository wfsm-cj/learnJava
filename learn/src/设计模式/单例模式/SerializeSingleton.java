package 设计模式.单例模式;

import java.io.*;

/**
 * @author chenjie
 * @date 2021/6/1-20:48
 */
public class SerializeSingleton implements  Serializable{//序列化对象必须实现 Serializable 接口
//    序列化后得到的实例 和 单列 不是同一个 实例
    private static SerializeSingleton instance = new SerializeSingleton();

    private static final long SERIALVERSIONUID = 123L; // 序列化id

    private  SerializeSingleton() {

    }

    public static  SerializeSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        SerializeSingleton instance = SerializeSingleton.getInstance();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test"))){
            oos.writeObject(instance);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test"))){
            SerializeSingleton serializeSingleton = (SerializeSingleton) ois.readObject();
            System.out.println(serializeSingleton == instance);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    Object readResolve() throws ObjectStreamException { // 在 Serializable 文档里面
//        提供一个  Object readResolve()  throws ObjectStreamException{}  解决反序列化后实例不同的问题
        return getInstance();
    }
}
