package book.对象通用方法;

/**
 * @author chenjie
 * @date 2021/5/15-17:48
 */
public
class Hello extends Demo{
    @Override
    public void eat() {
        System.out.println("hello eat");
    }

    public static void main(String[] args) {
        new Hello().eat();
    }
}
