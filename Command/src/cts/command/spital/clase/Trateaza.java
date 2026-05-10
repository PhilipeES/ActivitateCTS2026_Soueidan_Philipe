package cts.command.spital.clase;

public class Trateaza implements Command {
    public Medic medic;
    public Pacient pacient;

    public Trateaza(Medic medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void spitalizare() {
        medic.preiaPacient(pacient);
    }
}
