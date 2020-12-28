package edu.nf.demo;

import edu.nf.demo.impl.AddImpl;

import java.math.BigDecimal;

/**
 * @author wangl
 * @date 2020/11/18
 */
public class Main {
    public static void main(String[] args) {
        /*
        Calculator c = new AddImpl();
        BigDecimal numA = new BigDecimal("3.5");
        BigDecimal numB = new BigDecimal("2.2");
        BigDecimal result = c.cal(numA, numB);
        //可以将BigDecimal转换为其他的基本数据类型，例如double
        System.out.println(result.doubleValue());
        */

        BigDecimal numA = new BigDecimal("3.5");
        BigDecimal numB = new BigDecimal("2.2");
        //创建策略上下文
        CalculatorContext context = new CalculatorContext("add");
        BigDecimal result = context.cal(numA, numB);
        System.out.println(result.doubleValue());
    }
}
