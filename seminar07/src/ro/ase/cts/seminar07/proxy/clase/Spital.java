package ro.ase.cts.seminar07.proxy.clase;

import java.sql.SQLOutput;

public class Spital implements ISpital{
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    public void interneazaPacient(Pacient pacient){
        System.out.println("Pacientul "+ pacient.getNume() + " este internat in Spitalul Universitar "+ this.nume);
    }
}
