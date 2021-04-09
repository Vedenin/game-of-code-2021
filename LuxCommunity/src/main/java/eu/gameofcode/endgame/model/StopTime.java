package eu.gameofcode.endgame.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalTime;

@Entity
public class StopTime {

    @Id
    @GeneratedValue
    private int id;
    private LocalTime arrivalTime;
    private LocalTime departureTime;
    private String tripHeadSign;
    private String routName;
    @ManyToOne
    private Stop stop;
    @ManyToOne
    private Calendar calendar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Stop getStop() {
        return stop;
    }

    public void setStop(Stop stop) {
        this.stop = stop;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
