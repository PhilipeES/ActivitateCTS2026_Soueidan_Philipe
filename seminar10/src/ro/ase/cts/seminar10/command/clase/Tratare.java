package ro.ase.cts.seminar10.command.clase;

public class Tratare implements Command {
    private PersonalSpital asistenta;
    private Pacient pacient;

    public Tratare(PersonalSpital asistenta, Pacient pacient) {
        this.asistenta = asistenta;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        asistenta.preluarePacient(pacient);
    }
}
