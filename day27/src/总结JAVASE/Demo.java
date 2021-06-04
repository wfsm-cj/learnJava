package 总结JAVASE;

/**
 * @author chenjie
 * @date 2021/6/3-9:55
 */
public class Demo  extends  Demo1{
    /*
    * 怎么动态修改，，运行中的代码 ？？？？？？？？？
    * */
    /*
    * 1，语言概述
    *   开源性，面向对象性，跨平台性，编译性，动态性（java代码在执行过程中，可以修改内容）
    * 2，环境搭建
    *   java -version
    *   JAVA_HOME 。。
    * 再讲 JAVA_HOME 配置到 Path环境变量  %JAVA_HOME%  百分号区分
    * 3，注释
    *   单行注释
    *   多行注释
    *   文档注释
    *
    * 关键字 ：
    *       特殊含义的英文单词
    *       abstract：
    *           抽象类
    *           接口
    *           枚举（需要在枚举项实现）
    *       四类八种
    *            byte short char int float long double boolean
    *            char 可以转 ASCLL 编码表，可以和整数一起运算
    *       break作用范围：
    *           循环语句
    *           switch (int short byte char ，String，枚举)
    *          1.5 因为枚举中有个 ordinal 方法，该方法是一个 int 类型数值
    *           1.7  在switch循环中增加了 String 类型。但实际上 String 类型有一个hashCode 算法
    *
    *       catch
    *           异常处理，子异常写在父异常前面
    *       continue
    *
    *       default 接口里面的默认方法
    *       switch...case...default
    *
    *       do
    *
    *       enmu
    *           普通方法，成员变量，构造方法，枚举项，抽象方法
    *       extends
    *           类和类之间 ，， 接口和接口之间 继承
    *           同类别的共性事物向上抽取
    *           类是单继承，接口是多继承
    *
    *       final
    *           修饰的类   不能被继承
    *           修饰的常量  不能被修改
    *           修饰的方法      不能被复写
    *           修饰引用对象   地址值不可变
    *
    *       finally
    *           必须执行的东西， 即便有 return 还是。。。会执行 finally 中内容
    *           除非虚拟机异常。。
    *
    *       implements
    *           可以多实现
    *           default 方法有相同的 必须重写
    *           普通类全部重写
    *           抽象类 可以不重写，但是不能正常使用
    *
    *       import
    *           导入包。。同一个包类型不需要导包  java.lang 不用导包
    *
    *       instanceof
    *           向下转型 用 instanceof 验证
    *
    *       定义 long
    *           数值+L
    *       定义 float
    *           数值 + D
    *
    *
    *       private
    *           封装的其中一种典型，不是封装的全部
    *           本类
    *       默认权限
    *           本包
    *       protected
    *           本包 + 外包子类使用
    *       public
    *           所有
    *
    *       return
    *           结束方法。
    *           没有返回值类型， return;
    *
    *       static
    *           不能用 super  this
    *               this 表示子类对象
    *               super 表示父类对象
    *           不能直接调用 成员变量,  ，，可以创建对象调用
    *       super
    *           子父类变量冲突， 不能省
    *           子父类变量不冲突，能省
    *           super.clone()
    *
    *       synchronized
    *           锁的对象必须唯一，，
    *           判断锁，获得锁，归还锁
    *
    *       this
    *          本类对象的引用，
    *           成员变量和局部变量重名
    *           构造调用。 写到复杂的构造中
    *
    *       throw
    *           throw new Exception()
    *           一次只能抛出一个异常
    *
    *       throws
    *           声明异常
    *       异常的手动处理：
    *           1，throws
    *           2，try...catch...finally
    *
    *        transient
    *           序列化的时候加上 不序列化。。
    *           不序列化，有变量，但是数字不保存
    *
    *
    *       标识符
    *           命名规则
    *               类名 大驼峰
    *               变量，方法  小驼峰
    *               常量的命名  final关键字
    *
    *   && 和 & 的区别
    *   || 和 |
    *
    *
    *  +=  -=  *= /=  :
    *           左边的变量不会变，是原来的地址
    *  a = a + 1
    *           是两个变量 。。
    *
    *  ==
    *
    * switch ...case
    *       穿透性
    *
    * 重载
    *     方法名相同
    *       修饰符权限比原来大
    *       异常比原来小
    *
    * 数组
    *     空指针异常  NullPointerException
    *          明知道是 null 还是要调用
    *           使用之前  判断这个这是是否为空
    *
    *      数组越界 ArrayIndexOutOfBoundsException
    *        使用之前判断一下。。是否在正确的索引范围之类
    *
    * 面向对象
    *      封装
    *        private
    * 访问关系
    *      局部变量
    *       this.成员变量
    *       super.父类成员变量
    *       继承到的成员变量，，不会被代替。。 super 和 this 调用
    *
    * JavaBean
    *      类必须是公共的
    *       属性都用 private
    *       提供用来操作成员变量的 set 和 get 方法
    *       无参数构造方法必须有（建议有）
    *
    * static
    *     每个成员都有的共性的方法。使用非常频繁
    *
    * extends
    *   共性向上抽取
    *
    * 多态
    *   成员变量都是看左
    *   方法 编译看左，运行看右
    *
    * 抽象方法
    *
    * 接口
    *   一系列规则的限定
    *   成员常量  public static final
    *   抽象方法  public abstract
    *   父优先
    * */
    public static void main(String[] args) {
        int a = 12;
        a += 2;
        a = a + 2;
        new Demo();
    }
    static {

    }
    private String name;
    int num = 100;
    public Demo(){
        System.out.println(super.num);
        System.out.println(this.num);
    }
}

class Demo1{
    int num = 10;
}
