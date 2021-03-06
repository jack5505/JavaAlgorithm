package com.company.dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Set;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Learn {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate payday = today.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2);
        System.out.println(today);
        System.out.println(payday);


        LocalDateTime todayWithTime = LocalDateTime.now();
        LocalDateTime time1 = todayWithTime.plusDays(30);
        System.out.println(time1);
        LocalDateTime time = todayWithTime.with(TemporalAdjusters.lastDayOfMonth()).plusDays(1);
        System.out.println(time);

        //Immutable
        //Most of the classes in the Date-Time API create objects that are immutable, meaning that, after the object is created, it cannot be modified. To alter the value of an immutable object, a new object must be constructed as a modified copy of the original. This also means that the Date-Time API is, by definition, thread-safe. This affects the API in that most of the methods used to create date or time objects are prefixed with of,
        // from, or with, rather than constructors, and there are no set methods. For example:

        LocalDate dateOfBirth = LocalDate.of(2012, Month.MAY, 14);
        LocalDate firstBirthday = dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth +" " + firstBirthday);

        Month month = Month.SEPTEMBER;
        System.out.println(month.getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println(DayOfWeek.MONDAY.getDisplayName(TextStyle.FULL,Locale.getDefault()));

        // how to find what kind of day of month  you were born ))
        DayOfWeek dayOfWeek = LocalDate.of(1961,Month.JANUARY,28).getDayOfWeek();
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL,Locale.getDefault()));

        // The Year class represents a year. The following example uses the Year.isLeap method to determine if the given year is a leap year. The call returns true, confirming that 2012 is a leap year.

        boolean validLeapYear = Year.of(2012).isLeap();

        System.out.println(validLeapYear);

        Set<String> allZones = ZoneId.getAvailableZoneIds();

        allZones.forEach(System.out::println);

    }
}
