package com.vpdev.oop.test;


import java.util.*;

public class ComparableAndComparatorAndBinarySearchTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, new Ink("Black"), new Paper("White")));
        books.add(new Book(3, new Ink("Green"), new Paper("AYellow")));
        books.add(new Book(2, new Ink("Blue"), new Paper("CMaroon")));
        books.add(new Book(5, new Ink("Green"), new Paper("BRed")));

        Map<Integer, Book> booksMap = new TreeMap<>(Comparator.naturalOrder());

        for (Book book : books) {
            System.out.println(book);
        }

        Collections.sort(books);

        System.out.println("_____________________________________________");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("_____________________________________________");

        Collections.sort(books, ((Book a, Book b) -> {

            return a.getPaper().getColor().compareTo(b.getPaper().getColor());
        }));


        System.out.println();
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("Binary search = "
                + Collections.binarySearch(books, new Book(2, new Ink("Blue"), new Paper("CMaroon")),

                ((Book a, Book b) -> {

                    return a.getPaper().getColor().compareTo(b.getPaper().getColor());
                })));


    }
}

class Book implements Comparable<Book> {
    int id;
    private Ink ink;
    private Paper paper;


    public Book(int id, Ink ink, Paper paper) {
        this.ink = ink;
        this.paper = paper;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    @Override
    public int compareTo(Book toCompare) {
        return this.id - toCompare.id;

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", ink=" + ink.getColor() +
                ", paper=" + paper.getColor() +
                '}';
    }
}


class Ink {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ink(String color) {
        this.color = color;
    }
}

class Paper {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Paper(String color) {
        this.color = color;
    }
}

