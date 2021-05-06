package com.TestMyProject.testLambda;

import org.junit.Test;

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
            System.out.println("带参数的lambda表达式:"+ok);
        };
        testPrint.printOk("带参数的lambda表达式");
//带返回值的lambda表达式
        TestReturn testReturn = (ok) -> {
            System.out.println("使用lambda的返回值类型:");
            return "使用lambda的返回值类型:"+ok;
        };
        System.out.println(testReturn.testReturn("paramter"));
//没有大括号的lambda表达式,并且如果大括号只有一行代码,return也可以省略去.
        TestReturn testReturn1 = (ok1) ->  "没有大括号的lambda表达式"+ok1;
        System.out.println(testReturn1.testReturn("paramter"));

//如果只有一个参数,那么小括号也可以省略
        TestReturn testReturn2 = ok2 -> ok2+"如果只有一个参数,那么小括号也可以省略";
        testReturn2.testReturn("paramter");
        System.out.println(testReturn2.testReturn("paramter"));
    }
}
