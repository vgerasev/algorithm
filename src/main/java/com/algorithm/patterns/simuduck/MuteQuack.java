package com.algorithm.patterns.simuduck;

import com.algorithm.patterns.contstants.Constants;

public class MuteQuack implements QuackBehavior {
    @Override
    public String quack() {
        System.out.println(Constants.QUACK_MUTE);
        return Constants.QUACK_MUTE;
    }
}
