package com.algorithm.patterns.simuduck;

import com.algorithm.patterns.contstants.Constants;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public String fly() {
        System.out.println(Constants.FLY_ROCKET);
        return Constants.FLY_ROCKET;
    }
}
