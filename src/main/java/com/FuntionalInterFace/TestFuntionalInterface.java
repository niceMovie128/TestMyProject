package com.FuntionalInterFace;

import java.util.function.Function;

/**
 * @ProjectName: TestMyProject
 * @Package: com.FuntionalInterFace
 * @ClassName: TestFuntionalInterface
 * @Author: mw
 * @Description: 测试功能接口的使用
 *
 *      * 先执行参数(即也是一个Function)的，再执行调用者(同样是一个Function)
 *
 * default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
 *         Objects.requireNonNull(before);
 *         return (V v) -> apply(before.apply(v));
 *     }
 *
 *
 * @Date: 2021/5/13 9:09
 * @Version: 1.0
 */
public class TestFuntionalInterface {
    public static void main(String[] args) {
        Function<Integer,Integer> time2 = i->i*2;
        Function<Integer,Integer> squard = i->i*i;


        System.out.println(time2.apply(4));
        System.out.println(squard.apply(4));
//        compose 和 andThen 的不同之处是函数执行的顺序不同。compose 函数先执行参数，然后执行调用者，而 andThen 先执行调用者，然后再执行参数。

        System.out.println(time2.compose(squard).apply(4));
        System.out.println(time2.andThen(squard).apply(4));
        System.out.println(Function.identity().apply(4));

    }
}
