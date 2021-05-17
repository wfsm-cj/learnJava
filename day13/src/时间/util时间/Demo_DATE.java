package 时间.util时间;

import java.util.Date;

/**
 * @author chenjie
 * @date 2021/5/17-14:07
 */
public class Demo_DATE {
    /*
    * java.util 包中的 DATE
    * */
    public static void main(String[] args) {
//        表示获取到当前时间日期
        Date d = new Date();
        System.out.println(d);//Mon May 17 14:09:40 CST 2021

//        Date(long time) :  从1970年1月1日  经过了 time毫秒后，表示的时间
        Date d1 = new Date(1000);
        System.out.println(d);

        /*
        *  getTime()  获取到 date时间所对应的毫秒值,返回long类型数据   计算时间的间隔
        * */
        d = new Date();
        System.out.println(d.getTime());
        System.out.println(d1.getTime());

//        setTime(long time)
        d1.setTime(4000);
        System.out.println(d1);

        /*
        *  CST  china standard time
        * */
    }
}
