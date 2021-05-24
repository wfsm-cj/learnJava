package IO;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * @author chenjie
 * @date 2021/5/23-12:27
 */
public class Demo_File {
    public static void main(String[] args) throws IOException {
        File f = new File("./hello/D.java");
        System.out.println(f);
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
        System.out.println(File.separator);
        System.out.println(f.isFile());

        File f1 = new File("H:\\1.txt");
        System.out.println(f1.isFile());

        /*
        *  public boolean isFile()
        *   当且仅当此抽象路径名表示的文件存在且是一个标准文件时，返回true，否则返回 false
        *
        * public boolean isDirectory()
        *   当且仅当此抽象路径名表示的文件存在且是一个目录时，返回true，否则 false
        *
        * public boolean canRead()
        *   可被应用程序读取时，返回true
        *
        * public boolean canWrite()
        *   文件允许写入 ，返回 true
        *
        * public boolean canExecute()
        *   是可执行文件 返回 true          -- 对于目录而言，是否可执行表示能否列出它包含的文件和子目录(没看懂)
        *
        * public long length()
        *   返回文件的长度，以字节为单位，如果文件不存在 返回OL 。
        *
        * */
        System.out.println(f.length());
        System.out.println(f1.length());

        File f2 = new File("H:\\1");
        System.out.println(f2.isDirectory());
        System.out.println(f2.canExecute());
        System.out.println(f2.length());
        System.out.println(f2.canRead());
        System.out.println(f2.canWrite());

        /*
        * 创建和删除文件
        *   public boolean createNewFile()
        *       创建成功返回true ，失败 false
        *
        * public boolean delete()
        *   删除此抽象路径名表示的文件或目录，如果此路径名，表示一个目录，则该目录必须为空才能删除
        *   删除成功 true， 失败 false
        * */

        File f3 = new File("H:\\1\\hello.java");
        if(f3.createNewFile()) {
            System.out.println("success");

            if(f3.delete()) {
                System.out.println("delete success");
            }

        }


        /*   抽象路径名就是 File文件
        *public String getPaht()
        *      返回此抽象路径名的字符串形式
        *
        * public static File createTempFile(String prefix, String suffix)
        *       返回新建空文件的抽象路径名
        *
        * public void deleteOnExit()
        *       在虚拟机终止时，请求删除此抽象路径名表示的文件或目录
        *       调用此方法删除已注册为删除的文件或目录无效
        *       只有在袭击正常终止时，才会尝试执行删除操作
        *       一旦请求了删除操作，就无法取消该请求。所以应小心使用此方法
        * */
        f = File.createTempFile("tep-",".txt");
        System.out.println(f.getPath());
        f.deleteOnExit();
        System.out.println(f.getPath());

        /*
        * 遍历文件
        *   public String[] list()   -- 只有名字  没有路径
        *         返回字符串数组，这些字符串指定此抽象路径名表示的目录 中的文件 和目录
        *          如果此抽象路径名不表示一个目录，或者发生 I/O 错误，则返回 null
        *
        *   public File[]  listFiles()   -- File 文件
        *       返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的 文件和目录
        *       如果抽象路径名不表示一个目录，或者发生 I/O 错误，则返回 null
        * */
        f = new File("H:\\1");
        File[] fs = f.listFiles();
        for (File file : fs) {
            System.out.println(file);
        }

        String[] fss = f.list();
        for (String s : fss) {
            System.out.println(s);
        }

        fs = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
             /*
             * 当且仅当该名称应该包含在文件列表中时返回true，否则返回false
             * */
                return name.endsWith(".java");  // true 表示接受该文件
            }
        });
        for (File file : fs) {
            System.out.println("file = " + file);
        }

    /*
    * File 如果表示一个目录，可以通过一下方法创建和删除目录
    *   public boolean mkdir()
    *       创建当前File对象表示的目录,   只能创建一层目录 ，不然报错
    *
    * public boolean mkdirs()
    *       创建目录以及所有必须的父目录，返回true 。包括所有必需但不存在的父目录
    *       此操作失败的原因是可能已经成功创建了一部分必需的父目录
    *
    * public boolean delete()
    *   删除 文件 或 目录。如果此路径名表示一个目录，则该目录必须为空才能删除。
    * */
        f = new File("H:\\1\\2");
        System.out.println(f.mkdir());
        f = new File("\"H:\\1");
        System.out.println(f.delete());



        /*
        * 小结
        *   创建File对象本身不涉及IO操作
        *   可以获取路径/绝对路径/规范路径  getPath() / getAbsolutePath() / getCanonicalPath()
        *   可以获取目录的文件和子目录   list() / listFiles()
        *   可以创建或删除文件和目录
        *
        * */
    }

}
