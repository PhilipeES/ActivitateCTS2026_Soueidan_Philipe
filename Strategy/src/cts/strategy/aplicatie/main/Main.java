package cts.strategy.aplicatie.main;

import cts.strategy.aplicatie.clase.Pro;
import cts.strategy.aplicatie.clase.Ultra;
import cts.strategy.aplicatie.clase.Utilizator;

public class Main {
    public static void main(String[] args) {
        Utilizator utilizator = new Utilizator();
        utilizator.confirmaAbonament();
        utilizator.setTipAbonament(new Pro());
        utilizator.confirmaAbonament();
        utilizator.setTipAbonament(new Ultra());
        utilizator.confirmaAbonament();
    }
}
