package com.algorithm.patterns.simuduck;

import com.algorithm.patterns.contstants.Constants;

public class FlyWithWings implements FlyBehavior {
    @Override
    public String fly() {
        System.out.println(Constants.FLY_WING);
        return Constants.FLY_WING;
    }
}
