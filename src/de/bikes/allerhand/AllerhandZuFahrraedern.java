package de.bikes.allerhand;

import de.bikes.daten.pojos.Fahrrad;

/**
 * <pre>
 *     Versuche mit Fahrrad-Objekten
 *
 *     Objektvergleich
 *         == Operator
 *         == Operator vergleich den Inhalt von zwei
 * </pre>
 */
public class AllerhandZuFahrraedern {
    public static void main(String[] args) {
        Fahrrad erstesRad = new Fahrrad();
        Fahrrad zweitesRad = new Fahrrad();
        Fahrrad pumucklRad = erstesRad;

        System.out.println(erstesRad);
        System.out.println(zweitesRad);
        System.out.println(pumucklRad);

        boolean vergleich = erstesRad==zweitesRad;
        System.out.println("erstesRad==ZweiesRad: " + vergleich);//false

        vergleich = pumucklRad == erstesRad;
        System.out.println("pumucklRad == erstesRad: " + vergleich);

        pumucklRad.setFarbe("Meerschaum Grün");
        System.out.println(erstesRad);

        int groesseVonFahrradEins = erstesRad.getGroesse();
        zweitesRad = null;
        //Jetzt ist der Speicherbreich der in Zeil 18 allokieret wurde, wird jetzt nicht
        //mehr eferenziert: Dieser Bereich ist frei für den Garbage Collector
        //der Garbage Collector gibt nicht mehr benutzen speicher frei, damit er von anderen objecten

    }

}
