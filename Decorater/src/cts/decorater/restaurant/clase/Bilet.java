package cts.decorater.restaurant.clase;

public class Bilet implements IBilet {
    public String nume;
    public int nrBilet;

    public Bilet(String nume, int nrBilet) {
        this.nume = nume;
        this.nrBilet = nrBilet;
    }


    @Override
    public void afiseaza() {
        System.out.println("Bilet nr." + this.nrBilet + " | Calator: " + this.nume);
    }
}
