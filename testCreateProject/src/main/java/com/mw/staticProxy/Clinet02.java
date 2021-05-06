package com.mw.staticProxy;

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
        ProxyClass proxyClass = new ProxyClass(new TargetClassImpl());
        proxyClass.sayHi();
    }
}
