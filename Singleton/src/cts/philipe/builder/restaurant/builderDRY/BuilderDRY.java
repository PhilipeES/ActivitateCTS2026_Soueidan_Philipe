package cts.philipe.builder.restaurant.builderDRY;

import cts.philipe.builder.restaurant.builderNONDRY.AbstractRezervareBuilder;
import cts.philipe.builder.restaurant.builderNONDRY.BuilderNoDRY;
import cts.philipe.builder.restaurant.clase.Rezervare;

public class BuilderDRY implements AbstractRezervareBuiderDRY {

    Rezervare rezervare = new Rezervare();

    public BuilderDRY setEveniment(String eveniment) {
        rezervare.setEveniment(eveniment);
        return this;
    }

    public BuilderDRY setScaunErgonomic(boolean scaunErgonomic) {
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public BuilderDRY setPriveliste(boolean priveliste) {
        rezervare.setPrivelisteGeam(priveliste);
        return this;
    }

    public BuilderDRY setDecorareMasa(boolean decorareMasa) {
        rezervare.setDecorareMasa(decorareMasa);
        return this;
    }

    public BuilderDRY setGenMuzicalPreferat(String genMuzicalPreferat) {
        rezervare.setGenMuzicalPreferat(genMuzicalPreferat);
        return this;
    }

    public BuilderDRY setMuzicaPersonaliata(boolean muzicaPersonaliata) {
        rezervare.setMuzicaPersonaliata(muzicaPersonaliata);
        return this;
    }

    @Override
    public Rezervare buildDRY(String eveniment) {
        this.rezervare.setEveniment(eveniment);
        return this.rezervare;
    }

}
