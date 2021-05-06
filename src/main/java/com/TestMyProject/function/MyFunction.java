package com.TestMyProject.function;

import java.util.List;
import java.util.function.Function;

public class MyFunction {
    public static void main(String[] args) {

        Function<String,Integer> function = (String str) -> Integer.valueOf(str);
        Integer i = function.apply("789");
        System.out.println(i);
    }


}
