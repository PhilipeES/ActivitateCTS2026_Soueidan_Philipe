package cts.command.restaurant.clase;

public class Rezervare implements Command {
    protected String nume;
    protected Masa masa;

    public Rezervare(String nume, Masa masa) {
        this.nume = nume;
        this.masa = masa;
    }

    @Override
    public void satisfaceComanda() {
        masa.realizeazaComanda(nume, "rezervata ");
    }
}
