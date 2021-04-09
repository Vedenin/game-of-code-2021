package eu.gameofcode.endgame.controllers.entiry;


public class MetricsData {
    double Latitude;
    double Longitude;
    String id;
    String name;
    String description;
    String address;

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MetricsData(double latitude, double longitude, String id, String name, String description, String address) {
        Latitude = latitude;
        Longitude = longitude;
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
    }
}
