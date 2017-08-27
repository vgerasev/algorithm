package com.algorithm.patterns.simuduck;

import com.algorithm.patterns.contstants.Constants;

public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        System.out.println(Constants.QUACK);
        return Constants.QUACK;
    }
}
