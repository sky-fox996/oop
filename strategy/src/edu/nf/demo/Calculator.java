package edu.nf.demo;

import java.math.BigDecimal;

/**
 * @author wangl
 * @date 2020/11/18
 */
public interface Calculator {

    /**
     * 抽象的计算方法
     * @param numA
     * @param numB
     * @return
     */
    BigDecimal cal(BigDecimal numA, BigDecimal numB);
}
