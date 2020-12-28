package edu.nf.demo;

/**
 * @author wangl
 * @date 2020/11/23
 */
public class ObserverA implements Observer {

    @Override
    public void doSomething(String message) {
        System.out.println("ObserverA处理消息：" + message);
    }
}
