package com.TestMyProject.testMyIdea1;

/**
 * 这是带参数的构造方法的例子
 */
public class Example1 {
    private String name ;
    Example1(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Interface1Example com = Example1::new;
        Example1 bean = com.create("测试带参数的构造方法");
        System.out.println(bean.name);
    }
}


interface Interface1Example{
    Example1 create(String name);
}