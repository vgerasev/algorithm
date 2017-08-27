package com.algorithm.patterns.simuduck;

import com.algorithm.patterns.contstants.Constants;

public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        System.out.println(Constants.FLY_NO_WAY);
        return Constants.FLY_NO_WAY;
    }
}
