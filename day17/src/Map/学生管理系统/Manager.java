package Map.学生管理系统;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author chenjie
 * @date 2021/5/21-16:54
 */
public class Manager {
//    Set<Student> students = new HashSet<>();
    
//    不允许创建实例
    private Manager() {}
//    使用manager
    public static void useSystem(Form form,String id, Student stu, String operator) {

        if("add".equals(operator)) {
            form.add(id,stu);
        }
        if("remove".equals(operator)) {
            form.remove(id);
        }
        if("modify".equals(operator)) {
            form.modify(id,stu);
        }
        if("show".equals(operator)) {
            form.show();
        }

    }

    public static void main(String[] args) {
        Form form = new Form();
        Student s = new Student("cj","001",26,"1995");
        String id = "001";
        Manager.useSystem(form,"001",s,"modify");
    }
}
