package cts.decorater.restaurant.clase;

public abstract class MesajBilet implements IBilet {
    IBilet bilet;

    public MesajBilet(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void afiseaza(){
        bilet.afiseaza();
    }

    public abstract void decorat();
}