package IO流.File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author chenjie
 * @date 2021/5/24-10:37
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        /*
        * File   java.io包
        *    文件和目录路径名的抽象表示
        *       文件和目录是可以通过File封装成对象
        *    并不是一个真正存在的文件，仅仅是一个路径名而已
        * */

        /*
        * 路径：
        *   绝对路径
        *   相对路径
        * */

        /*
        * File 类构造方法
        *   File(String path)
        *       把字符串的路径，封装成一个File对象
        *   File(String parentPath, String childPath)
        *       将父路径和子路径拼接成完整路径转换成 File类型对象
        *
        *   File(File fu, String zi)
        * */
        File f = new File("H:\\1");
//        file 重写了toString()
        System.out.println(f);

//        不写 \\ 没有杠杠
        f = new File("H:\\","0426Java系统班\\day18");
        System.out.println(f);

        File f1 = new File(f,"22.txt");
        System.out.println(f1);

        /* excel txt 新建一般都是这两种
        * boolean createNewFile()  创建当前File对象所描述的路径的文件
        *      当文件不存在时且这个文件的路径是存在的，文件本身不存在，才会创建
        * boolean mkdir()   创建文件夹，
        * */

//        路径名是存在的 才能创建，否则报错 *******  IOException 系统找不到路径
//        System.out.println(f1.createNewFile());

        f = new File("H:\\my.txt");
        System.out.println(f.createNewFile());

/*
* boolean mkdir()
*   创建出当前路径的最后一级文件夹
* 创建一个文件夹，如果父级目录不存在直接失败
* */
       File f5 = new File("H:\\2222\\33");
        System.out.println(f5.mkdir()+"-------");

        /*
        * boolean mkdirs()
        *   创建多级文件夹，父 文件夹不存在也能创建
        * */
        System.out.println(f5.mkdirs());

        /*
        * 删除
        *   删除的文件夹必须是空文件夹
        *   delete()
        *   不走回收站
        * */

        f = new File("H:\\my.txt");
        System.out.println(f.delete());

        f = new File("H:\\2222");
        System.out.println(f.delete());

        /*
        * exisit()
        *       判断当前 File对象是否真实存在 。。在读文件或者删文件前判断
        *
        *  isFile()
        *       判断是否是 文件
        *
        *   isDirectory()
        *       判断是否是 文件夹
        * */
        f = new File("H:\\1");
        if(f.exists()) {
            System.out.println("存在");
            if(f.isFile()) {
                System.out.println("是文件");
            }
            if(f.isDirectory()) {
                System.out.println("是文件夹");
            }


        }else{
            System.out.println("不存在");
        }


        /*
        * createNewFile()
        * mkdir()
        * mkdirs()
        * delete()
        *   exist()
        *   isFile()
        *   isDirectory()
        * */

        /*
        * 获取功能
        *   String getAbsolutePath();
        *   String  getPath();      获得 File 构造方法中封装的路径
        * */
        f = new File("H:\\1\\22.txt");
        String s = f.getAbsolutePath();
        System.out.println(s);

        f1 = new File("ok.txt");
//        idea中 默认拼接的是 项目工程的根目录
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1);

        System.out.println(f.getPath());
        System.out.println(f1.getPath());

        /*
        * String getName()   当前路径中，最后一个部分的名字
        *
        * */
        System.out.println(f.getName());
        f1 = new File("H:\\23\\23\\cnm.txt");
        System.out.println(f1.getName());


        /*
        * String[] list
        *
        * File[] listFiles()
         * */
        System.out.println("---------------");
        f = new File("H:\\1");
        if(f.isDirectory()) {
            String[] arr = f.list();
            System.out.println(Arrays.toString(arr));

        }else{
            System.out.println("error");
        }


        /*
        * 获取文件夹下文件个数
        * */
        f = new File("H:\\1");
        if(f.isDirectory()) {
            File[] files = f.listFiles();
            Map<String,Integer> map = new HashMap<>();

            for (File name : files) {
                if(name.isFile()) {
                    //  . 在字符串中有特殊的含义，表示匹配任意一个字符
//                    所以需要将字符串中的点，，变成一个普通点
//                    \\ 在java表示转义的含义  将 \ 后面的数据变成普通的，没有任何其他含义的普通数据
//                    java中不支持 \ 存在，除了路径
                    String[] arr = name.getName().split("\\.");
                    String suffix = arr[arr.length - 1];
                    if(map.containsKey(suffix)) {
                        map.put(suffix,map.get(suffix) + 1);
                    }else {
                        map.put(suffix,1);
                    }
                }
            }
            System.out.println(map);
            Set<Map.Entry<String,Integer>> entrys = map.entrySet();
            for (Map.Entry<String, Integer> entry : entrys) {
                System.out.println(entry.getKey()+ " ---- "+ entry.getValue());
            }
        }

    }
}
