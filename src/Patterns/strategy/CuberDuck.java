package Patterns.strategy;

import Patterns.strategy.fly.FlyRocketPowered;
import Patterns.strategy.quack.MuteQuack;
import Patterns.strategy.quack.Squeak;

public class CuberDuck extends Duck {
    public CuberDuck() {
        setFlyBehavior(new FlyRocketPowered());
        setQuackBehavior(new MuteQuack());

    }

    @Override
    public void display() {
        System.out.println("You are next!");
    }

}
