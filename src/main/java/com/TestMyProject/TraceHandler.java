package com.TestMyProject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TraceHandler implements InvocationHandler {

    private Object target;

    public TraceHandler(Object t){
        target = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(target);
        System.out.println("."+ method.getName() + "(");
        if(args !=null ){
            for (int i = 0; i  < args.length;i++){
                System.out.print(args[i]);
                if (i < args.length-1) System.out.println(" ,");
            }
            System.out.print(")");
        }
        return method.invoke(target,args);
    }
}
