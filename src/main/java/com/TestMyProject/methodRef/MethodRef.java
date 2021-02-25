package com.TestMyProject.methodRef;

import com.TestMyProject.testLambda.TestFunInt;
import com.TestMyProject.testLambda.TestPrint;
import com.TestMyProject.testLambda.TestReturn;

/**
 * @ProjectName: TestMyProject
 * @Package: com.TestMyProject.methodRef
 * @ClassName: MethodRef
 * @Author: mw
 * @Description: java8新特性, 使用方法引用
 * @Date: 2021/2/24 10:13
 * @Version: 1.0
 */
public class MethodRef {

    /**
     * @Method testFunction
     * @Author mw
     * @Version  1.0
     * @Description 静态方法的方法引用
     * @param
     * @Return void
     * @Exception
     * @Date 2021/2/24 10:17
     */
    public static void testFunction(){
        System.out.println("方法引用使用代替匿名内部类");
    }

    /**
     * @Method run
     * @Author mw
     * @Version  1.0
     * @Description
     * @param
     * @Return void
     * @Exception
     * @Date 2021/2/24 10:25
     */
    public void run(){

        System.out.println("Thread中内部实例方法的方法引用");
    }

    public static void main(String[] args) {
        TestFunInt testFunInt = new TestFunInt() {
            @Override
            public void testFunction() {
                System.out.println("匿名内部类使用的功能接口方法");
            }
        };
        testFunInt.testFunction();
//        静态方法的方法引用
        TestFunInt testFunInt11 = MethodRef::testFunction;
        testFunInt11.testFunction();

//        实例方法的方法引用
            Thread thread2= new Thread(new MethodRef()::run);
            thread2.start();

//        TestFunInt testFunInt1 = () -> {
//            System.out.println("haha+lambda使用的方法");
//        };
//        testFunInt1.testFunction();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("搞什么,就是搞什么没什么搞得,继续搞啊");
                System.out.println("匿名内部类使用的线程启动");
            }
        });
        thread.start();

//        这里是用的使用lambda表达式
        Thread thread1 = new Thread(() -> System.out.println("使用lambda接口实现这个过程"));
        thread1.start();


//        带参数的lambda表达式.
        TestPrint testPrint = (ok) -> System.out.println("带参数的lambda表达式:"+ok);
        testPrint.printOk("带参数的lambda表达式");

//        方法引用实现带参数的函数式接口
        TestPrint testPrint1 = System.out ::println;
        testPrint1.printOk("方法引用实现带参数的函数式接口");

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
