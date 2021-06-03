package 设计模式.享元模式;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenjie
 * @date 2021/6/2-19:46
 */
public class FlyWeightTest {
    public static void main(String[] args) {

    }
}
class TreeNode {
    private int x;
    private int y;
    private Tree tree;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }
}
class Tree {
    private final String name;
    private final String data;

    public Tree(String name, String data) {
        this.name = name;
        this.data = data;
    }
}


//定义一个工厂来产生这个树
class TreeFactory {
    private static Map<String,Tree> map = new ConcurrentHashMap<>();
}
