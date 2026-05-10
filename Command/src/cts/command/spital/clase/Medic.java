package cts.command.spital.clase;

public class Medic {
    private String nume;
    private String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    public void preiaPacient(Pacient pacient) {
        System.out.println("Medicul " + this.nume + " preia " + pacient.afiseazaPacient() + " in cabinetul de " + this.specializare + ".\n");
    }
}
