package com.vpdev.oop.lesson21.task;

private class Person {

    private String firstName;
    private String lastName;
    private int age;

    private Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private String getFullName() {
        return firstName + " " + lastName;
    }

    private String getFirstName() {
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private int getAge() {
        return age;
    }

    @Override
    private String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}