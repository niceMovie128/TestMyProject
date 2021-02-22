package com.TestMyProject.testMyIdea1;

import java.time.YearMonth;

import static java.time.temporal.ChronoUnit.MONTHS;

public class TestDate {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2021, 2);
        System.out.println(MONTHS.between(yearMonth, YearMonth.now()));

    }
}
