package com.vpdev.oop.lesson20.exeption;

/**
 * 5. Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить своё собственное, указав в качестве причины отловленное.
 */
public class Task5 {

    public static void main(String[] args) {
        try {
            catchCustomException();
        } catch (VpdevException exception) {
            System.err.println("catched in main");
            exception.printStackTrace();
        }
    }

    public static void catchCustomException() {
        try {
            unsafe();
        } catch (RuntimeException exception) {
            System.err.println("Catch int catchCustomException method");
            throw new VpdevException(exception);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("Ooops");
    }
}