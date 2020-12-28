package edu.nf.demo;

/**
 * @author wangl
 * @date 2020/11/19
 */
public class PhpTeacher extends Teacher{

    @Override
    public void lesson() {
        System.out.println("上Php课程");
    }

    @Override
    public void homework() {
        System.out.println("布置Php作业");
    }
}
