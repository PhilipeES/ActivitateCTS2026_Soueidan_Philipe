package cts.tema01.clase;

import cts.tema01.interfete.IPersoana;

public class Persoana implements IPersoana {
    protected String nume;
    protected int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public String toString() {
        return nume + " are " + varsta + " de ani.\n";
    }
}
