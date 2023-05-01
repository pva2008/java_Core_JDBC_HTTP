package com.vpdev.oop.test.head_first.polimorfizm;

public class Mixed {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        b.m1();
        c.m2();
        a.m3();
        System.out.println();

        c.m1();
        c.m2();
        c.m3();
        System.out.println();

        a.m1();
        b.m2();
        c.m3();
        System.out.println();
        a2.m1();
        a2.m2();
        a2.m3();


    }
}

class A {
    int ivar = 7;

    void m1() {
        System.out.println("A`s m1, ");
    }

    void m2() {
        System.out.println("A`s m2, ");
    }

    void m3() {
        System.out.println("A`s m3, ");
    }
}

class B extends A {
    int ivar = 7;

    void m1() {
        System.out.println("B`s m1, ");
    }
}

class C extends B {
    int ivar = 7;

    void m3() {
        System.out.println("C`s m3, " + (ivar + 6));
    }
}
