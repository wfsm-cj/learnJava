package 设计模式2.creationalPatterns.建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenjie
 * @date 2021/6/4-9:44
 */
public class Demo {

    /*
    * 意图： 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示
    *
    *       一些基本部件不会变，而其组合经常变化的时候
    * 应用实例：
    *       1，去肯德基， 汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的套餐
    *       2，Java中的 StringBuilder
    * 优点：
    *       1，建造者独立，易扩展
    *       2，便于控制细节风险
    * 缺点：
    *       1，产品必须有共同点，范围有限制
    *       2， 如内部变化复杂，会有很多的建造类
    * 与工厂模式的区别： 建造者模式更加关注与零件装配的顺序
    * */


    public static void main(String[] args) {
//        演示建造者模式   Builder Pattern
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total cost" + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println(nonVegMeal.getCost());
    }
}


// 一个表示食物条目和食物包装的接口
interface Item{
    public String name();
    public Packing packing();
    public float price();
}

interface Packing{
    public String pack();// 打包的细节，用什么打包

}

// 包装纸，书皮 Wrapper
class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }

    @Override
    public String toString() {
        return "Wrapper";
    }
}

//  瓶子 bottle
class Bottle implements Packing {
    @Override
    public String pack() {
        return  "Bottle";
    }

    @Override
    public String toString() {
        return "Bottle";
    }
}


// 创建实现 Item 接口的 抽象类，该类提供了默认功能
abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}

abstract  class ColdDrink implements  Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}

// 实体类
class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25f;
    }
}

 class ChickenBurger extends  Burger {

     @Override
     public String name() {
         return "chicken Burger";
     }

     @Override
     public float price() {
         return 50.0f;
     }
 }
// coke 可卡因，可口可乐
 class Coke extends  ColdDrink {

     @Override
     public String name() {
         return "coke";
     }

     @Override
     public float price() {
         return 30f;
     }
 }

 class Pepsi extends ColdDrink {

     @Override
     public String name() {
         return "Pepsi";
     }

     @Override
     public float price() {
         return 35f;
     }
 }

 // 购买的物品
 class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0F;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("item = " + item.name()+
                    "   packing = "+ item.packing() +
                    "   price = " + item.price());
        }
    }
 }

//  负责创建 Meal 对象
 class MealBuilder {
//    veg : vegetable 蔬菜
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
 }