package de.bikes.daten;

/**
 * Wird ausgelöst, wenn die 3 Werte für Tag, Monat und Jahr kein gültiges Datum bilden
 */
public class UngultigesDatumException extends RuntimeException {
    public UngultigesDatumException(String message) {
        super(message);
    }

    public UngultigesDatumException() {

    }
}
