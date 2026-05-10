package cts.composite.spital.main;

import cts.composite.spital.clase.Composite;
import cts.composite.spital.clase.Sectie;
import cts.composite.spital.clase.Structura;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------- DESIGN PATTERN STRUCTURAL - COMPOSITE A8 ----------\n");

        Structura depAdmin = new Composite("Administrativ", 10);
        Structura depFinanciar = new Composite("Financiar", 7);
        Structura subDepFiscal = new Composite("Fiscal", 33);
        Structura subDepLegal = new Composite("Legal", 44);
        Structura sectiePolitie = new Sectie("Politie", 55);
        Structura depCardio = new Composite("Cardiologie", 22);
        Structura sectieRezCardio = new Sectie("Rezidenti Cardiologie", 16);

        ((Composite) depAdmin).adaugaStructura(subDepFiscal);
        ((Composite) depAdmin).adaugaStructura(subDepLegal);
        ((Composite) depCardio).adaugaStructura(sectieRezCardio);
        ((Composite) subDepLegal).adaugaStructura(sectiePolitie);

        depAdmin.afiseazaStructura("");
        depFinanciar.afiseazaStructura("");
        depCardio.afiseazaStructura("");

        ((Composite) depCardio).stergeStructura(depFinanciar);


    }
}
