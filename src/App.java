public class App {
    public static void main(String[] args) {
        DonneesMeteo dm = new DonneesMeteo();
        AffichageConditions ac = new AffichageConditions(dm);
        dm.setMesures(22, 65, 1020);
        dm.actualiserMesures();

        System.out.println("Modification");
        dm.setMesures(22, 65, 1020);
        dm.actualiserMesures();

        System.out.println("Modification 2");
        dm.setMesures(25, 75, 1000);
        dm.actualiserMesures();

        System.out.println("Modification 3");
        dm.setMesures(23, 30, 1800);
        dm.actualiserMesures();


    }
}
