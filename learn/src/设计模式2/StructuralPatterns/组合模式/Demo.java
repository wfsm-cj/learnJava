package 设计模式2.StructuralPatterns.组合模式;

import java.util.List;

/**
 * @author chenjie
 * @date 2021/6/4-20:14
 */
public class Demo {
    /*
    *  组合模式 (Composite Pattern)  composite：复合的，合成的，综合的，混合的
    *       又叫部分整体模式，是用于把一组相似的对象当做一个单一的对象。
    *       组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
    *       这种类型的设计模式属于结构型模式，它创建了对象组的树形结构
    * 意图：
    *      将对象组合成树形结构 来表示成“部分 - 整体” 的层次结构。
    *       组合模式使得用户对单个对象和组合对象的使用具有一致性
    * 主要解决：
    *       模糊了简单元素和复杂元素的概念，客户程序可以像处理简单元素一样来处理复杂元素
    *
    * 如何解决：
    *       树枝和叶子实现统一接口，树枝内部组合该接口
    *
    * 应用实例：
    *
    * 优点;
    *   1,高层模块调用简单
    *   2，节点自由增加
    * 缺点：
    *   在使用组合模式时，其叶子和树枝的声明都是实现类，，而不是接口，违反了依赖倒置原则
    * 使用场景：
    *   如：树形菜单，文件，文件夹的管理
    * 注意事项：
    *   定义时为具体类
    * */

    public static void main(String[] args) {
//        用Employee 类来创建和打印员工的层次结构
        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
    }



class Employee {
    private String name;
    private String dept; // department  部，科，处
    private int salary;
    private List<Employee> subordinates; // subordinate 下属，下级，从属，次要的

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }


    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}


