package com.algorithm.patterns.simuduck;

import com.algorithm.patterns.contstants.*;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        System.out.println(Constants.MALLARD_DISPLAY);
        return Constants.MALLARD_DISPLAY;
    }
}
