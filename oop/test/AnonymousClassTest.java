package com.vpdev.oop.test;

public class AnonymousClassTest {
    private int c;

    public static void main(String[] args) {
        IMath m1 = new IMath() {
            @Override
            public int doOperation(int a, int b) {
                AnonymousClassTest anonymousClassTest = new AnonymousClassTest();
                anonymousClassTest.c = 3;
                return a + b + 3;
            }
        };
        System.out.println(m1.doOperation(2, 3));

        IMath m2 = new IMath() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m2.doOperation(2, 3));


    }
}

interface IMath {
    int doOperation(int a, int b);
}
