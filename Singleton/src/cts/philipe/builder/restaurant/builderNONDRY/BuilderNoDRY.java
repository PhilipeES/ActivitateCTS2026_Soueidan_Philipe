package cts.philipe.builder.restaurant.builderNONDRY;

import cts.philipe.builder.restaurant.clase.Rezervare;

public class BuilderNoDRY implements AbstractRezervareBuilder {
    private String eveniment;
    private boolean privelisteGeam = false;
    private boolean scaunErgonomic = false;
    private boolean decorareMasa = false;
    private String genMuzicalPreferat = "";
    private boolean muzicaPersonaliata = false;

    public BuilderNoDRY setEveniment(String eveniment) {
        this.eveniment = eveniment;
        return this;
    }

    public BuilderNoDRY setPriveliste(boolean priveliste) {
        this.privelisteGeam = priveliste;
        return this;
    }

    public BuilderNoDRY setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public BuilderNoDRY setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    public BuilderNoDRY setGenMuzicalPreferat(String genMuzicalPreferat) {
        this.genMuzicalPreferat = genMuzicalPreferat;
        return this;
    }

    public BuilderNoDRY setMuzicaPersonaliata(boolean muzicaPersonaliata) {
        this.muzicaPersonaliata = muzicaPersonaliata;
        return this;
    }


    @Override
    public Rezervare build() {
        return new Rezervare(this.eveniment,
                this.privelisteGeam,
                this.scaunErgonomic,
                this.decorareMasa,
                this.genMuzicalPreferat,
                this.muzicaPersonaliata);
    }


}
