package cts.flyweight.stb.clase;

public class Linie implements ILinie {
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void desfasuratorLinie(Autobuz autobuz) {
        System.out.println("Pe linia " + this.nrLinie + " va circula " + autobuz.afiseazaAutobuz() + " de la " + this.primaStatie + " pana la " + this.ultimaStatie + ".\n");
    }
}
