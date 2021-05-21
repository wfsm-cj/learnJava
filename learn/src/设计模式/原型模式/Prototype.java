package 设计模式.原型模式;

/**
 * @author chenjie
 * @date 2021/5/20-8:54
 */
/*
*  原型类
* */
public abstract class Prototype implements Cloneable{
    private String id;
    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Prototype clone() throws CloneNotSupportedException {
        return  (Prototype) super.clone();
    }
}
