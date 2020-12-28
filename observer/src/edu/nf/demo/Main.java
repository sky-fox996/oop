package edu.nf.demo;

/**
 * @author wangl
 * @date 2020/11/23
 */
public class Main {

    public static void main(String[] args) {
        //创建主题
        SubjectA subject = new SubjectA();
        //创建多个观察者
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        //将观察者注册到（添加）到具体的主题上
        subject.addObserver(observerA);
        subject.addObserver(observerB);
        //发布消息
        subject.publish("Hello world");
    }
}
