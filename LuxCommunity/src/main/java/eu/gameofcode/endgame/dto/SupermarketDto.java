package eu.gameofcode.endgame.dto;

public class SupermarketDto {
    private static Integer globalId = 0;

    private Integer id;
    private String latitude;
    private String longitude;
    private String name;

    public static SupermarketDto create(String name, String latitude, String longitude)  {
        SupermarketDto dto = new SupermarketDto();
        globalId = globalId + 1;
        dto.setId(globalId);
        dto.setLatitude(latitude);
        dto.setLongitude(longitude);
        dto.setName(name);
        return dto;
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
}
