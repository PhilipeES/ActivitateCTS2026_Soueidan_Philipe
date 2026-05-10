package cts.decorater.restaurant.clase;

public class MesajValentin extends MesajBilet{

    public MesajValentin(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void decorat() {
        bilet.afiseaza();
        System.out.println("La multi ani de Dragobete!\n");
    }
}
