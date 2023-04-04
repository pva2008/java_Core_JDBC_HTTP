package com.vpdev.oop.Test;

public class inheritanceTest {
    public static void main(String[] args) {
        IDoMetod<Integer> v = new ParrentClass<>();
        System.out.println(v.method1(1));

    }
}

class ParrentClass<T extends Number> implements IDoMetod<T> {
    public Double method2() {
        Double d = 2.0;
        return d;
    }

    @Override
    public T method1(T element) {
        return (T) (Integer) (element.intValue() + element.intValue());
    }
}

class ChildClass extends ParrentClass {


}

interface IDoMetod<T extends Number> {
    T method1(T t);
}