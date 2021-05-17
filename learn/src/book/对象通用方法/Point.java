/*
package book.对象通用方法;*/
/*
package book.对象通用方法;

*//*


import book.对象通用方法.ColorPoint;

*/
/**
 * @author chenjie
 * @date 2021/5/16-12:38
 *//*


public class Point {
//    new 一个对象就会有一个 x , y
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Point)) {
            return false;
        }
        Point p = (Point)o;
        return p.x == x && p.y == y;

    }

}

*/
/*//*
/  扩展这个类 Point
class ColorPoint extends Point {
    private final Color color;
    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color; // color 是 final 的 必须设置值
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Point)) {
            return false;
        }
        if(!(o instanceof ColorPoint)) {
//            无限递归
            return o.equals(this);
        }
        return false;
    }
}*//*


class SmellPoint extends Point {
    private final String name;
    public SmellPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }
}



*/
