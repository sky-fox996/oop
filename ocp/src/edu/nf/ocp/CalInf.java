package edu.nf.ocp;

/**
 * @author wangl
 * @date 2020/11/16
 * 计算接口
 */
public interface CalInf {

    /**
     * 抽象的计算方法，由各种实现类去实现
     * @param a
     * @param b
     * @return
     */
    double calculator(double a, double b);
}
