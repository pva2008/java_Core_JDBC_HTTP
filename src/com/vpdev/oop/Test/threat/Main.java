package com.vpdev.oop.Test.threat;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Kassa> queue = new ArrayDeque<>(List.of(new Kassa(1), new Kassa(2)));
        Thread thread1 = new Thread(new PokupatelRun(queue), " Thread 1");
        Thread thread2 = new Thread(new PokupatelRun(queue), " Thread 2");
        Thread thread3 = new Thread(new PokupatelRun(queue), " Thread 3");
        Thread thread4 = new Thread(new PokupatelRun(queue), " Thread 4");
        Thread thread5 = new Thread(new PokupatelRun(queue), " Thread 5");
        Thread thread6 = new Thread(new PokupatelRun(queue), " Thread 6");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();


        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
