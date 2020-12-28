package edu.nf.demo1;

/**
 * @author wangl
 * @date 2020/11/18
 */
public class Main {

    public static void main(String[] args) {
        //创建代理
        PcFactory proxy = new AcerProxy(new AcerFactory());
        proxy.sell(2500);
    }
}
