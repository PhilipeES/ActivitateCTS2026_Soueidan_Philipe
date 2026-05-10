package cts.strategy.stbF10.clase;

public class Calator {
    private TipDePlata tipDePlata;
    private String nume;

    public Calator(String nume) {
        this.tipDePlata = new CardCalatorii();
        this.nume = nume;
    }

    public void setTipDePlata(TipDePlata tipDePlata) {
        this.tipDePlata = tipDePlata;
    }

    public void efectuarePlata(){
        tipDePlata.plateste();
    }
}
