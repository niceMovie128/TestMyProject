package com.TestMyProject.ThreadTest;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * Optional 类是一个可以为null的容器对象。如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。
 *
 * Optional 是个容器：它可以保存类型T的值，或者仅仅保存null。Optional提供很多有用的方法，这样我们就不用显式进行空值检测。
 *
 * Optional 类的引入很好的解决空指针异常。
 * 其实自己也不太会用
 */
public class TestOptional {
    public static void main(String[] args) {
        TestOptional testOptional = new TestOptional();
        Integer value1 = null;
        Integer value2 = new Integer("10");


        // Optional.ofNullable - 允许传递为 null 参数
        Optional<Integer> a = Optional.ofNullable(value1);

        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
        Optional<Integer> b = Optional.of(value2);

        System.out.println(testOptional.sum(a,b));

    }

    public Integer  sum(Optional<Integer> optional1,Optional<Integer> optional2){
        //判断opitonal是否存在 ispreset()
        System.out.println(optional1.isPresent());
        System.out.println(optional2.isPresent());

        //判断是否存在,如果存在返回值,如果不存在返回默认值
        Integer value1 = optional1.orElse(new Integer("0"));
        System.out.println(value1);

        //get()获取值
        Integer value2 = optional2.get();
        System.out.println(value2);

        return value1 + value2;


    }
}
