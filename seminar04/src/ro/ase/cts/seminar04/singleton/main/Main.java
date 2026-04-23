package ro.ase.cts.seminar04.singleton.main;

import ro.ase.cts.seminar04.singleton.logger.Logger;

public class Main {
    public static void main(String[] args) {
        Logger instance = Logger.getInstanta("Interfata", "afisare");
        instance.afisareLog("Fisierul JSON nu este afisat corect.");
        instance.afisareLog("Eroare!");
        Logger instance2 = Logger.getInstanta("Backend", "baza de date");
        instance2.afisareLog("Eroare...");
        instance2.setCategorie("Baza de date");
        instance2.setSender("Backend");
        instance2.afisareLog("eroare la inserare");
        // Logger instance3 = new Logger() // nu trebuie sa pot sa fac asta, e bine daca imi da eroare
    }
}
