package cts.philipe.simpleFactory.spital.main;

import cts.philipe.simpleFactory.spital.clase.Asistent;
import cts.philipe.simpleFactory.spital.clase.PersonalSpital;
import cts.philipe.simpleFactory.spital.fabrica.FabricaPersonal;
import cts.philipe.simpleFactory.spital.fabrica.TIP_PERSONAL;

public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        PersonalSpital asistent01 = fabricaPersonal.getPersonalMedical(TIP_PERSONAL.ASISTENT, "Titus", 21, "ATI", 0, 0);
        PersonalSpital medic01 = fabricaPersonal.getPersonalMedical(TIP_PERSONAL.MEDIC, "Natalius", 20, "Cardio", 6, 9);
        PersonalSpital brancardier01 = fabricaPersonal.getPersonalMedical(TIP_PERSONAL.BRANCARDIER, "Ioanus", 22, "Lego", 2,2);
    }
}
