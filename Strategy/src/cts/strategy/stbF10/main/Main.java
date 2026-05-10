package cts.strategy.stbF10.main;

import cts.strategy.stbF10.clase.Calator;
import cts.strategy.stbF10.clase.CardBancar;
import cts.strategy.stbF10.clase.SMS;

public class Main {
    public static void main(String[] args) {
        System.out.println("DESIGN PATTERN COMPORTAMENTAL - STRATEGY");
        Calator calator = new Calator("Natalia");
        calator.efectuarePlata();
        calator.setTipDePlata(new CardBancar());
        calator.efectuarePlata();
        calator.setTipDePlata(new SMS(2.00,"8000"));
        calator.efectuarePlata();

    }
}