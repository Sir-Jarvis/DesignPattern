package org.example;

public class IncidentsFlyweight implements CallCenterFlyweight{
    // Intrinsic property
    private final String TYPE_APPEL;

    // Extrinsic property
    private String numTel;
    private String duree;
    private String NomAgent;

    IncidentsFlyweight() {
        this.TYPE_APPEL = "Incidents";
    }

    @Override
    public void setTelephone(String numTel) {
        this.numTel = numTel;
    }

    @Override
    public void setDuree(String duree) {
        this.duree = duree;
    }

    @Override
    public void setNomAgent(String NomAgent) {
        this.NomAgent = NomAgent;
    }

    @Override
    public void CallCreated() {
        System.out.println("Appel créé: Ok! \n Type de l'appel: " + TYPE_APPEL + "\n Numéro applelant: " + numTel + "\n Durée de l'appel " + duree + "\n Nom de l'agent " + NomAgent);
    }
}
