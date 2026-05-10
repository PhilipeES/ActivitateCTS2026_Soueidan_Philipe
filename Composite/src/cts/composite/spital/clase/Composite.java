package cts.composite.spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Structura {
    List<Structura> lista;

    public Composite(String numeStruct, int nrAngajati) {
        super(numeStruct, nrAngajati);
        this.lista = new ArrayList<>();
    }


    public void adaugaStructura(Structura structura) {
        lista.add(structura);
    }

    public void stergeStructura(Structura structura) {
        lista.remove(structura);
    }

    @Override
    public void afiseazaStructura(String spatiu) {
        System.out.println(spatiu + "Dep. " + numeStruct + " are " + this.nrAngajati + " angajati.");
        for (Structura s : lista) {
            s.afiseazaStructura(spatiu + "   ");
        }
    }
}
