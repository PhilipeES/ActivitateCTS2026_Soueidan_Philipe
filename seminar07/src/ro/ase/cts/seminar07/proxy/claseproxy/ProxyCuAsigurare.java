package ro.ase.cts.seminar07.proxy.claseproxy;

import ro.ase.cts.seminar07.proxy.clase.ISpital;
import ro.ase.cts.seminar07.proxy.clase.Pacient;
import ro.ase.cts.seminar07.proxy.clase.Spital;

public class ProxyCuAsigurare implements ISpital {
    private ISpital spital;

    public ProxyCuAsigurare(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            spital.interneazaPacient(pacient);
        }
        else
            System.out.println("Pacientul nu are asigurare si nu poate fi internat.");
    }
}
