package com.vpdev.oop.lesson24;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {

    public static void main(String[] args) {
        Object o;

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now.toInstant());

//        long toEpochMilli = now.toInstant().toEpochMilli();
//        System.out.println(toEpochMilli);
//
        ZonedDateTime plus = now.plus(1L, ChronoUnit.MONTHS);
        System.out.println(plus.toInstant());
//
        ZonedDateTime zonedDateTime = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(zonedDateTime);
//
//        LocalDateTime localDateTime = LocalDateTime.now(ZoneOffset.UTC);
//        System.out.println(localDateTime);
//
//        LocalTime now1 = LocalTime.now();
//        System.out.println(now1);
    }
}
