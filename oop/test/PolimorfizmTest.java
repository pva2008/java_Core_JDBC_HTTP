package com.vpdev.oop.test;

public abstract class PolimorfizmTest {
    public static void methodTest(Animal... animals) {
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                ((Cat) animal).methodMiay();
            }
            if (animal instanceof Dog) {
                animal.methodAnimal();
                ((Dog) animal).methodAnimal();

            }

        }


    }

    public static void main(String[] args) {
        methodTest(new Dog(2, 4));

    }

}

class Animal {
    private int a;
    private int b;

    void methodAnimal() {
        System.out.println("methodAnimal");
    }

    Animal(int a, int b) {
        this.a = a;
        this.b = b;
    }

}

class Cat extends Animal {
    int c;
    int d;
    int e;

    public Cat(int e) {
        this(2, 4);
        this.e = e;
    }

    Cat(int a, int b) {
        super(a, b);
    }

    @Override
    void methodAnimal() {
        System.out.println("methodCat");
    }

    void methodMiay() {
        System.out.println("Miay");
    }
}

class Dog extends Animal {

    Dog(int a, int b) {
        super(a, b);
    }

    @Override
    void methodAnimal() {
        System.out.println("methodDog");
    }
}
