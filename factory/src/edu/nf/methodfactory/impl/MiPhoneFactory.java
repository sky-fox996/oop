package edu.nf.methodfactory.impl;

import edu.nf.item.Phone;
import edu.nf.item.impl.MiPhone;
import edu.nf.methodfactory.AbstractFactory;

/**
 * @author wangl
 * @date 2020/11/17
 */
public class MiPhoneFactory implements AbstractFactory {

    @Override
    public Phone build() {
        return new MiPhone();
    }
}
