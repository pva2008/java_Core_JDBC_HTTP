package Patterns.strategy.quack;

import Patterns.strategy.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}