package cts.composite.restaurant.clase;

public class Item extends Structura {
    protected double pret;

    public Item(String nume, double pret) {
        super(nume);
        this.pret = pret;
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii + "Produsul " + this.nume + " costa " + this.pret + " lei.");
    }
}
