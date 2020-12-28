package edu.nf.homework;

import java.io.IOError;
import java.io.IOException;
import java.sql.Connection;

/**
 * @author wangl
 * @date 2020/11/18
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ConnectionPool pool = new ConnectionPool(5);
        System.out.println("连接池大小：" + pool.size());
        //获取连接
        Connection conn1 = pool.getConnection();
        System.out.println("连接池大小：" + pool.size());
        //注意：调用conn的close方法时，将连接放回连接池
        conn1.close();
        conn1.close();
        System.out.println("连接池大小：" + pool.size());

       /* System.out.println("--------------------------");
        //获取连接
        Connection conn3 = pool.getConnection();
        Connection conn4 = pool.getConnection();
        System.out.println("连接池大小：" + pool.size());
        //注意：调用conn的close方法时，将连接放回连接池
        conn3.close();
        conn4.close();
        System.out.println("连接池大小：" + pool.size());*/
    }
}
