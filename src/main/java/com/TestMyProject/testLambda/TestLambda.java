package com.TestMyProject.testLambda;

public class TestLambda {
    public static void main(String[] args) {
        TestFunInt testFunInt = new TestFunInt() {
            @Override
            public void testFunction() {
                System.out.println("匿名内部类使用的功能接口方法");
            }
        };

        testFunInt.testFunction();
        TestFunInt testFunInt1 = () -> {
            System.out.println("haha+lambda使用的方法");
        };
        testFunInt1.testFunction();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("搞什么,就是搞什么没什么搞得,继续搞啊");
            }
        });
        thread.start();
    }
}
