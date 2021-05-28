package 线程.内部类;

/**
 * @author chenjie
 * @date 2021/5/27-11:35
 */
public class Demo {
    private String name;

    public static void main(String[] args) {
        Demo d = new Demo();
        class  Student{
            private String name;
            public void study(){
                System.out.println("study");
            }
        }

        new Student().study();
    }

}
