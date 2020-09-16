package com.TestMyProject.testMyIdea1;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试list元素删除后其他元素的位置会变化么?会的,并且list的长度也发生变化
 */
public class TestList {
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(11);
        testList.add(12);
        testList.add(13);
        testList.add(14);
        testList.remove(2);
        for (Integer num :testList){
            System.out.println(num);
            System.out.println(testList.size());
        }
    }
}
