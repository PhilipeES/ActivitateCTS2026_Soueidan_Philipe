package cts.composite.restaurant.clase;

public abstract class Structura {
    protected String nume;

    public Structura(String nume) {
        this.nume = nume;
    }

    public abstract void afiseazaDetalii(String spatii);

}
