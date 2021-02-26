package com.mw.myProxy;

import java.lang.reflect.Method;

/**
 * @ProjectName: TestMyProject
 * @Package: com.mw.myProxy
 * @ClassName: MyInvocationHandler
 * @Author: mw
 * @Description: 对目标方法进行的拦截的方法的
 * @Date: 2021/2/25 15:45
 * @Version: 1.0
 */
public interface MyInvocationHandler {
//    对目标方法进行拦截
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
