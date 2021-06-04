package 设计模式2.creationalPatterns.抽象工厂模式;


/**
 * @author chenjie
 * @date 2021/5/19-20:58
 */
public class MacbookProComputer implements Computer {
    @Override
    public void printComputer() {
        System.out.println("this is a  macbook pro");
    }
}
