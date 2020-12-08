package com.TestMyProject.ThreadTest;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 简单使用Slf4j的试用.
 * 流简单处理
 */
@Slf4j
public class TestStringMethod {
    public static void main(String[] args) {
        log.info("这是测试开始的,测试一下");
        try {
            String contents = new String(Files.readAllBytes(Paths.get("C:\\Users\\mw\\Desktop\\testStrngMethod.txt")), StandardCharsets.UTF_8);
            log.info(contents);
            List<String> words = Arrays.asList(contents.split("\\PL+"));
            int count = 0;
            for (String word:words) {
                if (word.length()>5){
                    count++;
                }
            }
            System.out.println(count);

//            第二个方法
            long count1 = words.stream().filter(w -> w.length()>5).count();
            System.out.println(count1);

//          fork/join框架是的并行操作
            long parallCount = words.parallelStream().filter(testWord -> testWord.length()>5).count();
            System.out.println(parallCount);


//            任何集合通过Collection这个接口转换为流
            Stream<String> words1 = Stream.of(contents.split("\\PL+"));
           long count2 =  words1.filter(testvalue1 -> testvalue1.length()>5).count();
            System.out.println(count2);
        } catch (IOException e) {
            e.printStackTrace();
            log.info(e.getMessage());

        }
    }
}
