package ro.ase.cts.seminar09.strategy.clase;

public class Client {
    private String numeClient;
    private ModalitatiDePlata modalitateDePlata;

    public Client(String numeClient) {
        this.numeClient = numeClient;
        this.modalitateDePlata = new PlataCard();
    }

    public void setModalitateDePlata(ModalitatiDePlata modalitateDePlata) {
        this.modalitateDePlata = modalitateDePlata;
    }

    public void tranzactie(double suma){
        modalitateDePlata.plateste(numeClient, suma);
    }
}
