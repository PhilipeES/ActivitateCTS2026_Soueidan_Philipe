package cts.command.spital.main;

import cts.command.spital.clase.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----------------------DESIGN PATTERN - COMMAND (comportamental) - SPITAL A15 ----------------------\n");
        Operator operator = new Operator();
        Medic medic = new Medic("Soueidan", "cardiologie");
        Pacient pacient = new Pacient("Sorin", 56);
        Command ranit = new Interneaza(medic,new Pacient("Natalia", 21));
        Command boschetar = new Trateaza(medic,pacient);

        operator.adaugaRanit(ranit);
        operator.adaugaRanit(boschetar);

        operator.executaRanit();
        operator.executaRanit();
        operator.executaRanit();

    }
}