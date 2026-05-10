package cts.observer.restaurant.clase;

public class ClientAbonat implements IClient {
    protected String nume;

    public ClientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println("Salut, " + this.nume + "! " + mesaj + "\n");
    }
}
