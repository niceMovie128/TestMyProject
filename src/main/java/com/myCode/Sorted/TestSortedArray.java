package com.myCode.Sorted;

/***
 * 排序 使用排序的方法
 * https://www.bilibili.com/video/BV1EW411u7th?p=13 算法入门这里 视频位置 03:15
 */
public class TestSortedArray {
    public static void main(String[] args) {
        int[] testData = {-1,25,12,26,8,6,5,3,56,125,236,29,35};
        for (int i = 0; i <testData.length ; i++) {
            System.out.println(testData[i]);
        }
//        排序后
       testData =  sortArray(testData);
        for (int i = 0; i < testData.length ; i++) {
            System.out.println(testData[i]);
        }
    }


    public static  int[] sortArray(int[] data){
        int samllestData = 0;
        for (int i = 0; i <data.length ; i++) {
            samllestData = data[i];
            for (int j = i+1; j <data.length; j++) {
                if (data[j] < samllestData){
                    samllestData = data[j];
                    data[j] = data[i];
                    data[i] = samllestData;

                }
            }
        }
        return data;
    }
}
