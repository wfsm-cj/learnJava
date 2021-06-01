package IO;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author chenjie
 * @date 2021/5/31-10:07
 */
public class Demo {

    /*
    * ZipOutputStream
    *       ZipOutputStream(OutputStream out)
    *
    *   void  putNextEntry(ZipEntry e)
    *
    *   ZipEntry(String name)
    *       指定名称创建新的ZIP条目
    *
    * ZipInputStream
    *
    * */
    /*
    * zipFileName  要生成功的压缩文件
    * */
    public static void compression(String zipFileName, File target) throws IOException {
        System.out.println("正在压缩。。。");
        try {
            ZipOutputStream out  = new ZipOutputStream(new FileOutputStream(zipFileName));
            BufferedOutputStream bos = new BufferedOutputStream(out);
//            如果target是文件夹， 需要一个一个加进来
            zip(out,target,target.getName(),bos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
/*ZipOutputStream
*   public void putNextEntry(ZipEntry e)
*       开始写入新的ZIP文件条目并将流定位到条目数据的开始处。
*       e -- 要写入的 ZIP 条目
* */
    private static void zip(ZipOutputStream out, File target, String name, BufferedOutputStream bos) throws IOException {
        if(target.isDirectory()) {//判断是否是目录 ，， 目录要递归
            File[] files = target.listFiles();
            if(files.length == 0) {// 可能是空目录
                out.putNextEntry(new ZipEntry(name+"/"));//加入一个条目
            }

        }

    }

    public static void main(String[] args) {

//        compression("H:\\1\\test.zip",new File("H:\\1\\1"));
    }

}
