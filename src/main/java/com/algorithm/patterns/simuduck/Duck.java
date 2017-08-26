package com.algorithm.patterns.simuduck;

import com.algorithm.patterns.contstants.Constants;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract String display();

    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    public String swim() {
        System.out.println(Constants.SWIM);
        return Constants.SWIM;
    }
}
