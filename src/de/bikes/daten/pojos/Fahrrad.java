package de.bikes.daten.pojos;

import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Fahrrad fahrrad = (Fahrrad) o;
        return groesse == fahrrad.groesse && Objects.equals(typ, fahrrad.typ) && Objects.equals(farbe, fahrrad.farbe) && Objects.equals(datumDerHerstellung, fahrrad.datumDerHerstellung);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(typ);
        result = 31 * result + Objects.hashCode(farbe);
        result = 31 * result + groesse;
        result = 31 * result + Objects.hashCode(datumDerHerstellung);
        return result;
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){
//            return true;
//        }
//
//        if(obj==null){
//            return false;//TODO: exception
//        }
//
//        if(this.getClass() != obj.getClass()){
//            return false;
//        }
//
//        Fahrrad vergleichsRad = (Fahrrad) obj;
//
//        if(!vergleichsRad.getTyp().equals(typ)){
//            return false;
//        }
//
//        if(!vergleichsRad.getFarbe().equals(farbe)){
//            return false;
//        }
//
//        if(vergleichsRad.getGroesse()!=groesse){
//            return false;
//        }
//        /*
//        vergleichsRad.getDatumDerHerstellung().
//
//        Entscheidung: Welche Attribute sinf entscheidend, ob true oder false zurück geben wird
//        Hier wird das Herstellungsdatum nicht vergleichen: Um die Entscheidung zu simmulieren:
//        Herstellungsdatum ist nicht wichtig für den Vergleich
//
//        if(!vergleichsRad.getDatumDerHerstellung().equals(datumDerHerstellung)){
//            return false;
//        }
//        */
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        return groesse*typ.hashCode()*farbe.hashCode();
//    }
}
