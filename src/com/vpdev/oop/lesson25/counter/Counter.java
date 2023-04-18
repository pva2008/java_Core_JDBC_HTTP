package com.vpdev.oop.lesson25.counter;


import lombok.Data;

/**
 * 1. Создать класс Counter с одним полем:
 * private int count;
 * <p>
 * Добавить методы:
 * - getCount() - для получение поля count
 * - increment() - для увеличения значения поля на единицу
 * - decrement() - для уменьшения значения поля на единицу
 */

public class Counter {

    private int count;

    public void increment() {
        synchronized (this) {
            count++;
        }

    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}