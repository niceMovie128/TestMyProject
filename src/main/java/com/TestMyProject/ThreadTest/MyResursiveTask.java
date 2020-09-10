package com.TestMyProject.ThreadTest;

import java.util.concurrent.RecursiveTask;

public class MyResursiveTask extends RecursiveTask<Integer> {

    //无论紧张和还是放松都是玩具的一部分,不要太在乎.就是玩,就是干.不停息.neverstopable
    @Override
    protected Integer compute() {
        System.out.println("computer time = "+ System.currentTimeMillis());
        return 100;
    }
}
