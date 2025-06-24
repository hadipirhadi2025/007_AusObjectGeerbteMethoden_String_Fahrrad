package de.bikes.allerhand;

/**
 * <pre>
 *     Objectvergleiche: String
 *     Inhalt einer Referenzvariable: Adresse des Objekts
 *            String dasWichtisgete = "Kaffee"
 *            so kommt der "String-pool" zum Einsatz
 *            Kontrolle: Gibt es diesen String schon im String pool
 *            a) nein: Das Objekt "Kaffee" wird erstellt und in den Stringpool gespeichert:
 *                dasWichtigste: bekommt die Adresse as dem String Pool
 *            b) ja: totalLecker = "Kaffee" :
 *                totalLecker: bekommt die Adresse aus dem String Pool
 *            String im String Pool werden nicht für Garbage Collector freigegeben.
 * </pre>
 */
public class AllerhandZuString {
    public static void main(String[] args) {
        String dasWichtigste = "Kaffee";
        String totalLecker = "Kaffee";
        String pumucklMag = dasWichtigste;

        System.out.println(dasWichtigste);
        System.out.println(totalLecker);
        System.out.println(pumucklMag);

        boolean vergleich = dasWichtigste== totalLecker;
        System.out.println("dasWichtigste == totalLecker: "+vergleich);
    }
}
