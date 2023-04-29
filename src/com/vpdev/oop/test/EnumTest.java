package com.vpdev.oop.test;

public class EnumTest {
    WeekDays weekDays;

    static void makeYourChoose(WeekDays weekDays) {
        switch (weekDays) {
            case MONDAY -> {
                System.out.println("BEGIN WORK");
                System.out.println(weekDays.getMood());
            }
            case TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("WORK_HARD");

            case SATURDAY, SUNDAY -> System.out.println("HOLIDAYS");
            default -> System.out.println(weekDays.getMood());
        }


    }

    public static void main(String[] args) {
        makeYourChoose(WeekDays.MONDAY);
        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.FRIDAY;
        System.out.println(w1 == w2);
        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15.getMood());

        WeekDays[] arrays = WeekDays.values();
        for (WeekDays array : arrays) {
            System.out.println(array.getMood());

        }

    }
}

enum WeekDays {
    MONDAY("MONDAY_mood_good"),
    TUESDAY("TUESDAY_mood_good"),
    WEDNESDAY("MONDAY_mood_good"),
    THURSDAY("WEDNESDAY_mood_good"),
    FRIDAY("FRIDAY_mood_good"),
    SATURDAY("SATURDAY_mood_good"),
    SUNDAY("SUNDAY_mood_good");

    //конструктор только private по этому и объект создать нельзя
    WeekDays(String mood) {
        this.mood = mood;

    }

    private String mood;

    public String getMood() {
        return mood;


    }

}
