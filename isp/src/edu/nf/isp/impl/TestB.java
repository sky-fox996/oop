package edu.nf.isp.impl;

import edu.nf.isp.TestbInf;

/**
 * @author wangl
 * @date 2020/11/16
 */
public class TestB implements TestbInf {

    @Override
    public void methodB() {
        System.out.println("test b...");
    }

    @Override
    public void methodC() {
        System.out.println("test c...");
    }
}
