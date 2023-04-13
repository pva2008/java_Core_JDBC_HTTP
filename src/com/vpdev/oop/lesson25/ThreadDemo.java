package com.vpdev.oop.lesson25;

import java.sql.SQLOutput;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
//        SimpleThread simpleThread = new SimpleThread();
//        simpleThread.start();
//        try {
//            simpleThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(Thread.currentThread().getName());

        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();
        simpleThread.join();
        System.out.println(Thread.currentThread().getName());
        // simpleThread.run();
    }
}