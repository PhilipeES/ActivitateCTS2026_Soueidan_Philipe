package cts.command.spital.clase;

public class Interneaza implements Command {
    protected Medic medic;
    protected Pacient pacient;

    public Interneaza(Medic medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void spitalizare() {
        medic.preiaPacient(pacient);
    }
}
