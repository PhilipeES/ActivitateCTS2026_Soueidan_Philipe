package ro.ase.cts.seminar11.command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(Command comanda){
        comenzi.add(comanda);
    }

    public void executaComanda(){
        if(comenzi.size()>0){
            comenzi.getFirst().pleacaInCursa();
            comenzi.removeFirst();
        }
        else{
            System.out.println("La revedere, nu mai e comenzi");
        }

    }
}
