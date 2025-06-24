package de.bikes.ausgaben;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DatumFormatierer {
    public static void main(String[] args) {
        LocalDate heute = LocalDate.now();
        System.out.println("Heutiges Datum (toString von LocalDate): " + heute);

        Locale localeDeutschland = Locale.GERMANY;
        System.out.println("Verwendetes Locale: " + localeDeutschland.getDisplayName());
        System.out.println("------------------------------------------");

        //LocalDate heute = LocalDate.now(); // Gibt das aktuelle Systemdatum zurück
        System.out.println("Heutiges Datum (toString von LocalDate): " + heute);
        System.out.println("------------------------------------------");

        DateTimeFormatter customFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String datumAlsString1 = heute.format(customFormatter1);
        System.out.println("Datum mit Pattern 'yyyy-MM-dd': " + datumAlsString1);

        // Beispiel 2: Deutsches Standard-Pattern (Tag.Monat.Jahr)
        DateTimeFormatter customFormatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String datumAlsString2 = heute.format(customFormatter2);
        System.out.println("Datum mit Pattern 'dd.MM.yyyy': " + datumAlsString2);

        // Beispiel 3: Ausführlicheres Pattern mit Monatsnamen und Wochentag
        DateTimeFormatter customFormatter3 = DateTimeFormatter.ofPattern("EEEE, dd. MMMM yyyy");
        String datumAlsString3 = heute.format(customFormatter3);
        // Da heute der 23. Juni 2025 ein Montag ist, Ausgabe wäre "Montag, 23. Juni 2025"
        System.out.println("Datum mit Pattern 'EEEE, dd. MMMM yyyy': " + datumAlsString3);
        System.out.println("------------------------------------------");


        // b. Formatierung mit lokalisiertem Datum (verschiedene Styles)
        //    Hier wird das zuvor erstellte Locale-Objekt verwendet, um das Datum
        //    entsprechend der regionalen Konventionen zu formatieren.

        System.out.println("Lokalisierte Datumsausgaben für Deutschland:");

        // FormatStyle.SHORT: Kurzform (z.B. 23.06.25)
        DateTimeFormatter localizedShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(localeDeutschland);
        String datumLokalisiertShort = heute.format(localizedShort);
        System.out.println("  SHORT: " + datumLokalisiertShort);

        // FormatStyle.MEDIUM: Mittlere Form (z.B. 23.06.2025)
        DateTimeFormatter localizedMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(localeDeutschland);
        String datumLokalisiertMedium = heute.format(localizedMedium);
        System.out.println("  MEDIUM: " + datumLokalisiertMedium);

        // FormatStyle.LONG: Lange Form (z.B. 23. Juni 2025)
        DateTimeFormatter localizedLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(localeDeutschland);
        String datumLokalisiertLong = heute.format(localizedLong);
        System.out.println("  LONG: " + datumLokalisiertLong);

        // FormatStyle.FULL: Vollständige Form (z.B. Montag, 23. Juni 2025)
        DateTimeFormatter localizedFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localeDeutschland);
        String datumLokalisiertFull = heute.format(localizedFull);
        System.out.println("  FULL: " + datumLokalisiertFull);
        System.out.println("------------------------------------------");

        // Beispiel: Lokalisierung für andere Regionen (z.B. USA)
        Locale localeUS = Locale.US; // Konstante für USA
        System.out.println("Lokalisierte Datumsausgaben für USA:");

        DateTimeFormatter localizedUS_Medium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(localeUS);
        String datumLokalisiertUS = heute.format(localizedUS_Medium);
        // Für 23. Juni 2025 würde dies 'Jun 23, 2025' ausgeben
        System.out.println("  MEDIUM (US): " + datumLokalisiertUS);

        DateTimeFormatter localizedUS_Full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localeUS);
        String datumLokalisiertUSFull = heute.format(localizedUS_Full);
        // Für 23. Juni 2025 würde dies 'Monday, June 23, 2025' ausgeben
        System.out.println("  FULL (US): " + datumLokalisiertUSFull);

    }
}
