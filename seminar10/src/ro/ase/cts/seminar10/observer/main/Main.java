package ro.ase.cts.seminar10.observer.main;

import ro.ase.cts.seminar10.observer.clase.ISpital;
import ro.ase.cts.seminar10.observer.clase.Pacient;
import ro.ase.cts.seminar10.observer.clase.PacientAbonat;
import ro.ase.cts.seminar10.observer.clase.Spital;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Pacient pacient1 = new PacientAbonat("Ionescu", 30);
        Pacient pacient2 = new PacientAbonat("Popescu", 30);
        Pacient pacient3 = new PacientAbonat("Vasilescu", 30);

        ISpital spital = new Spital("Cantacuzino");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        ((Spital)spital).notificaEpidemie();
        ((Spital)spital).notificaVirus();



    }
}