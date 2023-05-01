package com.vpdev.oop.test;

import java.util.HashMap;
import java.util.Objects;

public class MapTest {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student(12, "Valera", 5.7), "Value");
        map.put(new Student(13, "Valera", 5.7), "Value");
        map.put(new Student(12, "Valera", 5.8), "Value");
        //System.out.println(map);
//        for (Map.Entry<Student, String> studentStringEntry : map.entrySet()) {
//            System.out.println(studentStringEntry.getKey()+" "+studentStringEntry.getValue());
//            System.out.println(studentStringEntry);
//
//        }


        ;

    }
}

class Student {
    int id;
    String name;
    double avg;

    public Student(int id, String name, double avg) {
        this.id = id;
        this.name = name;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.avg, avg) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, avg);
    }
}
