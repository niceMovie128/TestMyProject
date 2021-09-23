package com.TestMyProject.testLambda.testInnerClass;

import lombok.Data;

/**
 * @ProjectName: TestMyProject
 * @Package: com.TestMyProject.testLambda.testInnerClass
 * @ClassName: OuterClass
 * @Author: mw
 * @Description: 测试内部类调用外部域的方法
 * @Date: 2021/6/1 16:55
 * @Version: 1.0
 */
@Data
public class OuterClass {
    int data = 1 ;
    String name = "zs";

    class InnerClass {

        public void printVal(){
            System.out.println(data);
            System.out.println(name);
        }
    }

    public  InnerClass getInner(){
        InnerClass innerClass = this.new InnerClass();
        innerClass.printVal();
        return  innerClass;
    }
}
