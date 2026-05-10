package cts.composite.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Componenta extends Structura{
    protected List<Structura> lista;

    public Componenta(String nume) {
        super(nume);
        this.lista = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura){
        this.lista.add(structura);
    }

    public void stergeStructura(Structura structura){
        this.lista.remove(structura);
    }

    public Structura getStructura(int pozitie){
        return lista.get(pozitie);
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii + "Categorie: "+ this.nume);
        for(Structura s : this.lista){
            s.afiseazaDetalii(spatii + "   ");
        }
    }
}
