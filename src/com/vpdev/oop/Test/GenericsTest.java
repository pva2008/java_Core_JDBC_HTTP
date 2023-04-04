package com.vpdev.oop.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Double> listd = new ArrayList<>();

        list.add("Vlad0");
        list.add("Vlad1");
        list.add("Vlad2");
        listd.add(2.0);
        listd.add(2.1);
        listd.add(2.2);
        listd.add(2.3);
        listd.add(TClassNumber.methodT(listd, 0));
        System.out.println(list);
        System.out.println(listd);

    }

}

class TClassSting<T> {
    private T element;

    public TClassSting(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public static <T extends Number> T methodT(List<T> elements, int number) {
        return elements.get(number);
    }
}

class TClassNumber<T extends Number> {
    private T element;

    public TClassNumber(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    //Ограничиваем наш Т на использование Всех extends Number и implements Comparable
    public static <T extends Number & Comparable> T methodT(List<T> elements, int number) {


        return (T) (Double) elements.get(number).doubleValue();
    }
}

class TClassTest<T extends Number> {
    public static <T extends Number> void testMethod() {

    }
}
