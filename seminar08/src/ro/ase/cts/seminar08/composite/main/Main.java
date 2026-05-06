package ro.ase.cts.seminar08.composite.main;

import ro.ase.cts.seminar08.composite.clase.Departament;
import ro.ase.cts.seminar08.composite.clase.Sectie;
import ro.ase.cts.seminar08.composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura depSpital = new Departament("Spital");
        Structura depAdmin = new Departament("Administrativ");
        Structura sectieSecretariat = new Sectie("Sectretariat", 10);
        Structura sectieManagement = new Sectie("Management", 15);

        ((Departament) depSpital).adaugaStructura(depAdmin);
        ((Departament) depSpital).adaugaStructura(sectieManagement);
        ((Departament) depAdmin).adaugaStructura(sectieSecretariat);

        depSpital.afiseazaDetaliiStructura("  ");

        ((Departament) depSpital).stergeStructura(sectieManagement);
        ((Departament) depAdmin).adaugaStructura(sectieManagement);

        System.out.println("Dupa modificare: 0\n");
    }
}