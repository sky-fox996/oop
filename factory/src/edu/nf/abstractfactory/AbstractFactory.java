package edu.nf.abstractfactory;

import edu.nf.item.Pad;
import edu.nf.item.Phone;

/**
 * @author wangl
 * @date 2020/11/17
 */
public interface AbstractFactory {

    Phone buildPhone();

    Pad buildPad();
}
