package com.TestMyProject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
//        String str = "当前采集数据的租户账号为:kkkkkkk";
//        String pattern = "当前采集数据的租户账号为";
//
//        Pattern r = Pattern.compile(pattern);
//        Matcher m = r.matcher(str);
//        System.out.println(m.matches());

//        String dateTime ="2020-08-12 16:20:32";
//        String dateTime1 ="2020-08-12 16:20:35";

        boolean flag = true;

//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime fomatTime1 =LocalDateTime.parse(dateTime,dateTimeFormatter);
//        LocalDateTime fomatTime2 =LocalDateTime.parse(dateTime1,dateTimeFormatter);
//        System.out.println(fomatTime1.compareTo(fomatTime2));
        List<String> eleList = new ArrayList<>();

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM");
//        LocalDate date1 = LocalDate.parse(dateTimeFormatter1)

    }
}
