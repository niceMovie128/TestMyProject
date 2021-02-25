package com.mw.staticProxy;

/**
 * @ProjectName: TestMyProject
 * @Package: com.mw.staticProxy
 * @ClassName: ProxyClass
 * @Author: mw
 * @Description: 代理类
 * @Date: 2021/2/24 15:40
 * @Version: 1.0
 */
public class ProxyClass implements TargetClass {
    private TargetClass targetClass;

    public ProxyClass(TargetClass targetClass) {
        this.targetClass = targetClass;
    }

    /**
     * @Method sayHi
     * @Author mw
     * @Version  1.0
     * @Description 代理方法.类似AOP,切面编程
     * @param
     * @Return void
     * @Exception
     * @Date 2021/2/24 15:50
     */
    @Override
    public void sayHi() {

        System.out.println("前置增强,使用代理类的增强");
        System.out.println("使用代理类自己的方法增强");
        System.out.println("后置增强,使用代理类的增强");
    }

    @Override
    public void work() {

    }


}
