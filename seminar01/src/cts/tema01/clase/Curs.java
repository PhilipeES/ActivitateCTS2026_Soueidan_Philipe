package cts.tema01.clase;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    protected String numeCurs;
    protected int credite;
    Profesor profesor;
    List<Student> studenti;

    public Curs(String numeCurs, int credite, Profesor profesor) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = new ArrayList<>();
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void adaugaStudent(Student student) {
        studenti.add(student);
    }

    @Override
    public String toString() {
        return "Cursul de " +
                numeCurs + " are " + credite + " " +
                "credite, este sustinut de prof. " + profesor +
                " si are studentii " + studenti;
    }

}
