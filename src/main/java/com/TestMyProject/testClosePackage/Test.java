package com.TestMyProject.testClosePackage;

/**
 * @ProjectName: TestMyProject
 * @Package: com.TestMyProject.testClosePackage
 * @ClassName: Test
 * @Author: mw
 * @Description: 测试闭包, 不知道怎么用但是测试一下
 * @Date: 2021/5/27 14:00
 * @Version: 1.0
 */
public class Test {
    private int data=0;
    private class Inner{
        void print()
        {
            System.out.println(Test.this.data);
        }
    }
    Inner getInnerInstance()
    {
        return new Inner();
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test t1=new Test();
        t1.data=1;
        Test t2=new Test();
        t2.data=2;
        Inner inner1=t1.getInnerInstance();
        Inner inner2=t2.getInnerInstance();
        inner1.print();
        //1
        inner2.print();
        //2
    }
}
