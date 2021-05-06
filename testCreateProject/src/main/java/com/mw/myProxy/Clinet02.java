package com.mw.myProxy;


import java.lang.reflect.Proxy;

/**
 * @ProjectName: TestMyProject
 * @Package: com.mw.staticProxy
 * @ClassName: Clinet02
 * @Author: mw
 * @Description: 使用代理类调用目标接口的方法
 * @Date: 2021/2/24 15:53
 * @Version: 1.0
 */
public class Clinet02 {
    public static void main(String[] args) {
//        使用动态代理
//        使用动态代理的方法
//        下面是一种获得classLoader,还又其他方式获得classLoader
//        ClassLoader.getSystemClassLoader()  获得classloader 方式一
//        Thread.currentThread().getContextClassLoader() 获得classloader  获得classloader 方式二

//        TargetClass targetClass = (TargetClass) MyJavaProxy.newProxyInstance(TargetClass.class.getClassLoader() ,
//                new Class<?>[] {TargetClass.class},
//                new ProxyClass(new TargetClassImpl()));
//        targetClass.sayHi();
//        targetClass.work();
        }
}
