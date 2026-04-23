package ro.ase.cts.seminar07.proxy.main;

import ro.ase.cts.seminar07.proxy.clase.Pacient;
import ro.ase.cts.seminar07.proxy.clase.Spital;
import ro.ase.cts.seminar07.proxy.claseproxy.ProxyCuAsigurare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Roland", true);
        Pacient pacient2 = new Pacient("Alex", true);
        Spital spital = new Spital("Carol Davila");

        //spital.interneazaPacient(pacient);

        ProxyCuAsigurare proxy = new ProxyCuAsigurare(spital);
        proxy.interneazaPacient(pacient);
        proxy.interneazaPacient(pacient2);
    }

}
