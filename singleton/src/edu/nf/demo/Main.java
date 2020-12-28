package edu.nf.demo;

/**
 * @author wangl
 * @date 2020/11/16
 */
public class Main {

    public static void main(String[] args) {
        People p1 = People.getInstance();
        People p2 = People.getInstance();
        System.out.println(p1);
        System.out.println(p2);

        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
