package Patterns.strategy;

import Patterns.strategy.fly.FlyNoWay;
import Patterns.strategy.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck.");
    }
}