package com.TestMyProject.ThreadTest;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

    private int startValue;
    private int endValue;

    public MyRecursiveAction(int startValue, int endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
    }
    @Override
    protected void compute() {
        System.out.println(Thread.currentThread().getName()+"------现在执行的线程名称--------");
        if (endValue-startValue >2){
            int middleNum = (startValue+endValue)/2;
            MyRecursiveAction lelfAction = new MyRecursiveAction(startValue,middleNum);
            MyRecursiveAction rightAction = new MyRecursiveAction(middleNum,endValue);
            this.invokeAll(lelfAction,rightAction);
        }else {
            System.out.println("打印组合"+"  startValue="+startValue+"  endValue="+endValue);
        }
    }
}

