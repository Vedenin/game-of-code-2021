package eu.gameofcode.endgame.dto;

public class NewsDto {

    private String lon;
    private String lat;
    private String name;
    private String address;
    private String url;

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

    public NewsDto() {
    }

    public NewsDto(String lon, String lat, String name, String address, String url) {
        this.lon = lon;
        this.lat = lat;
        this.name = name;
        this.address = address;
        this.url = url;
    }
}
