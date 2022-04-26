package org.example;

public class CallCenterMain {
    public static void main(String[] args) {
        // Appeler la factory pour créer un appel de signalisation d'incidents
        CallCenterFlyweight inc = CallCenterFactory.getAppel("Incidents");
        // Charger le numéro de téléphone de l'appelant
        inc.setTelephone("77 123 71 89");
        // Charger la durée de l'appel
        inc.setDuree("45 s");
        // Charger l'agent répondant à l'appel
        inc.setNomAgent("John Doe");
        // Appel correspondant
        inc.CallCreated();

        System.out.println("\n ---------------------------------------- \n");

        // Appeler la factory pour créer un appel de damande de renseignements
        CallCenterFlyweight rens = CallCenterFactory.getAppel("Renseignements");
        // Charger le numéro de téléphone de l'appelant
        rens.setTelephone("77 321 87 18");
        // Charger la durée de l'appel
        rens.setDuree("3 mn");
        // Charger l'agent répondant à l'appel
        rens.setNomAgent("Alice Parker");
        // Appel correspondant
        rens.CallCreated();

    }
}
