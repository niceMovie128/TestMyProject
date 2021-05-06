package com.TestMyProject.testLambda;

/**
 * 函数式接口中,使用抽象方法;使用lambda的使用
 */
@FunctionalInterface
public interface TestFunInt {

     void testFunction();

      static void testFunction1(){
        System.out.println("static method");
    }
}

