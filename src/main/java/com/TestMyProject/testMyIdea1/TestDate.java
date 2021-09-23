package com.TestMyProject.testMyIdea1;

import org.omg.PortableInterceptor.LOCATION_FORWARD;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.MONTHS;

/**
 * 处理时间的用法
 */
public class TestDate {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2021, 2);
        System.out.println(MONTHS.between(yearMonth, YearMonth.now()));

        LocalDate now = LocalDate.now();
        now.getDayOfWeek();
        System.out.println("===================================");
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek().equals(DayOfWeek.TUESDAY) );
        LocalDate lastWeekStartDay = now.minusWeeks(1);
        LocalDate lastWeekEndDay =    lastWeekStartDay.plusDays(6);

        System.out.println(now);
        System.out.println(lastWeekStartDay);
        System.out.println(lastWeekEndDay);

         LocalDateTime lastWeekStartTime = LocalDateTime.of(lastWeekStartDay, LocalTime.MIN);
         LocalDateTime lastWeekEndTime = LocalDateTime.of(lastWeekStartDay, LocalTime.MAX);
        System.out.println(lastWeekStartTime);
        System.out.println(lastWeekEndTime);

       String t1 =  LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(t1);

        System.out.println(9%3);




    }
}
