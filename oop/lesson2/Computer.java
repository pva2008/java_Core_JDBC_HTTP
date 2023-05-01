package com.vpdev.oop.lesson2;

public class Computer {

    private int ssd = 500;
    private long ram;

    protected Computer(int newSsd) {
        ssd = newSsd;
        ram = 999;
    }

    public Computer(int ssd, long newRam) {
        this.ssd = ssd;
        ram = newRam;
    }

    public Computer() {
        System.out.println("Я был создан");
    }

    void load() {
        System.out.println("Я загрузился");
    }

    void load(boolean open) {
        System.out.println("Я загрузился");
        if (open) {
            System.out.println("Я открыл крышку");
        }
    }

    //  [модификаторы] returnValue name([params])
    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
        System.out.println();
    }
}