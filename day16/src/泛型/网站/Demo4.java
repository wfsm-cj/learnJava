package 泛型.网站;

import java.util.Arrays;

/**
 * @author chenjie
 * @date 2021/5/22-8:43
 */
public class Demo4 {
    public static void main(String[] args) {
//        System.out.println(asArray("23", "$").getClass());
        System.out.println(pickTwo("a", "b", "c"));
//        asArray("a","c");
//        System.out.println(Arrays.toString(str));
    }
//>>>>?????????????????????????????????
    static<K> K[] pickTwo(K k1, K k2, K k3) {
        System.out.println(k1.getClass()+"k1");
//        System.out.println(asArray(k1, k2).getClass());
        return  asArray(k1,k2);
    }

    static <T> T[] asArray(T...objs) {
        System.out.println(objs.getClass()+"asArray");
        return objs;
    }

}
