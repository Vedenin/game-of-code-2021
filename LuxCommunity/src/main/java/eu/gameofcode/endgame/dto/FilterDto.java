package eu.gameofcode.endgame.dto;

public class FilterDto {

    private boolean family;
    private boolean sport;
    private boolean cinema;
    private boolean kids;
    private boolean exhibition;
    private boolean culture;

    public FilterDto() {
        this.family = true;
        this.sport = true;
        this.cinema = true;
        this.kids = true;
        this.exhibition = true;
        this.culture = true;
    }

    public boolean isFamily() {
        return family;
    }

    public void setFamily(boolean family) {
        this.family = family;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public boolean isCinema() {
        return cinema;
    }

    public void setCinema(boolean cinema) {
        this.cinema = cinema;
    }

    public boolean isKids() {
        return kids;
    }

    public void setKids(boolean kids) {
        this.kids = kids;
    }

    public boolean isExhibition() {
        return exhibition;
    }

    public void setExhibition(boolean exhibition) {
        this.exhibition = exhibition;
    }

    public boolean isCulture() {
        return culture;
    }

    public void setCulture(boolean culture) {
        this.culture = culture;
    }
}
