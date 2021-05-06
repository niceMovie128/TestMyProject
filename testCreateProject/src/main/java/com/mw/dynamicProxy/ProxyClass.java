package com.mw.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ProjectName: TestMyProject
 * @Package: com.mw.dynamicProxy
 * @ClassName: ProxyClass
 * @Author: mw
 * @Description: 动态代理类,并不是真正的代理类.它是拦截的类.真正代理类在jvm内存中生成的,
 * $proxyClass这个开始
 * @Date: 2021/2/24 16:23
 * @Version: 1.0
 */
public class ProxyClass implements InvocationHandler {

    Object target;

    public ProxyClass(Object target) {
        this.target = target;
    }

    /**
     * @Method invoke
     * @Author mw
     * @Version  1.0
     * @Description
     * @param proxy 真正代理类,就是jdk生成的代理类.就是就￥proxy的代理类
     * @param method 目标方法,本例子中work和sayhi方法
     * @param args 目标方法的入参
     * @Return java.lang.Object
     * @Exception
     * @Date 2021/2/25 15:36
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        System.out.println("前置增强,使用代理类的增强");
//        中间是调用目标接口的方法
        Object result = method.invoke(target,args);
        System.out.println("后置增强,使用代理类的增强");
        return result;
    }
}
