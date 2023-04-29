package com.vpdev.oop.test.threat;

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
