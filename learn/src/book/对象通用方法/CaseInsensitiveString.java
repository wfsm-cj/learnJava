package book.对象通用方法;

/**
 * @author chenjie
 * @date 2021/5/16-10:57
 */
// case 情况  insensitive 不敏感，漠不关心
public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = null;
    }

    @Override
    public boolean equals(Object o) {
       /* if(o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        if(o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }*/

//        限制传入的对象必须为 CaseInsensitiveString
//        否则 对称性 ，会不满足，对称调用的是另一个对象的 equals方法，不是本类对象的 equals
        return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);

    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "pilish";
        System.out.println(cis.equals(s));
/*
//        这个调用的 字符串 String 的 equals ，不一样，在内部设计的时候 一定要把对象的范围
控制到 本类对象中，不然属于的对象范围很大，你的equals 在对称性的时候，
    先是调用本类的方法，继而去调用 其他对象范围的方法，你的重写没有意义，两个不同的方法得到的结果
    肯定不同，继而是不会满足 equals 对称性的
*/
        System.out.println(s.equals(cis));
    }

}
