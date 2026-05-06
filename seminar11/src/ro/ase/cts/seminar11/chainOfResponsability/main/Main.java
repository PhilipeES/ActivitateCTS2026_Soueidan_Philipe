package ro.ase.cts.seminar11.chainOfResponsability.main;

import ro.ase.cts.seminar11.chainOfResponsability.clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();

        calatorieTroleibuz.setSuccesor(calatorieAutobuz);
        calatorieAutobuz.setSuccesor(calatorieTramvai);
        calatorieTramvai.setSuccesor(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandariCalatorie(2));
        System.out.println(calatorieTroleibuz.recomandariCalatorie(4));
        System.out.println(calatorieTroleibuz.recomandariCalatorie(7));
        System.out.println(calatorieTroleibuz.recomandariCalatorie(15));
    }
}