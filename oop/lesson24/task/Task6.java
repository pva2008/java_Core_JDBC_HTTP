package com.vpdev.oop.lesson24.task;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 5. Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
 * секунд между полуночью первой даты и полуночью второй даты.
 */
public class Task6 {

    public static void main(String[] args) {
//        LocalDate now = LocalDate.now();
//        LocalDate prevDate = LocalDate.of(2018, 7, 7);
//
////        LocalDateTime.of(now, LocalTime.MIDNIGHT);
//        LocalDateTime localDateTimeNow = now.atStartOfDay();
//        LocalDateTime localDateTimePrev = prevDate.atStartOfDay();
//
//        Duration duration = Duration.between(localDateTimePrev, localDateTimeNow);
//        System.out.println(duration.getSeconds());

        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);
        System.out.println(now.atStartOfDay());
        System.out.println(Duration.between(prevDate.atStartOfDay(), now.atStartOfDay()).getSeconds());


    }
}
