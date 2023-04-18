package com.vpdev.oop.Test.threat;

public class Kassa {
    @Override
    public String toString() {
        return "Kassa{" +
                "number=" + number +
                '}';
    }

    private int number;

    public Kassa(int number) {
        this.number = number;
    }
}
