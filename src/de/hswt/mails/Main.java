package de.hswt.mails;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Email-Generator wird gestartet ---");
        EmailGenerator emailGenerator = new EmailGenerator();

        emailGenerator.init();

        //Generate 30 random email
        String[] random30Emails = emailGenerator.getRandomUniqueEmails();

        System.out.println("\n--- Zufällig ausgewählte 30 E-Mail-Adressen: ---");

        for (String email : random30Emails){
            System.out.println(email);
        }
        System.out.println("------------------------------------------");

        System.out.println("\n--- E-Mail-Adresse suchen ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine E-Mail-Adresse ein, die gesucht werden soll: ");
        String inputEmail = scanner.nextLine();


        boolean found = emailGenerator.doesEmailExist(inputEmail, random30Emails);

        if (found) {
            System.out.println("Die Adresse '" + inputEmail + "' wurde in der Liste gefunden.");
        } else {
            System.out.println("Die Adresse '" + inputEmail + "' wurde NICHT in der Liste gefunden.");
        }

        scanner.close();
        System.out.println("------------------------------------------");
    }
}
