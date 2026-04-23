package ro.ase.cts.seminar07.facade.SpitalFacade;

import ro.ase.cts.seminar07.facade.clase.Medic;
import ro.ase.cts.seminar07.facade.clase.Pacient;
import ro.ase.cts.seminar07.facade.clase.Salon;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient){
        if (pacient.getGravitate()>=4){
            if (medic.areBiletDeTrimitere(pacient)){
                int pat = salon.suntPaturiLibere();
                if(pat!=-1){
                    System.out.println("Pacientul "+ pacient.getNume() + " poate fi internat pe patul "+ pat);
                    salon.ocupaPat(pat);
                }
                else
                    System.out.println("Pacientul" + pacient.getNume()+ " nu are loc in acest spital!");
            }
            else
                System.out.println("Pacientul" + pacient.getNume() +" are bilet de trimitere!\n");
        }
        else
            System.out.println("Pacientul" + pacient.getNume() +" nu este eligibil pentru internare!\n");
    }

}
