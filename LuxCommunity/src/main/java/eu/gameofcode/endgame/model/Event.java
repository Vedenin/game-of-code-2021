package eu.gameofcode.endgame.model;

public class Event {

    private Integer id;
    private String latitude;
    private String longitude;
    private String name;
    private String category;
    private String description;
    private long eventTime;
    private int participantMinAge;
    private boolean isOnline;
    private double price;
    private String urlEvent;

    public Event() {
    }

    public Event(Integer id, String latitude, String longitude, String name, String category, String description) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public Event(Integer id, String latitude, String longitude, String name, String category, String description, double price) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public Event(Integer id, String latitude, String longitude, String name, String category, String description, long eventTime, double price) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.category = category;
        this.description = description;
        this.eventTime = eventTime;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getEventTime() {
        return eventTime;
    }

    public void setEventTime(long eventTime) {
        this.eventTime = eventTime;
    }

    public int getParticipantMinAge() {
        return participantMinAge;
    }

    public void setParticipantMinAge(int participantMinAge) {
        this.participantMinAge = participantMinAge;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrlEvent() {
        return urlEvent;
    }

    public void setUrlEvent(String urlEvent) {
        this.urlEvent = urlEvent;
    }
}
