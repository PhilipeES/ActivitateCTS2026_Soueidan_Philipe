package cts.philipe.singleton.exemplu.v1_eagerInitialization;

public class PachetEager {
    private String nume;
    private String denumire;
    private int suma;

    private static final PachetEager instanta =  new PachetEager();

    private PachetEager() {
        this.nume = "Philipe";
        this.denumire = "Madrid2026";
        this.suma = 1000;
    }

    public String getNume() {
        return nume;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getSuma() {
        return suma;
    }

    @Override
    public String toString() {
        return "PachetEager: " + nume + " a achizitionat pachetul " + denumire + " la pretul de " + suma;
    }

    public static PachetEager getInstanta(String nume, String denumire, int suma) {
        return instanta;
    }
}
