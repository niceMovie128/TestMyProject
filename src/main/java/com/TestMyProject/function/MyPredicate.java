package com.TestMyProject.function;

import org.apache.poi.ss.formula.functions.T;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 */
public class MyPredicate {

    public static void main(String[] args) {

        List<Double> list = Arrays.asList(12.5D, 68.3D, 256D, 658D, 12D, 69D, 34.5D, 18D);
        List result = filterList(list, value -> {
            if (value > 60D) {
                return true;
            } else
                return false;
        });
        System.out.println(result);

//        对每个元素都加上5
        List result1 = addScore(list,value -> {
           return value +5D;
        });

        System.out.println(result1);
    }

    /**
     * 判读集合中的元素是否大于60,大于60则返回.
     *
     * @param list
     * @param predicate
     * @param <T>
     * @return List
     */
    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        LinkedList<T> linkedList = new LinkedList();
        for (T t : list) {
            if (predicate.test(t)) {
                linkedList.add(t);
            }
        }
        return linkedList;
    }

    /**
     * 使用function对每个元素都加上5
     * @param list
     * @param function
     * @param <T>
     * @return
     */
    private static <T,R> List<R> addScore(List<T> list, Function<T, R> function) {
        /**
         *
         */
        LinkedList<R> linkedList = new LinkedList();
        for (T t : list) {
            linkedList.add(function.apply(t));
        }
        return linkedList;
    }
}
