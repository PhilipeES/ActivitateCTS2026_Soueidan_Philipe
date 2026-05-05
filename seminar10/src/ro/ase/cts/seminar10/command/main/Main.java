package ro.ase.cts.seminar10.command.main;

import ro.ase.cts.seminar10.command.clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Soueidan");
        PersonalSpital asistenta = new Asistenta("Sava");

        Pacient pacient = new Pacient("Ciobanu");
        Pacient pacient2 = new Pacient("Philipe");

        Command comanda1 = new Internare(medic, pacient);
        Command comanda2 = new Internare(asistenta, pacient2);

        Operator operator = new Operator();

        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);
        operator.executaInregistrare();
        operator.executaInregistrare();

        operator.inregistreaza(new Tratare(asistenta, new Pacient("Edward")));
        operator.executaInregistrare();


    }
}
