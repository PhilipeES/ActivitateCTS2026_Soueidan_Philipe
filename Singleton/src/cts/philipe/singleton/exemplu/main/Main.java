package cts.philipe.singleton.exemplu.main;

import cts.philipe.singleton.exemplu.v1_eagerInitialization.PachetEager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        PachetEager pachetEager1 = PachetEager.getInstanta("Dragos", "Iran2026", 50);
        System.out.println("PachetEager1: " + pachetEager1.getDenumire() + pachetEager1.getNume() + pachetEager1.getSuma());
        System.out.println(pachetEager1.toString());
        PachetEager pachetEager2 = PachetEager.getInstanta("Natalia", "Saint-Tropez", 10000);
        System.out.println(pachetEager2.toString());


    }
}
