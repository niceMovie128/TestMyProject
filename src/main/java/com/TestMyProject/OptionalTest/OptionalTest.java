package com.TestMyProject.OptionalTest;

import javafx.scene.chart.ValueAxis;
import lombok.Data;
import org.apache.poi.ss.formula.eval.EvaluationException;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * ClassName:OptionalTest
 * package:com.TestMyProject.OptionalTest
 * company:mw.lt
 * ctrl+alt+v 抽提变量
 * ctrl+shift+F10 运行代码
 * @Date:2021/5/913:12
 * @Author:mw
 */
@Data
public class OptionalTest {

//    public String value = "addd";
    public String value = null;
    public static void main(String[] args) {
        String name = "name";
        String other= "11211";
//这里ofNullabel,如果有空值的可以继续使用
        Optional<String> nameOptional = Optional.ofNullable(name);
        Optional<String> optional1 = Optional.ofNullable(other);
        //这里用空值的会报错。
        Optional<String> optional2 = Optional.of(other);
//        System.out.println(optional2.get());
//        System.out.println(nameOptional);
//        System.out.println(optional2.isPresent());
//        System.out.println(optional1.isPresent());
//        System.out.println(nameOptional.isPresent());
//        System.out.println(nameOptional.get());

        //如果是name是空值的话,就用orElse复制默认值.默
//        String meite = Optional.ofNullable(name).orElse("meite");
//        System.out.println(meite);

        //使用过滤器
        boolean res = nameOptional.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("name");
            }
        }).isPresent();

        System.out.println(res);

        //使用方法引入和lambada表达式的用法。当
//        test();

        //使用orelse。
        OptionalTest optionalTest = new OptionalTest();
//        optionalTest.test2();

        //简化使用orElse

        System.out.println(optionalTest.testOrElse());

    }

    /**
     * 当ifpresent为true才使用消费者模式，使用这个东东
     */
    private static void test(){
        String name = "okok";
        String name1 = "okok1";
        String name2 = null;


        Optional<String> optional1 = Optional.ofNullable(name2);
        optional1.isPresent();
        if (optional1.isPresent()){
            System.out.println(optional1.get());
        }
        optional1.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //使用lambada表达式
        optional1.ifPresent(s -> System.out.println(s));
        //是由方法引入
        optional1.ifPresent(System.out::print);
    }

    //当value为空的时候，可以进行一些操作
    private  String test2(){

        String s = Optional.ofNullable(value).orElseGet(new Supplier<String>() {
            @Override
            public String get() {
                value = "firstTest";
                return value;
            }
        });

        System.out.println(s);
        this.value = null;
        System.out.println(Optional.ofNullable(value).isPresent());
         s = Optional.ofNullable(value).orElseGet(() -> {
            value = "secondGetValue";
            return value;
        });
        System.out.println(s);
        return s;

    }

    /**
     *
     * @return
     */
    private String testOrElse(){
        String s = Optional.ofNullable(value).orElseGet(this::test2);
        return s;
    }
}
