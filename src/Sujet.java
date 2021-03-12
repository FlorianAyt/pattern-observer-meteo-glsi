public interface Sujet {
    void enregisterObservateurs(Observateur o);
    void supprimerObservateurs(Observateur o);
    void notifierObservateurs();
}
