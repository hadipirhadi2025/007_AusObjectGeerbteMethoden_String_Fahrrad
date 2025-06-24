package de.hswt.mails;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class EmailGenerator {
    private String[] vornamen = {"Max", "Anna", "Jörg", "Lena", "Günther"};
    private String[] nachnamen = {"Müller", "Schön", "Von Bismarck", "Maier", "Schmidt-Huber"};
    private String[] providers = {"gmx", "web", "telekom", "outlook", "gmail"}; // zb : gmx, web, yahoo
    private String[] topleveldomains = {"gmx", "web", "telekom", "outlook", "gmail"}; // zb : de, com, org, net

    private String[] emailAddresses;


    //EmailGenerator

    public void init(){
        for (String vorname : vornamen) {
            for (String nachname : nachnamen) {
                for (String provider : providers) {
                    for (String tld : topleveldomains) {

                        String rawEmail = vorname + "." + nachname + "@" + provider + "." + tld;
                        System.out.println(rawEmail);
                        String cleanedEmail = bereinigeEmail(rawEmail);

                        emailAddresses = erweitereEmailAddresses(emailAddresses, cleanedEmail);
                    }
                }
            }
        }
    }

    private String[] erweitereEmailAddresses(String[] emailAddresses, String neuEmailAddresses){
        if (emailAddresses==null)
            emailAddresses = new String[0];
        String[] copiedEmailAddresses = new String[emailAddresses.length+1];
        if(emailAddresses.length>0) {
            for (int i = 0; i < emailAddresses.length; i++) {
                copiedEmailAddresses[i] = emailAddresses[i];
            }
            copiedEmailAddresses[copiedEmailAddresses.length-1] = neuEmailAddresses;
        }else{
            copiedEmailAddresses[copiedEmailAddresses.length-1] = neuEmailAddresses;
        }
        return copiedEmailAddresses;

    }
    private String bereinigeEmail(String email) {
       //change to lowercase
        String cleaned = email.toLowerCase();

        // replace ümlaut
        cleaned = cleaned.replace("ä", "ae");
        cleaned = cleaned.replace("ö", "oe");
        cleaned = cleaned.replace("ü", "ue");
        cleaned = cleaned.replace("ß", "ss");

        // remove space
        cleaned = cleaned.replace(" ", ""); //  replaceAll("\\s", "")



        return cleaned;
    }

    public String[] getRandomUniqueEmails() {
        if (emailAddresses == null || emailAddresses.length == 0) {
            //emailAdresses empty
            return new String[0];
        }

        Set<String> uniqueEmails = new HashSet<>();
        Random random = new Random();

        //until unique email find
        while (uniqueEmails.size() < 30) {
            int randomIndex = random.nextInt(emailAddresses.length); // random index
            uniqueEmails.add(emailAddresses[randomIndex]); // set did not add repeated email
        }

        // Set to array convert
        return uniqueEmails.toArray(new String[0]);
    }

    public boolean doesEmailExist(String email, String[] emailList) {
        //clean email adress
        String cleanedInputEmail = bereinigeEmail(email);

        for (String existingEmail : emailList) {
            // Strings vergleich
            if (existingEmail.equals(cleanedInputEmail)) {
                return true; // find
            }
        }
        return false; // not find
    }

    // Getter method
    public String[] getEmailAddresses() {
        return emailAddresses;
    }
}
