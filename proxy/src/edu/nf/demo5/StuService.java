package edu.nf.demo5;

import org.evergreen.aop.annotation.Interceptors;

/**
 * @author wangl
 * @date 2020/11/19
 */
//标注在类上会代理所有方法
@Interceptors(StuServiceInterceptor.class)
public class StuService {

    //注解标注在方法上只会代理当前的方法
    //@Interceptors(StuServiceInterceptor.class)
    public void add(){
        System.out.println("添加学生");
    }

    public void update(){
        System.out.println("更新学生信息");
    }
}
