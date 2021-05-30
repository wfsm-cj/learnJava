package 枚举;

/**
 * @author chenjie
 * @date 2021/5/28-15:57
 */
public enum Demo {
//    枚举项1,枚举项2,枚举项3;
    MON("1"){// 枚举有抽象方法，需要在枚举项实现
    @Override
    public void show() {
        System.out.println("我是枚举类型的MON");
    }
},TUE("2") {
        @Override
        public void show() {
            System.out.println("我是枚举类型的TUE");
        }
    }; // 相当于每一个实例  private static final Demo MON = new Demo();
//    枚举类型中也可以定义普通成员变量
    private String weekdayName;

//    枚举类型中也可以定义普通成员方法
    public String getWeekdayName() {
        return weekdayName;
    }

//    枚举类型中可以定义构造方法
    private Demo(String weekdayName){
        this.weekdayName = weekdayName;
    }


    public static void main(String[] args) {
        Demo d = Demo.MON;
        System.out.println(d.getWeekdayName());
    }

//    枚举类型当中，可以直接定义出抽象方法
    public abstract void  show();
}
