package homework.斗地主;

/**
 * @author chenjie
 * @date 2021/5/22-17:42
 */
public class Poker implements Comparable<Poker> {
    private String color;
    // num 越大 牌越大
    private int num;
    private  String name;
    public Poker(String color,int num) {

                switch (num){
                    case 1:
                        name = color + "3";
                        break;
                    case 2:
                        name = color + "4";
                        break;
                    case 3:
                        name = color + "5";
                        break;
                    case 4:
                        name = color + "6";
                        break;
                    case 5:
                        name = color + "7";
                        break;
                    case 6:
                        name = color + "8";
                        break;
                    case 7:
                        name = color + "9";
                        break;
                    case 8:
                        name = color + "10";
                        break;
                    case 9:
                        name = color + "J";
                        break;
                    case 10:
                        name = color + "Q";
                        break;
                    case 11:
                        name = color + "K";
                        break;
                    case 12:
                        name = color + "A";
                        break;
                    case 13:
                        name = color + "2";
                        break;
                    case 14:
                        name =  "小王";
                        break;
                    case 15:
                        name =  "大王";
                        break;

                        }
        this.num = num;
    }
    public Poker(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Poker o) {
        System.out.println(o.getNum()+o.getName()+"  "+ num);
        if(o.getNum() == num) {
            return 1;
        }

        return  o.getNum() - this.num;
    }

}
