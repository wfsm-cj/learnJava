package homework;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author chenjie
 * @date 2021/6/3-9:22
 */
public class Demo {
    public static void main(String[] args) {
        String s1 = "宫本武藏、宋公明、苏有朋、石头人、时传祥、李耳、庄子、洪七公";
        ArrayList<String>  team1 = new ArrayList<>();
        team1.add("gbwz");
        team1.add("sgm");
        team1.add("syp");
        team1.add("le");
        team1.add("zz");
        ArrayList<String>  team2 = new ArrayList<>();
        team2.add("gbwz");
        team2.add("sgm");
        team2.add("23");
        team2.add("le1");
        team2.add("zz");

        team1.stream().filter((x) -> {return x.length() == 3;}).limit(3);

        team2.stream().filter((x) ->{return x.startsWith("z");}).skip(2);
    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
