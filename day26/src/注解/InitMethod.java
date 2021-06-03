package 注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author chenjie
 * @date 2021/6/2-16:30
 */
/*
* 元注解 ， 注解的注解
* @Target  目标注解能够作用的位置
*       value值： 是一个 ElementType[]
*       ElementType.TYPE
*       ElementType.METHOD
*       ElementType.Field
* */
    @Target(ElementType.METHOD)
    /*
    * @Retention 注解被保留的阶段
    *   value 值： 是一个 RetentionPolicy 枚举
    *   保留策略
    *     RetentionPolicy.SOURCE  在编译时期运行，如：@Override
    *       RetentionPolicy.CLASS
    *   RetentionPolicy.RUNTIME  运行时期。。编译的时候会有，运行时也会有 如 @FunctionInterface
    *
    * @Documented
    *    描述注解是否被抽取到API中
    * @Inherited  注解是否被子类继承
    * */
    @Retention(RetentionPolicy.RUNTIME)
public @interface InitMethod {
    /*让这个方法直接运行，不需要 new 对象，通过反射*/
    /*
    * 属性列表
    * */
}
