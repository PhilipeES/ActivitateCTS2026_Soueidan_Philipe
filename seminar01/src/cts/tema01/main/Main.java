package cts.tema01.main;

import cts.tema01.clase.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Persoana persoana = new Persoana("Natalia", 21);
        System.out.printf(persoana.toString());
        Profesor zota = new Profesor("Razvan Zota", 40, "0001");
        System.out.println(zota.toString());
        Asistent alin = new Asistent("Alin Vaduva", 20, "AS02");
        System.out.println(alin.toString());
        Student philipe = new Student("Philipe", 21, "PS23");
        System.out.println(philipe.toString());
        Curs curs1 = new Curs("CTS", 5, zota);
        System.out.println(curs1.toString());
        curs1.adaugaStudent(philipe);
        System.out.println(curs1.toString());
        zota.preda();
        alin.preda();
    }
}
