package edu.nf.demo.impl;

import edu.nf.demo.Calculator;

import java.math.BigDecimal;

/**
 * @author wangl
 * @date 2020/11/18
 */
public class MultiImpl implements Calculator {

    @Override
    public BigDecimal cal(BigDecimal numA, BigDecimal numB) {
        //乘法计算
        return numA.multiply(numB);
    }
}
