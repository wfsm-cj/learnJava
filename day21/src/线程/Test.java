package 线程;

/**
 * @author chenjie
 * @date 2021/5/27-10:38
 */
public class Test {
  public void eat(){
      System.out.println("test eat");
  }

  class Person{
      public void play(){
          System.out.println("person play");
      }
  }

    public static void main(String[] args) {
        System.out.println(new Test() {
            @Override
            public void eat() {
                System.out.println("eating");
            }
        }.getClass());
        System.out.println(new Test().getClass());
        System.out.println(new Test() {
        }.getClass());

        Test t = new Test(){};

    }
}
