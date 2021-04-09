package eu.gameofcode.endgame.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trip {

    @Id
    private String tripId;
    @ManyToOne
    private Route route;
    private String tripHeadSigh;
    private String routeName;
    @ManyToOne
    private Calendar calendar;

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getTripHeadSigh() {
        return tripHeadSigh;
    }

    public void setTripHeadSigh(String tripHeadSigh) {
        this.tripHeadSigh = tripHeadSigh;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
