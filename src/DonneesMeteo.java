import java.util.ArrayList;

public class DonneesMeteo implements Sujet{
    public float temperature;
    public float humidite;
    public float pression;
    private ArrayList observateurs;


    public DonneesMeteo(){
        observateurs = new ArrayList(); //On crée un tableau vide à l'instanciation de la classe
    }
    @Override
    public void enregisterObservateurs(Observateur obs) {
        observateurs.add(obs); //On ajoute le nouvel observateur au tableau observateurs créé lors de l'instanciation de la classe
    }

    @Override
    public void supprimerObservateurs(Observateur obs) {
        int i= observateurs.indexOf(obs);
        if(i>=0) {
            observateurs.remove(i);
        }
    }

    @Override
    public void notifierObservateurs() {
        for(int i=0;i<observateurs.size();i++){
            Observateur o=(Observateur)observateurs.get(i);
            o.actualiser(temperature,humidite,pression);
        }
    }

    public float getHumidite() {
        return humidite;
    }

    public float getPression() {
        return pression;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setMesures(float humidite,float pression,float temperature){
        this.humidite = humidite;
        this.pression = pression;
        this.temperature = temperature;
    }

    public void actualiserMesures() {
        notifierObservateurs();
    }
}
