package com.algorithm.tests.patterns.simuduck;

import com.algorithm.patterns.contstants.Constants;
import com.algorithm.patterns.simuduck.Duck;
import com.algorithm.patterns.simuduck.FlyRocketPowered;
import com.algorithm.patterns.simuduck.MallardDuck;
import com.algorithm.patterns.simuduck.ModelDuck;
import org.junit.Assert;
import org.junit.Test;

public class DuckTest {
    @Test
    public void mallardOneTest() {
        Duck mallard = new MallardDuck();
        Assert.assertTrue(mallard.display().contains(Constants.MALLARD_DISPLAY));
        Assert.assertTrue(mallard.performFly().contains(Constants.FLY_WING));
        Assert.assertTrue(mallard.performQuack().contains(Constants.QUACK));
        Assert.assertTrue(mallard.swim().contains(Constants.SWIM));
    }

    @Test
    public void modelDuckOneTest() {
        Duck model = new ModelDuck();
        Assert.assertTrue(model.display().contains(Constants.MODEL_DISPLAY));
        Assert.assertTrue(model.performFly().contains(Constants.FLY_NO_WAY));
        Assert.assertTrue(model.performQuack().contains(Constants.QUACK));
        Assert.assertTrue(model.swim().contains(Constants.SWIM));

        model.setFlyBehavior(new FlyRocketPowered());
        Assert.assertTrue(model.performFly().contains(Constants.FLY_ROCKET));
    }
}
