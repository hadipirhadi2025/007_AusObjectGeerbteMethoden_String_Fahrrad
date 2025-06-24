package de.bikes.allerhand;

import java.util.Scanner;

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
 *
 *            String Objekt können nach der Erzeugung nicht mehr geändert werden:Immutable
 *            Die Methoden aus der String Klasse erstellen neue String
 *
 *            String sollen immer mit equals vergleichen werden, nie mit ==
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

        dasWichtigste.toUpperCase();
        System.out.println(totalLecker);
        System.out.println(dasWichtigste);

        String gross = dasWichtigste.toUpperCase();
        System.out.println(gross);

        String passwort = "passwort";
        System.out.println("Gibt das passwort ein");
        Scanner lesser = new Scanner(System.in);
        String  eingabe = lesser.nextLine();
        if (eingabe==passwort){
            System.out.println("Du Darfst rein");
        }else{
            System.out.println("Du bleibst draußen");
        }
        vergleich = eingabe.equals(passwort);
        //equals bei strings: vergleicht doe Buchstaben im String: inhaltlicher Vergleich
        System.out.println("eingabe.equals(passwort): " + vergleich);
        System.out.println("Besser vergleichen");
        if (eingabe.equals(passwort)){
            System.out.println("Endlich drin!");
        }

    }
}
