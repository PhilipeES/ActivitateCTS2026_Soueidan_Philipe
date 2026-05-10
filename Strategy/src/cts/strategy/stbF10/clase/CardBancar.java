package cts.strategy.stbF10.clase;

public class CardBancar implements TipDePlata {
    protected String banca;

    public CardBancar(String banca) {
        this.banca = banca;
    }

    public CardBancar() {
        this.banca = "N/A";
    }

    @Override
    public void plateste() {
        System.out.println("Ati efectuat cu succes plata prin banca " + this.banca);
    }

}
