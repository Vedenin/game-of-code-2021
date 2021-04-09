package eu.gameofcode.endgame.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Stop {

    @Id
    private String id;
    private String name;
    private String lat;
    private String lon;

    @OneToMany(
            mappedBy = "stop",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @OrderBy("arrivalTime")
    private List<StopTime> stopTimes = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public List<StopTime> getStopTimes() {
        return stopTimes;
    }

    public void setStopTimes(List<StopTime> stopTimes) {
        this.stopTimes = stopTimes;
    }
}
