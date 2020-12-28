package edu.nf.demo2;

import java.io.FileInputStream;

/**
 * @author wangl
 * @date 2020/11/20
 */
public class Main {

    public static void main(String[] args) {
        HttpServletRequest req = new HttpServletRequest();
        HttpServletResponse resp = new HttpServletResponse();
        //创建FilterChain
        FilterChain chain = new FilterChain();
        chain.doExecute(req, resp);
    }
}
