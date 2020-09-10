package com.TestMyProject.ThreadTest;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTaskA extends RecursiveTask {
    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread().getName()+"begin A"+System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 100;
    }
}
