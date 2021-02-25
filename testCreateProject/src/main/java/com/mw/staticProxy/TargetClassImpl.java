package com.mw.staticProxy;

/**
 * @ProjectName: TestMyProject
 * @Package: com.mw.staticProxy
 * @ClassName: TargetClassImpl
 * @Author: mw
 * @Description: 目标接口实现类
 * @Date: 2021/2/24 15:39
 * @Version: 1.0
 */
public class TargetClassImpl implements TargetClass{

    @Override
    public void sayHi() {
        System.out.println("say Hi,没有使用代理类");
    }

    @Override
    public void work() {
        System.out.println("work方法");
    }
}
