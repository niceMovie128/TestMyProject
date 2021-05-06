package com.TestMyProject.ThreadTest;

import java.util.function.Predicate;

//https://blog.csdn.net/qq_27416233/article/details/83418791 测试这个网址
public class TestPredicate {
    public static void main(String[] args) {
        TestPredicate testPredicate = new TestPredicate();
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("lisi");
            }
        };

        System.out.println(predicate.test("ll"));
        System.out.println(predicate.test("lisi"));
    }
}
