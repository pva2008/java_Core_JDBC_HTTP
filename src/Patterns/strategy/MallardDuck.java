package Patterns.strategy;

import Patterns.strategy.fly.FlyWithWings;
import Patterns.strategy.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real mallard duck!");
    }
}