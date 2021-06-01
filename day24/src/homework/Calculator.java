package homework;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/31-22:05
 */
public class Calculator {
    public Object add(Object leftValue, Object rightValue) throws Exception {
        if((leftValue instanceof Number) && (rightValue instanceof Number)) {
//            Number result = (double)leftValue + (double)rightValue;
            Class leftClass = leftValue.getClass();
            String[] arr = leftClass.toString().split("\\.");
            String leftClassStr = arr[arr.length - 1];

            Constructor leftCon = Class.forName("java.lang."+leftClassStr).getDeclaredConstructor(Object.class);
//            Number result =
            System.out.println(leftCon.newInstance(leftValue).getClass());

            System.out.println(leftClassStr);
//            switch(){
//                case int.class:
//
//            }


        }else{
            return null;
        }

        return null;
    }

    public static void main(String[] args) throws Exception {
//        Constructor<? extends Integer>
        Constructor<?>[] con = Integer.class.getDeclaredConstructors();
        System.out.println(Arrays.toString(con));
        System.out.println(new Calculator().add(15, 44));
    }
}

enum NumberClass{
    INTCLASS(int.class),DOUBLECLASS(double.class),FLOATCLASS(float.class),SHORTCLASS(short.class);
    public Class numberClass;
    private NumberClass(Class numberClass){
        this.numberClass = numberClass;
    }

        }
