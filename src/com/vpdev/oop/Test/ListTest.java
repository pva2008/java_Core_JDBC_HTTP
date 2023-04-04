package com.vpdev.oop.Test;

import java.util.*;

public class ListTest {


    public static void main(String[] args) {

//Array List------------------------------------------------------------------------------------------
//        ArrayList<String> arrayList = new ArrayList<>(500);
//        arrayList.add("KESHA");
//        arrayList.add("Sveta");
//        arrayList.add("Dina");
//        arrayList.add("Gosha");
//        arrayList.
//        System.out.println(arrayList.toString());
//-----------------------------------------------------------------------------------------------------

//        ArrayList<ArrayListTest> arrayListTests = new ArrayList<>();
//        arrayListTests.add(new ArrayListTest(new Id(1),new Name("Vitali"),new Surname("Gus")));
//        ArrayListTest forCompare= new ArrayListTest(new Id(1),new Name("Vitali"),new Surname("Gus"));
//        arrayListTests.add(new ArrayListTest(new Id(1),new Name("Dima"),new Surname("Dubovik")));
//        arrayListTests.add(new ArrayListTest(new Id(1),new Name("Sveta"),new Surname("Petrova")));
//        arrayListTests.add(new ArrayListTest(new Id(1),new Name("Valera"),new Surname("Utkin")));
//        for (int i = 0; i < arrayListTests.size(); i++) {
//            System.out.println(arrayListTests.get(i));
//        }
//        arrayListTests.set(1,new ArrayListTest(new Id(0000),new Name("0000"),new Surname("0000")));
//        arrayListTests.remove(forCompare);
//        //System.out.println(arrayListTests);
//        System.out.println();
//        System.out.println(arrayListTests.indexOf(forCompare));
//        System.out.println();
//        for (int i = 0; i < arrayListTests.size(); i++) {
//            System.out.println(arrayListTests.get(i));
//        }
//        System.out.println();
//// -----------------------------------------------------------------------------------------------------
//        StringBuilder sb1 = new StringBuilder("A");
//        StringBuilder sb2 = new StringBuilder("B");
//        StringBuilder sb3 = new StringBuilder("C");
//        StringBuilder sb4 = new StringBuilder("D");
//        StringBuilder sb5 = new StringBuilder("D");
//
//        StringBuilder [] stringBuilders = {sb1,sb2,sb3,sb4};

        // List<StringBuilder> list = Arrays.asList(stringBuilders);
//        List<StringBuilder> list =new ArrayList<>();
//        list.add(sb1);
//        list.add(sb2);
//        list.add(sb3);
//        list.add(sb4);
//        Iterator<StringBuilder> iterator =list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next()+"B");
//           // iterator.remove();
//        }
//        iterator =list.iterator();
//        while (iterator.hasNext() ){
//            System.out.println(iterator.next());
//
//        }


//                System.out.println(list);
//        System.out.println(list.getClass());
//        Set<StringBuilder> set =new HashSet<>();
//        List<StringBuilder> list2 = new ArrayList<>();
//        set.add(sb5);
//        list2.add(sb5);
//        System.out.println(set);
//        System.out.println(list2);
//
//
//       list.removeAll(set);
//        System.out.println(list);


//
//        List<String> arraylist = new ArrayList<>();
//        arraylist.add("A");
//        arraylist.add("B");
//        arraylist.add("C");
//        arraylist.add("D");
//        Set<String> set = new HashSet<>(arraylist);
//        set.remove("B");
//        System.out.println(arraylist);
//        System.out.println(set);
//        System.out.println();
//        arraylist.removeAll(set);
//        System.out.println(arraylist);


//-----------------------------------------------------------------------------------------------------
// linked List+ List Iterator------------------------------------------------------------------------------------------
        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("C");
        linkedList.add("A");
        Boolean isPalindrome = true;

        ListIterator<String> listIterator = linkedList.listIterator();
        ListIterator<String> listIteratorReverse = linkedList.listIterator(linkedList.size());
        while (listIterator.hasNext() && listIteratorReverse.hasPrevious()) {
            if (listIterator.next() != listIteratorReverse.previous()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);


//        System.out.println(linkedList);
//        System.out.println(linkedList.get(0)+" \n"+ linkedList.get(linkedList.size()-1));


// -----------------------------------------------------------------------------------------------------
//        Map<String,String> m = new HashMap<>();
//        Collection<String> list = new ArrayList<>();
//        list.add("asd");
    }
}

class ArrayListTest extends Object {
    Id id;
    Name name;
    Surname surname;

    public ArrayListTest() {
    }

    public ArrayListTest(Id id, Name name, Surname surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "ArrayListTest{" +
                "id=" + id.getId() +
                ", name=" + name.getName() +
                ", surname=" + surname.getSurname() +
                '}';
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        ArrayListTest arrayListTest = (ArrayListTest) otherObject;
        return Objects.equals(id.getId(), arrayListTest.id.getId())
                && Objects.equals(name.getName(), arrayListTest.name.getName())
                && Objects.equals(surname.getSurname(), arrayListTest.surname.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id.getId(), name.getName(), surname.getSurname());
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Surname getSurname() {
        return surname;
    }

    public void setSurname(Surname surname) {
        this.surname = surname;
    }
}

class Id {
    Integer id;

    public Id(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

class Name {
    String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Surname {
    public Surname(String surname) {
        this.surname = surname;
    }

    String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
