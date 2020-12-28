package edu.nf.demo;

/**
 * @author wangl
 * @date 2020/11/23
 */
public class ObserverB implements Observer {

    @Override
    public void doSomething(String message) {
        System.out.println("ObserverB处理消息：" + message);
    }
}
