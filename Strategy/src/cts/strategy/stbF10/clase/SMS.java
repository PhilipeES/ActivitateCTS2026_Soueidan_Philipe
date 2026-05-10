package cts.strategy.stbF10.clase;

public class SMS implements TipDePlata {
    protected double tarif;
    protected String numar;

    public SMS(double tarif, String numar) {
        this.tarif = tarif;
        this.numar = numar;
    }

    public SMS() {
        this.tarif = 2.00;
        this.numar = "8169";
    }

    @Override
    public void plateste() {
        System.out.println("Ati efectuat cu succes plata sumei de "+ this.tarif + " euro la numarul "+ this.numar + " pentru o calatorie.");

    }
}
