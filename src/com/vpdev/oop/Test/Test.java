package com.vpdev.oop.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            int a = it.next();

            System.out.println(a);
            break;
        }

    }
}
