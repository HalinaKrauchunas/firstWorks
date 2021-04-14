package com.epam.projects.first;

import com.epam.projects.*;

import java.time.*;

import static java.util.concurrent.TimeUnit.*;

public class TimeFormat {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader(System.in);
        long seconds = ParseNumber.getLong(reader);
        try {
            System.out.println(LocalTime.ofSecondOfDay(seconds));
        } catch (DateTimeException e) {
            long days = SECONDS.toDays(seconds);
            long newSeconds = seconds - DAYS.toSeconds(days);
            System.out.println(days + " days passed! Look at the time!\n" + LocalTime.ofSecondOfDay(newSeconds));
        }
    }
}