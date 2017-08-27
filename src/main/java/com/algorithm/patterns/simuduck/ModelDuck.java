package com.algorithm.patterns.simuduck;

import com.algorithm.patterns.contstants.Constants;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        System.out.println(Constants.MODEL_DISPLAY);
        return Constants.MODEL_DISPLAY;
    }
}
