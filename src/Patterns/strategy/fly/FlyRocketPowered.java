package Patterns.strategy.fly;

import Patterns.strategy.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}