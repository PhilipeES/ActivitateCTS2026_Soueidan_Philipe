package cts.decorater.restaurant.clase;

public class MesajRomania extends MesajBilet{

    public MesajRomania(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void decorat() {
        bilet.afiseaza();
        System.out.println("La multi ani Romania! La multi ani Bucuresti!\n");
    }
}
