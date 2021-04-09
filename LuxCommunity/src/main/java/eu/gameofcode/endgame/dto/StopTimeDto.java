package eu.gameofcode.endgame.dto;

import eu.gameofcode.endgame.model.StopTime;

import java.time.LocalTime;

public class StopTimeDto {
    private LocalTime arrivalTime;
    private LocalTime departureTime;
    private String tripHeadSign;
    private String routName;

    public StopTimeDto() {
    }

    public StopTimeDto(StopTime stopTime) {
        this.arrivalTime = stopTime.getArrivalTime();
        this.departureTime = stopTime.getDepartureTime();
        this.tripHeadSign = stopTime.getTripHeadSign();
        this.routName = stopTime.getRoutName();
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getTripHeadSign() {
        return tripHeadSign;
    }

    public void setTripHeadSign(String tripHeadSign) {
        this.tripHeadSign = tripHeadSign;
    }

    public String getRoutName() {
        return routName;
    }

    public void setRoutName(String routName) {
        this.routName = routName;
    }
}
