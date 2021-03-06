package edu.nf.demo;

/**
 * @author wangl
 * @date 2020/11/19
 */
public class EnglishTeacher extends Teacher {

    @Override
    public void lesson() {
        System.out.println("上英语课程");
    }

    @Override
    public void homework() {
        System.out.println("布置英语作业");
    }

    /**
     * 重写hock方法，将其返回false，即可剔除otherWork
     * @return
     */
    @Override
    public boolean hock() {
        return false;
    }
}
