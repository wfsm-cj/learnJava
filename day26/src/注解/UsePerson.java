package 注解;

/**
 * @author chenjie
 * @date 2021/6/2-17:35
 */
@Person(wife="jinglian",husband = "dalang")
public class UsePerson {
    public static void main(String[] args) {
        Class<UsePerson> c = UsePerson.class;
        System.out.println(c.getAnnotation(Person.class).getClass());
       Person per =  c.getAnnotation(Person.class);
        /*
        * 将 Person.class
        * */
        System.out.println(per.wife());
        System.out.println(per.getClass());
        System.out.println(per.husband());
    }
}
