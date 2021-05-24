package 集合;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;

/**
 * @author chenjie
 * @date 2021/5/22-10:56
 */
public class Demo_EnumMap {
    /*EnumMap
    *   作为 key 的对象是 enum 类型，那么可以使用 Java集合库 提供的一种 EnumMap，他在内部以一个
    * 非常紧凑的数组存储value，并且根据 enum 类型的 key 直接定位到内部数组的索引，并不需要计算 hashCode()
    * ,不但效率最高，而且没有额外的空间浪费
    * */
    public static void main(String[] args) {
        Map<DayOfWeek,String> map = new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY,"星期一");
        map.put(DayOfWeek.TUESDAY,"星期二");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));
    }

    /*
    * 小结：
    *   如果 Map 的 key 是 enum类型，推荐使用EnumMap，既保证速度，也不浪费空间
    * */
}
