package com.TestMyProject.testLambda;

/**
 *测试lambda表达式中的使用;使用函数式接口的使用
 */
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
                System.out.println("匿名内部类使用的线程启动");
            }
        });
        thread.start();

//        这里是用的使用lambda表达式
        Thread thread1 = new Thread(() -> {
            System.out.println("使用lambda接口实现这个过程");
        });
        thread1.start();


//        带参数的lambda表达式.
        TestPrint testPrint = ( ok) -> {
            System.out.println("ceshi:这里的ok的值是:"+ok);
        };
        testPrint.printOk("cao,我心里很不爽");


    }
}
