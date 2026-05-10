package cts.command.spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    List<Command> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<>();
    }

    public void adaugaRanit(Command command) {
        listaComenzi.add(command);
    }

    public void executaRanit() {
        if (listaComenzi.size() > 0) {
            listaComenzi.getFirst().spitalizare();
            listaComenzi.removeFirst();
        } else {
            System.out.println("Du-te si dormi cumetre, nu mai e raniti pe raza asta.\n");
        }
    }
}
