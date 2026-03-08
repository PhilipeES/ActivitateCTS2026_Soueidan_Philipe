package cts.tema01.clase;

public class Student extends Persoana {
    private String idStudent;

    public Student(String nume, int varsta, String idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        return "Studentul " + super.nume +
                " are ID-ul " + idStudent +
                " si umila varsta de " + super.varsta + " de ani.";
    }
}
