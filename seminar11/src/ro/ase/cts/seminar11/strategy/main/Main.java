package ro.ase.cts.seminar11.strategy.main;

import ro.ase.cts.seminar11.strategy.clase.ProbaOrala;
import ro.ase.cts.seminar11.strategy.clase.ProbaScrisa;
import ro.ase.cts.seminar11.strategy.clase.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("STRATEGY");

        Student student = new Student();
        student.examinare();

        student.setModSustinere(new ProbaOrala());
        student.examinare();

        student.setModSustinere(new ProbaScrisa());
        student.examinare();
    }
}
