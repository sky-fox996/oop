package edu.nf.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangl
 * @date 2020/11/18
 * 回调处理器（作用就是调用Target对象的具体方法）
 */
public class DemoInvocationHandler implements InvocationHandler {

    /**
     * 目标对象
     */
    private Object target;

    public DemoInvocationHandler(Object target){
        this.target = target;
    }

    /**
     *
     * @param proxy 这个参数是JDK在运行时自动产生的代理对象
     * @param method 目标对象的具体方法，也就是TargetImpl的todo方法
     * @param args 目标对象方法所需的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        //用目标对象的方法
        Object returnValue = method.invoke(target, args);
        after();
        return returnValue;
    }

    private void before(){
        System.out.println("调用目标对象方法之前执行一些业务逻辑...");
    }

    private void after(){
        System.out.println("调用目标对象方法之后执行一些业务逻辑...");
    }
}
