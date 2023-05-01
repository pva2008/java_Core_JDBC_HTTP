package com.vpdev.oop.lesson20.exeption;

/**
 * 1. Объявите переменную со значением null. Вызовите метод у этой
 * переменной. Отловите возникшее исключение.
 */
public class Task1 {

    public static void main(String[] args) {
        String value = null;
        try {
            methodNull(value);
            System.err.println("methodNull end");

        } catch (NullPointerException exception) {
            System.err.println("Catch");
            exception.printStackTrace();
        }

        System.err.println("Main end");
    }

    private static void methodNull(String value) {
        try {
            value.length();
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
        System.err.println(" method1 end");
    }
}