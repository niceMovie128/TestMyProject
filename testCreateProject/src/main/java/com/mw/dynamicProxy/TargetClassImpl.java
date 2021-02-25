package com.mw.dynamicProxy;

/**
 * @ProjectName: TestMyProject
 * @Package: com.mw.staticProxy
 * @ClassName: TargetClassImpl
 * @Author: mw
 * @Description: 目标接口实现类
 * @Date: 2021/2/24 15:39
 * @Version: 1.0
 */
public class TargetClassImpl implements TargetClass {

    @Override
    public void sayHi() {
        System.out.println("say Hi,使用动态代理");
    }

    @Override
    public void work() {
        System.out.println("work方法,使用动态代理");
    }
}
