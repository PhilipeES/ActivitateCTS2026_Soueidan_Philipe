package cts.composite.spital.clase;

public abstract class Structura {
    protected String numeStruct;
    protected int nrAngajati;


    public Structura(String numeStruct, int nrAngajati) {
        this.numeStruct = numeStruct;
        this.nrAngajati = nrAngajati;
    }

    public abstract void afiseazaStructura(String spatiu);
}
