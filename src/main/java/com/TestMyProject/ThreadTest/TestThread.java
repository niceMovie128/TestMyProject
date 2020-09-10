package com.TestMyProject.ThreadTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class TestThread {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 一RecursiveAction
//        ForkJoinPool pool = new ForkJoinPool();
//        pool.submit(new MyRecursiveAction(1,20));
//        Thread.sleep(1000);

//        --------------------------------------------------------------
//        二返回结果的多线程调用RecursiveTask
        MyResursiveTask task1 = new MyResursiveTask();
        System.out.println("task1的hashcode="+task1.hashCode());
//        如果在这里获得task1的结果会出现死锁现象,因为task1还没有交给task2执行,但是缺
//        一直需求获得结果,所以这里执行顺序有问题;
//        get和join的区别,get的异常可以在main方法中抛出,二join的异常直接抛出
//        System.out.println("task1的get结果是 "+task1.get());
//        System.out.println("task1的join结果是 "+task1.join());

//        ForkJoinPool pool = new ForkJoinPool();
////        ForkJoinTask<Integer> task2 = pool.submit(task1);
////        System.out.println("task2的hashcode="+task2.hashCode());
////        System.out.println("task2的get结果是"+task2.get());
////        System.out.println("task2的join结果是"+task2.join());
////        System.out.println("task1的get结果是 "+task1.get());
////        System.out.println("task1的join结果是 "+task1.join());
//        --------------------------------------------------------------
//        三使用RecursiveTask执行多个任务并打印,任务之间运行是异步的,但是join()方法是同步的
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> runTaskA= pool.submit(new MyRecursiveTaskA());
        ForkJoinTask<Integer> runTaskB= pool.submit(new MyRecursiveTaskB());
        System.out.println("准备打印" +System.currentTimeMillis());
        System.out.println(( (runTaskA.join() + "A" + System.currentTimeMillis())));
        System.out.println(( (runTaskB.join() + "B" + System.currentTimeMillis())));
        pool.submit(new MyRecursiveAction(1,20));
    }

}
