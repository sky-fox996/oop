package edu.nf.demo;

/**
 * @author wangl
 * @date 2020/11/19
 */
public class JavaTeacher extends Teacher{

    @Override
    public void lesson() {
        System.out.println("上Java课程");
    }

    @Override
    public void homework() {
        System.out.println("布置Java作业");
    }
}
