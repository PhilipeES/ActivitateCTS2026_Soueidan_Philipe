package cts.command.spital.clase;

public class Pacient {
    protected String nume;
    protected int varsta;

    public Pacient(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String afiseazaPacient() {
        return ("pacientul cu numele " + this.nume + " in varsta de " + this.varsta + " de ani ");
    }
}
