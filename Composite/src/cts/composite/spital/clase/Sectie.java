package cts.composite.spital.clase;

public class Sectie extends Structura {

    public Sectie(String numeStruct, int nrAngajati) {
        super(numeStruct, nrAngajati);
    }

    @Override
    public void afiseazaStructura(String spatiu) {
        System.out.println(spatiu + "     Sectia " + this.numeStruct + " are " + this.nrAngajati + " angajati.");
    }
}
