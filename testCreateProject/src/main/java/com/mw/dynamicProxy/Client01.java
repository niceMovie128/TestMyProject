package com.mw.dynamicProxy;

/**
 * @ProjectName: TestMyProject
 * @Package: com.mw.staticProxy
 * @ClassName: Client01
 * @Author: mw
 * @Description: 其中一个客户端调用
 * @Date: 2021/2/24 15:51
 * @Version: 1.0
 */
public class Client01 {
    public static void main(String[] args) {
        TargetClass targetClass = new TargetClassImpl();
        targetClass.sayHi();
    }
}
