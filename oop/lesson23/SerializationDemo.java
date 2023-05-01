package com.vpdev.oop.lesson23;

import java.io.*;
import java.nio.file.Path;

public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Path path = Path.of("resources", "student.out");
//        writeObject(path);
//        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
//            Object object = objectInputStream.readObject();
//            System.out.println(object);
//        }
//    }
//
//    private static void writeObject(Path path) throws IOException {
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
//            Person sergey = new Person(26, "Sergey");
//            objectOutputStream.writeObject(sergey);
//        }

        Path path = Path.of("resources", "student.out");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person person = new Person(12, "Vika");
            objectOutputStream.writeObject(person);
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object object = objectInputStream.readObject();
            System.out.println(object);
        }


    }
}