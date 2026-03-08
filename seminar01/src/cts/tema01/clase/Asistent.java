package cts.tema01.clase;

import cts.tema01.interfete.IPersoana;
import cts.tema01.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private String idAsistent;

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    public String getIdAsistent() {
        return idAsistent;
    }

    public void preda() {
        System.out.println("Asistentul " + super.nume + " nu poate preda cursuri, doar seminarii.\n");
    }

    @Override
    public String toString() {
        return "Asistentul " + super.nume + " are ID-ul " + idAsistent + " si " + super.varsta + " ani.\n";
    }


}
