package edu.nf.homework;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.LinkedList;

/**
 * @author wangl
 * @date 2020/11/18
 */
public class ConnectionPool {

    /**
     * 连接池
     */
    private LinkedList<Connection> pool = new LinkedList();

    /**
     * 在构造方法中初始化连接池大小
     * （从数据库获取size个Connection放到pool中）
     */
    public ConnectionPool(int size){
        for(int i= 0; i<size; i++){
            //获取连接对象（目标对象）
            Connection conn = ConnUtils.getConnection();
            //根据目标对象创建代理实例
            Connection proxy = createProxy(conn);
            //将代理对象放入连接池
            pool.add(proxy);
        }
    }

    /**
     * 根据目标对象创建代理实例
     * @param conn 目标对象
     * @return
     */
    private Connection createProxy(Connection conn){
        return (Connection) Proxy.newProxyInstance(
                ConnectionPool.class.getClassLoader(),
                new Class[]{Connection.class},
                new ConnInvocationHandler(pool, conn));
    }

    /**
     * 获取连接的方法
     * @return
     */
    public Connection getConnection() {
        if(pool.size() > 0){
            return pool.removeFirst();
        }
        throw new RuntimeException("连接池暂无可用连接");
    }

    /**
     * 连接池大小
     * @return
     */
    public int size(){
        return pool.size();
    }
}
