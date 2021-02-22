package com.TestMyProject.testLambda;

@FunctionalInterface
public interface TestFunInt {

     void testFunction();

      static void testFunction1(){
        System.out.println("static method");
    }
}

