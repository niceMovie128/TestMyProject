package com.TestMyProject.testMyIdea1;
import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * 测试list元素删除后其他元素的位置会变化么?会的,并且list的长度也发生变化
 */
public class TestList {
    public static void main(String[] args) throws ParseException {
//        List<Integer> testList = new ArrayList<>();
//        testList.add(11);
//        testList.add(12);
//        testList.add(13);
//        testList.add(14);
//        testList.remove(2);
//        for (Integer num :testList){
//            System.out.println(num);
//            System.out.println(testList.size());
//        }

        String source = "2021-01-11T08:38:18Z";
        String target = source.replace("T"," ").replace("Z","");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        Date date =  simpleDateFormat.parse(target);
//        System.out.println(date);
//        Timestamp timestamp = new Timestamp(date.getTime());
//        System.out.println(timestamp.toInstant());
//        System.out.println(timestamp);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(target,dateTimeFormatter);
        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        System.out.println(timestamp);

        String path = TestList.class.getClassLoader().getResource("").toString();
        path= path.replace('/','\\'); //将 '/' 替换为 '\',
        path=path.replace("file:","");//去掉开头的file
        path=path.replace("classes\\","");//去掉无用路径
        path=path.replace("target\\","");//去掉无用路径
        path=path.substring(1);//截取 ,去掉路径中第一个 '\'

        System.out.println(path);



    }
}
