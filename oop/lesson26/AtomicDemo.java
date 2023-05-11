package com.vpdev.oop.lesson26;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    public static void main(String[] args) {
//        int value = 5;
        AtomicInteger atomicInteger = new AtomicInteger();
        int value = atomicInteger.incrementAndGet();
        System.out.println(value);
        // Unsafe unsafe = Unsafe.getUnsafe();
        //unsafe.

        int newValue = atomicInteger.addAndGet(20);
        System.out.println(newValue);
    }
}
