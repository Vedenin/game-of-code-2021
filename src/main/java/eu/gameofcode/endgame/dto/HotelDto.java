package eu.gameofcode.endgame.dto;

public class HotelDto {

    private String lon;
    private String lat;
    private String name;
    private String address;
    private String url;
    private boolean isForDisablePeople;

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isForDisablePeople() {
        return isForDisablePeople;
    }

    public void setForDisablePeople(boolean forDisablePeople) {
        isForDisablePeople = forDisablePeople;
    }
}
