package cts.strategy.aplicatie.clase;

public class Utilizator {
    private TipAbonament tipAbonament;

    public Utilizator() {
        this.tipAbonament = new Gratis();
    }

    public void setTipAbonament(TipAbonament tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public void confirmaAbonament(){
        tipAbonament.alegeAbonament();
    }
}
