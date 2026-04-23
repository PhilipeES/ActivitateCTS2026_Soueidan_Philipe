package ro.ase.cts.seminar07.facade.main;

import ro.ase.cts.seminar07.facade.SpitalFacade.SpitalFacade;
import ro.ase.cts.seminar07.facade.clase.Medic;
import ro.ase.cts.seminar07.facade.clase.Pacient;
import ro.ase.cts.seminar07.facade.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Natalia", 7);
        Pacient pacient1 = new Pacient("Rares", 5);
        Pacient pacient2 = new Pacient("Matei", 2);
        Pacient pacient3 = new Pacient("Lip", 10);

        Medic medic = new Medic("Lip");
        //Salon salon = new Salon();

//        if (pacient.getGravitate()>=4){
//            if (medic.areBiletDeTrimitere(pacient)){
//                int pat = salon.suntPaturiLibere();
//                if(pat!=-1){
//                    System.out.println("Pacientul "+ pacient.getNume() + " poate fi internat pe patul "+ pat);
//                    salon.ocupaPat(pat);
//                }
//            }
//        }

        SpitalFacade facade = new SpitalFacade(new Medic("Razvan"), Salon.getInstance());
        facade.interneazaPacient(pacient1);
        facade.interneazaPacient(pacient2);
        facade.interneazaPacient(pacient);
        facade.interneazaPacient(pacient3);
    }
}