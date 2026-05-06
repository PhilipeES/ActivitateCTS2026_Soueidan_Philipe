package ro.ase.cts.seminar11.strategy.clase;

public class Student {
    private String nume;
    private ModSustinere modSustinere;

    public Student(String nume, ModSustinere modSustinere) {
        this.nume = nume;
        this.modSustinere = modSustinere;
    }

    public Student(String nume){
        this.nume = nume;
    }

    public Student() {

        this.modSustinere = new Grila();
        this.nume = "Gigel";
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        modSustinere.sustinereExamen();
    }
}
