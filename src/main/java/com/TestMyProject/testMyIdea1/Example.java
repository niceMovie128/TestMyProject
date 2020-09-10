package com.TestMyProject.testMyIdea1;

import org.junit.Test;

/**
 * 本项目主要测试双冒号的使用方法,这里是双冒号是的类构造器的无参的构造方法
 */
public class Example {

    @Test
    public void test(){
    InterfaceExample com = Example::new;
    Example bean = com.create();
    System.out.print(bean);
        System.out.println(com);

    }
}

interface InterfaceExample{
    Example create();
}
