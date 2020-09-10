package com.TestMyProject.testMyIdea1;

import java.util.function.Function;

public class Example2 {
    public static void main(String[] args) {
        Function<Integer,Example2[]> function = Example2[]::new;
        Example2[] array = function.apply(4);
        for (Example2 example2:array)
            System.out.println(example2);
    }
}
//interface Interface<A,T>{
//    T apply(A a);
//}