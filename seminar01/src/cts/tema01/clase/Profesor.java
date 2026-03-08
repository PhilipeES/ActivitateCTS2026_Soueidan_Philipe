package cts.tema01.clase;

import cts.tema01.interfete.IPersoana;
import cts.tema01.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private String idAngajat;

    public Profesor(String nume, int varsta, String idAngajat) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
    }

    public String getIdAngajat() {
        return idAngajat;
    }

    @Override
    public String toString() {
        return "Profesorul " + super.nume + " are ID-ul " + idAngajat + " si " + super.varsta + " de ani.\n";
    }

    @Override
    public void preda() {
        System.out.println("Profesorul " + super.nume + " preda cel putin un curs.\n");
    }
}
