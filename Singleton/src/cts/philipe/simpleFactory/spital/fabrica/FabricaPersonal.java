package cts.philipe.simpleFactory.spital.fabrica;

import cts.philipe.simpleFactory.spital.clase.Asistent;
import cts.philipe.simpleFactory.spital.clase.Brancardier;
import cts.philipe.simpleFactory.spital.clase.Medic;
import cts.philipe.simpleFactory.spital.clase.PersonalSpital;

public class FabricaPersonal {

    public PersonalSpital getPersonalMedical(TIP_PERSONAL tipPersonal, String nume, int varsta) {
        switch (tipPersonal) {
            case ASISTENT:
                return new Asistent(nume, varsta, "ATI");
            case MEDIC:
                return new Medic(nume, varsta, 21);
            case BRANCARDIER:
                return new Brancardier(nume, varsta, 4);
            default:
                return null;

        }
    }

    public PersonalSpital getPersonalMedical(TIP_PERSONAL tipPersonal, String nume, int varsta, String departament, int aniExperienta, int nrTure) {
        switch (tipPersonal) {
            case ASISTENT:
                return new Asistent(nume, varsta, departament);
            case MEDIC:
                return new Medic(nume, varsta, aniExperienta);
            case BRANCARDIER:
                return new Brancardier(nume, varsta, nrTure);
            default:
                return null;

        }
    }


}
