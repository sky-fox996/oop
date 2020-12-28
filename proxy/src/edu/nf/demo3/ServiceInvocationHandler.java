package edu.nf.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangl
 * @date 2020/11/18
 */
public class ServiceInvocationHandler implements InvocationHandler {

    private ServiceInf target;

    public ServiceInvocationHandler(ServiceInf target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用目标对象的方法
        Object returnVal = method.invoke(target, args);
        //记录日志
        log();
        return returnVal;
    }

    private void log(){
        System.out.println("记录操作日志...");
    }
}
