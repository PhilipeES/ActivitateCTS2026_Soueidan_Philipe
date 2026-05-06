package ro.ase.cts.seminar11.chainOfResponsability.clase;

public abstract class CalatorieHandler {
    protected CalatorieHandler succesor;

    public CalatorieHandler() {
        this.succesor = null;
    }

    public void setSuccesor(CalatorieHandler succesor) {
        this.succesor = succesor;
    }

    public abstract String recomandariCalatorie(double distanta);
}
