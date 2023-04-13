package Patterns.strategy.quack;

import Patterns.strategy.quack.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!");
    }
}