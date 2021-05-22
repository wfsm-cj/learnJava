package Map.学生管理系统;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author chenjie
 * @date 2021/5/21-17:04
 */
public class Form {
//    学号 -> 学生
     public HashMap<String,Student> students ;

     public  HashMap<String,Student> getInstance(){
         students = new HashMap<>();
         return students;
     }

//  添加学生
    public  void add(String id,Student s) {
        if (!students.containsKey(id)) {
            students.put(id,s);
        }
    }

//  删除
    public  void remove(String id){
        if(students.containsKey(id)) {
            students.remove(id);
        }
    }

    public  void modify(String id,Student s){
        if(students.containsKey(id)) {
            students.put(id,s);
        }
    }

    public  void show() {
        Set<String> studentId = students.keySet();
        for (String id : studentId) {
            System.out.println(students.get(id));
        }
    }


//    public static void clear() {
//
//    }

}
