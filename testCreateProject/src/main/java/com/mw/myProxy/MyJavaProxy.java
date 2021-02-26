package com.mw.myProxy;

import sun.reflect.Reflection;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;

/**
 * @ProjectName: TestMyProject
 * @Package: com.mw.myProxy
 * @ClassName: MyJavaProxy
 * @Author: mw
 * @Description: 此类作用用来生成代理类的工具
 * @Date: 2021/2/25 15:47
 * @Version: 1.0
 */
public class MyJavaProxy {
    public static Object newProxyInstance(MyJavaClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h)
            throws IllegalArgumentException
    {
//        把代理类￥proxy的源代码生成好
//        把生成的好的代理类编译成.class文件
//        把编译好的文件加载到jvm内存离
//        根据jvm的加载class的文件,反射生成具体对象
//        return代理对象
        return  null;
        }
}
