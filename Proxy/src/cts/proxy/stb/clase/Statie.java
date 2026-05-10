package cts.proxy.stb.clase;

public class Statie implements IStatie {
    private String numeStatie;

    public Statie(String numeStatie) {
        this.numeStatie = numeStatie;
    }

    @Override
    public void opreste(Autobuz autobuz) {
        System.out.println("Autobuzul " + autobuz.getNumar() + " a oprit in statia " + this.numeStatie);
    }
}
