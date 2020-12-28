package edu.nf.abstractfactory.impl;

import edu.nf.abstractfactory.AbstractFactory;
import edu.nf.item.Pad;
import edu.nf.item.Phone;
import edu.nf.item.impl.ApplePad;
import edu.nf.item.impl.ApplePhone;

/**
 * @author wangl
 * @date 2020/11/17
 */
public class AppleFactory implements AbstractFactory {

    @Override
    public Phone buildPhone() {
        return new ApplePhone();
    }

    @Override
    public Pad buildPad() {
        return new ApplePad();
    }
}
