package eu.gameofcode.endgame.dto;

public class SupermarketsFilterDto {

    private String keyword;
    private boolean lidl;
    private boolean auchan;
    private boolean aldi;
    private boolean cactus;
    private boolean delhaize;
    private boolean colruyt;
    private boolean monop;
    private boolean alima;
    private boolean smatch;


    public SupermarketsFilterDto() {
        this.lidl = true;
        this.auchan = true;
        this.aldi = true;
        this.cactus = true;
        this.delhaize = true;
        this.colruyt = true;
        this.monop = true;
        this.alima = true;
        this.smatch = true;
        this.keyword = "";
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public boolean isLidl() {
        return lidl;
    }

    public void setLidl(boolean lidl) {
        this.lidl = lidl;
    }

    public boolean isAuchan() {
        return auchan;
    }

    public void setAuchan(boolean auchan) {
        this.auchan = auchan;
    }

    public boolean isAldi() {
        return aldi;
    }

    public void setAldi(boolean aldi) {
        this.aldi = aldi;
    }

    public boolean isCactus() {
        return cactus;
    }

    public void setCactus(boolean cactus) {
        this.cactus = cactus;
    }

    public boolean isDelhaize() {
        return delhaize;
    }

    public void setDelhaize(boolean delhaize) {
        this.delhaize = delhaize;
    }

    public boolean isColruyt() {
        return colruyt;
    }

    public void setColruyt(boolean colruyt) {
        this.colruyt = colruyt;
    }

    public boolean isMonop() {
        return monop;
    }

    public void setMonop(boolean monop) {
        this.monop = monop;
    }

    public boolean isAlima() {
        return alima;
    }

    public void setAlima(boolean alima) {
        this.alima = alima;
    }

    public boolean isSmatch() {
        return smatch;
    }

    public void setSmatch(boolean smatch) {
        this.smatch = smatch;
    }
}
