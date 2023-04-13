package Patterns.strategy.fly;

import Patterns.strategy.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}