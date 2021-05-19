package 设计模式.简单工厂模式;

/**
 * @author chenjie
 * @date 2021/5/19-20:48
 */
public class Demo {
    /*
    * 工厂模式
    *      工厂角色 ComputerFactory   可以被客户端调用，其内部用于负责创建具体的对象
    *      抽象产品类 Computer           描述了所有实例的公共接口
    *      具体产品类  MacbookProComputer  实现抽象产品的接口，是要创建的具体实例
    *
    * 简单工厂模式的优点：
    *       工厂角色负责产生具体的实例对象，所以在工厂类中需要有必要的逻辑，通过客户的输入能够得到具体创建的实例；
    * 客户端必须要感知具体对象是如何产生的，只需要将必要的信息提供给工厂即可
    *
    * 简单工厂模式的缺点：
    *       简单工厂模式违反 "开闭原则" ，即对扩展开放，对修改关闭，因为如果要新增具体产品，就需要修改工厂类的代码
    * */

    public static void main(String[] args) {
        /*
        * 通过创建一个工厂 来 创建 实体对象
        * */
        ComputerFactory c = new ComputerFactory();
        Computer computer = c.createComputer("macbook");
    }

}
