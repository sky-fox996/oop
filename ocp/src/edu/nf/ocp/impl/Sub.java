package edu.nf.ocp.impl;

import edu.nf.ocp.CalInf;

/**
 * @author wangl
 * @date 2020/11/16
 */
public class Sub implements CalInf {

    @Override
    public double calculator(double a, double b) {
        return a - b;
    }
}
