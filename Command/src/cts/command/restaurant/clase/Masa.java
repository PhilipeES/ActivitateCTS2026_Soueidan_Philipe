package cts.command.restaurant.clase;

public class Masa {
    private int nrMasa;
    private int capacitateMasa;

    public Masa(int nrMasa, int capacitateMasa) {
        this.nrMasa = nrMasa;
        this.capacitateMasa = capacitateMasa;
    }



    public void realizeazaComanda(String numeRezervare, String tipComanda) {
        System.out.println("Masa cu numarul " + this.nrMasa + " a fost "+ tipComanda + " pentru " + this.capacitateMasa + " persoane in numele lui " + numeRezervare + ".\n");
    }
}
