package edu.nf.demo5;

import org.evergreen.aop.core.ProxyBuilder;

/**
 * @author wangl
 * @date 2020/11/19
 */
public class Main {

    public static void main(String[] args) {
        //创建一个代理生成器
        ProxyBuilder builder = new ProxyBuilder(StuService.class);
        //创建代理实例
        StuService proxy = builder.createProxy();
        proxy.add();
        System.out.println("-----------------");
        proxy.update();
    }
}
