package edu.nf.simplefactory;

import edu.nf.item.Phone;
import edu.nf.item.impl.ApplePhone;
import edu.nf.item.impl.MiPhone;

/**
 * @author wangl
 * @date 2020/11/17
 * 简单工厂
 */
public class SimpleFactory {

    /**
     *
     * @param name 产品名称
     * @return
     */
    public static Phone build(String name){
        Phone phone = null;
        if("apple".equals(name)){
            phone = new ApplePhone();
        }else if("mi".equals(name)){
            phone = new MiPhone();
        }
        return phone;
    }
}
