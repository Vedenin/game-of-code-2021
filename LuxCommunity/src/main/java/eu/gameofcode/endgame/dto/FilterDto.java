package eu.gameofcode.endgame.dto;

public class FilterDto {

    private String keyword;
    private boolean family;
    private boolean sport;
    private boolean cinema;
    private boolean kids;
    private boolean exhibition;
    private boolean culture;
    private boolean free;
    private boolean paid;

    public FilterDto() {
        this.family = true;
        this.sport = true;
        this.cinema = true;
        this.kids = true;
        this.exhibition = true;
        this.culture = true;
        this.free = true;
        this.paid = true;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
