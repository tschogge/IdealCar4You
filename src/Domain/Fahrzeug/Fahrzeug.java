package Domain.Fahrzeug;

import java.time.LocalDate;

public abstract class Fahrzeug {
    private String marke;
    private String model;
    private int hubraum;
    private int treibstoffartID;
    private int aktuellerKMStand;
    private int ps;
    private LocalDate erstzulassung;
    private String color;
    private int leergewicht;
    private final String[] treibstoffart = {"Benzin", "Diesel", "Elektrisch"};

    protected Fahrzeug(String marke, String model, int hubraum, int treibstoffartID, int aktuellerKMStand, int ps, LocalDate erstzulassung, String color, int leergewicht) {
        this.marke = marke;
        this.model = model;
        this.hubraum = hubraum;
        this.treibstoffartID = treibstoffartID;
        this.aktuellerKMStand = aktuellerKMStand;
        this.ps = ps;
        this.erstzulassung = erstzulassung;
        this.color = color;
        this.leergewicht = leergewicht;
    }

    protected Fahrzeug() {
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    public int getTreibstoffartID() {
        return treibstoffartID;
    }

    public void setTreibstoffartID(int treibstoffartID) {
        this.treibstoffartID = treibstoffartID;
    }

    public int getAktuellerKMStand() {
        return aktuellerKMStand;
    }

    public void setAktuellerKMStand(int aktuellerKMStand) {
        this.aktuellerKMStand = aktuellerKMStand;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public LocalDate getErstzulassung() {
        return erstzulassung;
    }

    public void setErstzulassung(LocalDate erstzulassung) {
        this.erstzulassung = erstzulassung;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLeergewicht() {
        return leergewicht;
    }

    public void setLeergewicht(int leergewicht) {
        this.leergewicht = leergewicht;
    }

    public String[] getTreibstoffart() {
        return treibstoffart;
    }
}