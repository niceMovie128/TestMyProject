package com.TestMyProject;

import jxl.Sheet;
import jxl.Workbook;
import jxl.common.Assert;
import jxl.read.biff.BiffException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class TestExcel {
    public static void main(String[] args) {

//        File file = new File("D:/readExcel.xls");
//        List excelList = readExcel(file);
//        System.out.println("list中的数据打印出来");
//        for (int i = 0; i < excelList.size(); i++) {
//            List list = (List) excelList.get(i);
//            for (int j = 0; j < list.size(); j++) {
//                System.out.print(list.get(j));
//            }
//            System.out.println();
//        }

//        Byte i = new Byte("3");
//        System.out.println(i == 3);
//
//        String[] list = new File("D:\\建行项目\\账户").list();
//        for (String name :list){
//            System.out.println(name);
//        }
//
////        System.out.println("2020-12".compareTo("2021-01"));
//        List<Integer> list1 =  new ArrayList<>();
//        List<Integer> list2 =  new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//
//        list2.add(2);
//        list2.add(4);
//
//        //移除包含的子集
//        list1.removeAll(list2);
//        for (Integer i:list1
//             ) {
//            System.out.println(i);
//        }

        User user1 = new User("1","1");
        User user2 = new User("2","2");
        User user3 = new User();
        User user4 = new User("4","4");
        User user5 = new User("5","5");
        User user6 = new User("6","6");

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);


// forEach 报出null的位置是在

        String i = "abc";
        String i1 = null;

        System.out.println(i+i1);

        for (User user:userList
             ) {
            assert user.getName() ==null :"这里的有空指针异常"+user;
            System.out.println(user.getName().length());
        }
        ConcurrentHashMap map =  new ConcurrentHashMap();


    }

    public static List readExcel(File file) {
//        try {
//            // 创建输入流，读取Excel
//            InputStream is = new FileInputStream(file.getAbsolutePath());
//            // jxl提供的Workbook类
////            Workbook wb = Workbook.getWorkbook(is);
//            XSSFWorkbook wb = new XSSFWorkbook(is);
//            // Excel的页签数量
//            int sheet_size = wb.getNumberOfSheets();
//            for (int index = 0; index < sheet_size; index++) {
//                List<List> outerList=new ArrayList<List>();
//                // 每个页签创建一个Sheet对象
//                XSSFSheet sheet = wb.getSheetAt(index);
//                // sheet.getRows()返回该页的总行数
//                for (int i = 0; i < sheet.getLastRowNum(); i++) {
//                    List innerList=new ArrayList();
//                    // sheet.getColumns()返回该页的总列数
//                    for (int j = 0; j < sheet.getColumns(); j++) {
//                        String cellinfo = sheet.getCell(j, i).getContents();
//                        if(cellinfo.isEmpty()){
//                            continue;
//                        }
//                        innerList.add(cellinfo);
//                        System.out.print(cellinfo);
//                    }
//                    outerList.add(i, innerList);
//                    System.out.println();
//                }
//                return outerList;
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (BiffException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return null;
    }


}
