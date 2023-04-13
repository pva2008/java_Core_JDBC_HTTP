package com.vpdev.oop.lesson24.task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 5. Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Создать объект LocalDate, представляющий собой дату
 * 07.07.2018. Используя созданные объекты, найти количество дней между
 * этими двумя датами.
 */
public class Task5 {

    public static void main(String[] args) {
//        LocalDate now = LocalDate.now();
//        LocalDate prevDate = LocalDate.of(2018, 7, 7);
//
//        Period period = Period.between(prevDate, now);
//        System.out.println(period.getYears());
//        System.out.println(period.getMonths());
//        System.out.println(period.getDays());
//
//        long days = ChronoUnit.DAYS.between(prevDate, now);
//        System.out.println(days);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime prevDate = LocalDateTime.of(2018, 7, 7, 20, 1);
        Period period = Period.between(prevDate.toLocalDate(), now.toLocalDate());
        System.out.println(period.getYears());

        long days = ChronoUnit.HOURS.between(prevDate, now);
        System.out.println(days);


    }
}