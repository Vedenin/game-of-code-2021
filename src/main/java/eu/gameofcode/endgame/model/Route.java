package eu.gameofcode.endgame.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Route {

    @Id
    private String id;
    private String shortName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
