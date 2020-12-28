package edu.nf.item.impl;

import edu.nf.containerfactory.Bean;
import edu.nf.item.Pad;

/**
 * @author wangl
 * @date 2020/11/17
 */
@Bean("applePad")
public class ApplePad extends Pad {

    @Override
    public void read() {
        System.out.println("使用苹果平板阅读");
    }

    @Override
    public void play() {
        System.out.println("使用苹果平板游戏玩");
    }
}
