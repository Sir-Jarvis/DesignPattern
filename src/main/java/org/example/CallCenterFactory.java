package org.example;

import java.util.HashMap;

public class CallCenterFactory {
    private static HashMap<String, CallCenterFlyweight> hashMap = new HashMap<String, CallCenterFlyweight>();

    public static CallCenterFlyweight getAppel(String type) {
        CallCenterFlyweight c = null;
        if(hashMap.containsKey(type)) {
            c = hashMap.get(type);
        }
        else {
            switch (type) {
                case "Incidents":
                    System.out.println("Votre Requête d'appel pour déclarer un incident a été acceptée");
                    c = new IncidentsFlyweight();
                    break;
                case "Renseignements":
                    System.out.println("Votre Requête d'appel pour demander un renseignement a été acceptée");
                    c = new IncidentsFlyweight();
                    break;
                default:
                    throw new IllegalArgumentException("Le type d'appel n'existe pas dans la fabrique.");
            }
            hashMap.put(type, c);
        }
        return c;
    }
}
