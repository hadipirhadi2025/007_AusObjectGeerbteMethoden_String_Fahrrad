package de.bikes.daten.pojos;

import java.time.LocalDate;

/**
 * <pre>
 *     Erstellt ein Template und einen Datentyp.
 *
 *     Objektbeschreibung:Ein rotes Damenrad, mit Größe 29, und hergestellt am 11.11.2011
 *     Ein Fahrrad hat: Typ, Farbe, Größe, Herstellungsdatum
 *     EinFahrrad kann: ... nichts
 *
 *     Plain Old Java Object: POJO
 *     Repräsentiert einen Datensatz in einer Datenbanktabelle: Value Objects
 *     Klasse ist vergleichbar mit einer Datenbanktabelle: Entity
 *     Mit Objekten dieser Klasse können Daten von einem Vereich der Anwendung in einen anderen "transportieret"
 *     werden. Data Transfer Objects: DTO
 * </pre>
 */
public class Fahrrad {
    /** zb Damenrad*/
    private String typ;
    /** rot, silber, himmelblau */
    private String farbe;
    /** Willkürliche Einheit */
    private int groesse;
    /** Herstellungsdatum */
    private LocalDate datumDerHerstellung;
    /** Erstellt ein Beispielobjekt : Dummy*/
    public Fahrrad(){
        typ = "Dammyfahrrad";
        farbe = "rot";
        groesse = 17;
        datumDerHerstellung = LocalDate.of(2025, 5, 31);
    }

    /**
     * Fahrrad eins = new Fahrrad();
     * Fahrrad zwei = new Fahrrad("Damenfahrrad", "rot", 17, LocalDate.of(2025,1,1));
     *
     * @param typ
     * @param farbe
     * @param groesse
     * @param datumDerHerstellung
     */
    public Fahrrad(String typ, String farbe, int groesse, LocalDate datumDerHerstellung) {
        this.typ = typ;
        this.farbe = farbe;
        this.groesse = groesse;
        this.datumDerHerstellung = datumDerHerstellung;
    }

    public String getTyp() {
        return typ;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getGroesse() {
        return groesse;
    }

    public LocalDate getDatumDerHerstellung() {
        return datumDerHerstellung;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Fahrrad{" +
                "typ='" + typ + '\'' +
                ", farbe='" + farbe + '\'' +
                ", groesse=" + groesse +
                ", datumDerHerstellung=" + datumDerHerstellung +
                '}';
    }
}
