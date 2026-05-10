package cts.strategy.stbF10.clase;

public class CardCalatorii implements TipDePlata {
    protected String titular;

    public CardCalatorii(String titular) {
        this.titular = titular;
    }

    public CardCalatorii() {
        this.titular = "Nenominal";
    }

    @Override
    public void plateste() {
        System.out.println("Ati efectuat cu succes plata cu cardul de calatorie al lui "+this.titular);
    }
}
