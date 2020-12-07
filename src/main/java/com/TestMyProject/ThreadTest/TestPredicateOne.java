package com.TestMyProject.ThreadTest;

import org.apache.poi.ss.formula.eval.EvaluationException;

import java.util.function.Predicate;

public class TestPredicateOne {
    public static void main(String[] args) {

        TestPredicateOne testPredicateOne = new TestPredicateOne();

        System.out.println(testPredicateOne.judgeConditionByPredicte(123455555, value -> String.valueOf(value).length()>5));
        System.out.println(testPredicateOne.judgeConditionByPredicte(2, value -> value%2==0));
        System.out.println(testPredicateOne.judgeConditionByPredicte(2, value -> value>0));




    }

    public boolean judgeConditionByPredicte(int value, Predicate<Integer> predicate){
        return predicate.test(value);
    }
}
