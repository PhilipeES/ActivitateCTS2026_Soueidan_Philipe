package cts.command.restaurant.clase;

public class Ocupare implements Command {
    protected String nume;
    protected Masa masa;

    public Ocupare(String nume, Masa masa) {
        this.nume = nume;
        this.masa = masa;
    }

    @Override
    public void satisfaceComanda() {
        masa.realizeazaComanda(nume, "ocupata ");
    }
}
