package cts.philipe.simpleFactory.spital.clase;

public class Asistent extends PersonalSpital{
    private String departament;

    public Asistent(String nume, int varsta, String departament) {
        super(nume, varsta);
        this.departament = departament;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent: ");
        sb.append("departament='").append(departament).append('\'');
        sb.append(super.toString());
        return sb.toString();
    }
}
