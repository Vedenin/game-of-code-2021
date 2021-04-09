package eu.gameofcode.endgame.dto;

import eu.gameofcode.endgame.model.Stop;

public class StopDto {

    private String id;
    private String name;
    private String lat;
    private String lon;

    public StopDto() {

    }

    public StopDto(Stop stop) {
        this.id = stop.getId();
        this.name = stop.getName();
        this.lat = stop.getLat();
        this.lon = stop.getLon();
    }

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
}
