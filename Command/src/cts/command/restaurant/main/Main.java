package cts.command.restaurant.main;

import cts.command.restaurant.clase.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----------------------DESIGN PATTERN - COMMAND (comportamental) - RESTAURANT B15 ----------------------\n");
        Operator operator = new Operator();
        Command ocupare1 = new Ocupare("Philipe", new Masa(1, 2));
        Command rezervare1 = new Rezervare("Philipe", new Masa(1, 2));
        Command rezervare2 = new Rezervare("Natalia", new Masa(2, 2));

        operator.adaugaComanda(ocupare1);
        operator.adaugaComanda(rezervare1);
        operator.adaugaComanda(rezervare2);
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();


    }
}
