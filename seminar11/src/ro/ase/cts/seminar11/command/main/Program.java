package ro.ase.cts.seminar11.command.main;

import ro.ase.cts.seminar11.command.clase.Autobuz;
import ro.ase.cts.seminar11.command.clase.Command;
import ro.ase.cts.seminar11.command.clase.Operator;
import ro.ase.cts.seminar11.command.clase.Plecare;

public class Program {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Command comanda1 = new Plecare(new Autobuz("Mercedes"),100);
        Command comanda2 = new Plecare(new Autobuz("Otokar"),331);

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(new Plecare(new Autobuz("TudiAudi"),300));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
