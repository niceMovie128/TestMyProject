package com.TestMyProject.ThreadTest;

import java.util.function.Predicate;

/**
 *  and()等同于我们的逻辑与&&,存在短路特性,可以无限嵌套过去
 *  negate()通俗一点解释: 等同于我们的逻辑非
 *  or()是逻辑或
 *
 *
 *
 *
 */
public class TestPredicateTwo {
    public static void main(String[] args) {
        TestPredicateTwo testPredicateTwo = new TestPredicateTwo();
        System.out.println(testPredicateTwo.testAndMethod("wangwu",stringOne -> stringOne.equals("wangwu"),stringTwo -> stringTwo.length()>3));
        System.out.println(testPredicateTwo.testIsEqualMethod("lisi","lisi"));
        System.out.println(testPredicateTwo.testIsEqualMethod("lisi","wangwu"));
        System.out.println(testPredicateTwo.testIsEqualMethod("日治奥","日志"));
        System.out.println(testPredicateTwo.testIsEqualMethod("rizhao",null));
        System.out.println(testPredicateTwo.testIsEqualMethod(null,null));

    }

    /**
     * and方法测试
     * @param testString
     * @param predicateOne
     * @param predicateTwo
     * @return
     */
    public boolean testAndMethod(String testString ,Predicate<String> predicateOne, Predicate<String> predicateTwo){
        return predicateOne.and(predicateTwo).test(testString);
    }

    /**
     * isEqual方法测试
     * @param stringValue1
     * @param stringValue2
     * @return
     */
    public boolean testIsEqualMethod(String stringValue1,String stringValue2){
        return Predicate.isEqual(stringValue1).test(stringValue2);
    }
}
