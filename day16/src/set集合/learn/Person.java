package set集合.learn;

import java.util.Objects;

/**
 * @author chenjie
 * @date 2021/5/20-20:13
 */
public class Person {
    public Person() {
    }
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
