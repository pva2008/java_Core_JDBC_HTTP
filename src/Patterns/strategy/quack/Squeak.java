package Patterns.strategy.quack;

import Patterns.strategy.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak!");
    }
}