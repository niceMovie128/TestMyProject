package com.TestMyProject.testClosePackage.demo;

/**
 * @ProjectName: TestMyProject
 * @Package: com.TestMyProject.testClosePackage.demo
 * @ClassName: TeachableProgrammer
 * @Author: mw
 * @Description: 闭包（Closure）是一种能被调用的对象，它保存了创建它的作用域的信息。
 * JAVA并不能显式地支持闭包，但是在JAVA中，闭包可以通过“接口+内部类”来实现，
 * 因为对于非静态内部类而言，它不仅记录了其外部类的详细信息，还保留了一个创建非静态内部类的引用，
 * 通过它可以访问外部类的私有成员，因此可以把非静态内部类当成面向对象领域的闭包。
 * 那么，通过这种仿闭包的非静态内部类可以很方便地实现回调，这是一种非常灵活的功能，
 * 比如在这样一个例子中就能用上这种机制：一个Teachable接口和Programmer基类都提供了一个work方法，
 * 方法签名完全一样，功能不一样。Teachable的work方法用来执行教学，Programmer的work用来执行编程。
 * 那么假如有一个人既是教师又是程序员，也就是需要定义一个类既继承Programmer父类又要实现Teachable，
 * 问题在于这个类只能定义一个work方法，那怎么去实现这个需求呢，
 * 这里就可以利用内部类可以访问外部类的私有成员的特点来解决这个问题。
 *
 * 原文链接：https://blog.csdn.net/weixin_41563161/article/details/104426612
 * @Date: 2021/5/27 14:09
 * @Version: 1.0
 */
public class TeachableProgrammer  extends Programmer implements Teachable {
    public TeachableProgrammer() {
        super();
    }

    public TeachableProgrammer(String name) {
        super(name);
    }

    // 教学工作任然由TeachableProgrammer定义
    private void teach() {
        System.out.println(getName() + "正在讲课");
    }

    private class Closure implements Teachable {

        @Override
        public void work() {
            // 非静态内部类实现Teachable的work方法，作用仅仅是向客户类提供一个回调外部类的途径
            teach();
        }
    }

    // 返回一个非静态内部类的引用,允许外部类通过该引用来回调外部类的方法
    public Teachable getCallbackReference() {
        return new Closure();
    }

}
