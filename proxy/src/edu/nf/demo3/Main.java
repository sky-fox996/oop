package edu.nf.demo3;

import edu.nf.demo3.impl.UserServiceImpl;

import javax.xml.ws.Service;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author wangl
 * @date 2020/11/18
 */
public class Main {

    public static void main(String[] args) {
        InvocationHandler handler = new ServiceInvocationHandler(new UserServiceImpl());
        ServiceInf proxy = (ServiceInf)Proxy.newProxyInstance(
                Main.class.getClassLoader(),
                UserServiceImpl.class.getInterfaces(),
                handler);
        proxy.add();
        proxy.get();
        proxy.update();
    }
}
