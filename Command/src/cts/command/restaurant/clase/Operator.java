package cts.command.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    List<Command> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<>();
    }

    public void adaugaComanda(Command comanda) {
        listaComenzi.add(comanda);
    }

    public void executaComanda() {
        if (listaComenzi.size() > 0) {
            listaComenzi.getFirst().satisfaceComanda();
            listaComenzi.removeFirst();
        } else {
            System.out.println("Nu exista comenzi in lista.");
        }
    }
}
