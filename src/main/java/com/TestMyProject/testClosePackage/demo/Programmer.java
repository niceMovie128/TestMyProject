package com.TestMyProject.testClosePackage.demo;

/**
 * @ProjectName: TestMyProject
 * @Package: com.TestMyProject.testClosePackage.demo
 * @ClassName: Programmer
 * @Author: mw
 * @Description: 程序员
 * @Date: 2021/5/27 14:08
 * @Version: 1.0
 */
public class Programmer {

        private String name;

        public Programmer() {
            super();
        }

        public Programmer(String name) {
            super();
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void work() {
            System.out.println(name + "正在编程");
        }
    }


