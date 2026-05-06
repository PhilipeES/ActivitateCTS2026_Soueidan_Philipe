package ro.ase.cts.seminar11.chainOfResponsability.clase;

public class CalatorieMetrou extends CalatorieHandler{


    public CalatorieMetrou() {
        super();
    }

    @Override
    public String recomandariCalatorie(double distanta) {
        return "Metrou";
    }
}
