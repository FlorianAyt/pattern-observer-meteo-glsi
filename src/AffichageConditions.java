public class AffichageConditions implements Observateur,Affichage{

    private float temperature;
    private float humidite;
    private Sujet donneesMeteo;

    public AffichageConditions(Sujet dm){
        this.donneesMeteo=dm;
        donneesMeteo.enregisterObservateurs(this);
    }

    @Override
    public void afficher() {
        System.out.println("Conditions actuelles:"+ temperature+" degrés et "+humidite+"'humidité");
    }

    @Override
    public void actualiser(float h, float t, float p) {
        this.temperature=t;
        this.humidite=h;
        afficher();
    }
}
