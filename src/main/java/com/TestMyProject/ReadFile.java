package com.TestMyProject;

import java.io.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        String path = "D:\\temp\\oac-aim.log.txt";
        FileInputStream inputStream = null;
        

        Scanner sc = null;
        File outPutFile = new File("D:\\temp\\output.txt");
        outPutFile.createNewFile();
        BufferedWriter out = new BufferedWriter(new FileWriter(outPutFile));
        try {
            inputStream = new FileInputStream(path);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String str = "";
//                String pattern = "当前采集数据的租户账号为";
//
//                Pattern r = Pattern.compile(pattern);
//                Matcher m = r.matcher(str);
//                System.out.println(m.matches());
                if (line.contains("当前采集数据的租户账号为") || line.contains("资源花费详情响应为空")){

//                    \n 这里使用的是换行符,java这里在文本中使用
                    out.write(line+"\n");
                    out.flush();

                    System.out.println(line);
                }
                // System.out.println(line);
            }
            // note that Scanner suppresses exceptions
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } finally {

            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();

            }
            if (out !=null){
                out.close();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-startTime);
        System.out.println("A"+"\n"+"B");
    }

}
