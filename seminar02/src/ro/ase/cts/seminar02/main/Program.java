package ro.ase.cts.seminar02.main;

import ro.ase.cts.seminar02.clase.Aplicant;
import ro.ase.cts.seminar02.clase.readers.AngajatiReader;
import ro.ase.cts.seminar02.clase.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        try {
            AplicantReader ra = new AngajatiReader("seminar02/angajati.txt");
            listaAplicanti = ra.readAplicanti();
            for (Aplicant aplicant : listaAplicanti) {
                System.out.println(aplicant.toString());
                aplicant.afisareVenit();
                aplicant.afiseazaStatut();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
