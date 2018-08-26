package com.metro.fare;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class FareStrategyFactory {
    static final FareStrategy weekendStrategy = new WeekendFareStrategy();
    static final FareStrategy weekdayStrategy = new WeekdayFareStrategy();
    public static FareStrategy getFareStrategy(LocalDateTime localDateTime) {
        if (localDateTime.getDayOfWeek() == DayOfWeek.SATURDAY || localDateTime.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return weekendStrategy;
        } else {
            return weekdayStrategy;
        }
    }
}