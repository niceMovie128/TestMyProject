package com.mw.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ProjectName: TestMyProject
 * @Package: com.mw.dynamicProxy
 * @ClassName: ProxyClass
 * @Author: mw
 * @Description: 动态代理类,并不是真正的代理类.
 * @Date: 2021/2/24 16:23
 * @Version: 1.0
 */
public class ProxyClass implements InvocationHandler {

    Object target;

    public ProxyClass(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("前置增强,使用代理类的增强");
//        中间是调用目标接口的方法
        Object result = method.invoke(target,args);
        System.out.println("后置增强,使用代理类的增强");
        return result;
    }
}
