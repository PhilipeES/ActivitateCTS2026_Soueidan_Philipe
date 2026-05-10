package cts.decorater.restaurant.main;

import cts.decorater.restaurant.clase.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n---------- DECORATER - SPITAL F7 ----------\n");

        IBilet bilet = new Bilet("Philipe", 23);
        IBilet biletbun = new Bilet("Natalia", 28);

        MesajBilet mesaj = new MesajRomania(bilet);
        MesajBilet vlt = new MesajValentin(biletbun);

        bilet.afiseaza();
        bilet.afiseaza();
        System.out.println("---------");
        mesaj.decorat();
        vlt.decorat();

    }
}