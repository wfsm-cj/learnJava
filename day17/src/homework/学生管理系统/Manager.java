package homework.学生管理系统;

import java.util.*;

/**
 * @author chenjie
 * @date 2021/5/22-19:43
 */
public class Manager {
    private Set<Student> students;

    public Manager() {
        students = new TreeSet<>();
    }

    public Set<Student> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        Student s = new Student("201308241004","cj", 22, "1995");
        Manager form = new Manager();
//        form.show();
//        form.remove("201308241004");
//        form.show();
//        form.modify();
//        form.modify("201308241004");
//        form.show();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("---------------------");
            System.out.println("添加学生  1");
            System.out.println("删除学生  2");
            System.out.println("修改学生  3");
            System.out.println("查看学生  4");
            System.out.println("退出系统  0");
            System.out.println("---------------------------");

            switch (sc.nextInt()) {
                case 1:
                    form.add();
                    break;
                case 2:
                    System.out.println("请输入要删除的学号");
                    sc.nextLine();
                    form.remove(sc.nextLine().trim());
                    System.out.println(form.getStudents());
                    break;
                case 3:
                    System.out.println("请输入要修改的学号");
                    sc.nextLine();

                    form.modify(sc.nextLine().trim());
                    System.out.println(form.getStudents());
                    break;
                case 4:
                    form.show();
                    break;
                case 0:
                    System.out.println("已退出");
//                    return 可以直接退出系统
                    return;
                default:
                    System.out.println("请输入有效的数字");
            }
        }
    }

//    添加学生
    public  boolean add() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("请输入学生学号");
        String id = sc.nextLine().trim();
//     students 肯定不为 null ，自己 new HashSet()
        if (students != null && students.size() != 0) {
            for (Student s : students) {
                if (s.getId().equals(id)) {
                    System.out.println("学号相同");
                    return false;
                } else {
                    System.out.println("butong");
                    student.setId(id);
                }
            }
            System.out.println("不为空"+students.size());
        }else {
            System.out.println("2222");
            student.setId(id);
        }
        System.out.println("请输入名字");
        student.setName(sc.nextLine().trim());
        System.out.println("请输入年龄");
        student.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("请输入生日");
        student.setBirthday(sc.nextLine().trim());
//        System.out.println(student);
        students.add(student);
        System.out.println(students);
        return true;
    }






//    删除学生
    public void remove(String id) {
        if (students == null || students.size() == 0) {
            System.out.println("表为空");
        } else {
            for (Student s : students) {
                if(s.getId().equals(id)) {
                    students.remove(s);
                    System.out.println("已删除");
                }else{
                    System.out.println("没有找到要删除的对象");
                }
            }
        }
    }

//    修改
    public void modify(String id) {
        if (students == null || students.size() == 0) {
            System.out.println("表为空");
        } else {
            for (Student s : students) {
                if (s.getId().equals(id)) {
                    Scanner sc = new Scanner(System.in);

                    boolean flag = true;
                    while(flag) {
                        System.out.println("----------------------------------");
                        System.out.println("请输入你要修改的字段");
                        System.out.println("修改姓名按 1");
                        System.out.println("修改年龄按 2");
                        System.out.println("修改生日按 3");
                        System.out.println("修改结束 输入 end");
                        System.out.println("------------------------------");
                        switch (sc.nextLine().trim()){
                            case "1":
                                System.out.println("请输入你修改后的姓名");
                                s.setName(sc.nextLine().trim());
                                System.out.println("姓名修改结束");
                                break;
                            case "2":
                                System.out.println("请输入你修改后的年龄");

                                s.setAge(sc.nextInt());
                                System.out.println("年龄修改结束");

                                break;
                            case "3":
                                System.out.println("请输入你修改后的生日");

                                s.setBirthday(sc.nextLine());
                                System.out.println("生日修改结束");
                                break;
                            case "end":
                                flag = false;
                                break;
                            default:
                                System.out.println("请重新选择");
                        }
                    }
                    System.out.println("修改完毕");

                } else {
                    System.out.println("没有找到要修改的对象");
                }
            }
        }
    }

//    查看
    public void show() {
        if (students == null || students.size() == 0) {
            System.out.println("表为空");
        } else{
            Iterator it = students.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
            }
        }

    }

}
