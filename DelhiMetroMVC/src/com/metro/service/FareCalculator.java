package com.metro.service;
import java.time.LocalDateTime;

import com.metro.DTO.Station;
import com.metro.fare.FareStrategy;
import com.metro.fare.FareStrategyFactory;

public class FareCalculator {
    public double getFare(Station source, Station destination, LocalDateTime localDateTime) {
        FareStrategy fareStrategy = FareStrategyFactory.getFareStrategy(localDateTime);
        int distance = source.distance(destination);
        double fare = distance * fareStrategy.getFarePerStation();
        return fare;
    }
}