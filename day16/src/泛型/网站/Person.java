package 泛型.网站;

/**
 * @author chenjie
 * @date 2021/5/20-22:25
 */
public class Person<T> {
    T name;
    T gendar;

    public Person(T name, T gendar) {
        this.name = name;
        this.gendar = gendar;
    }
}
