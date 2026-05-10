package cts.philipe.builder.restaurant.clase;

public class Rezervare {
    private String eveniment;
    private boolean privelisteGeam = false;
    private boolean scaunErgonomic = false;
    private boolean decorareMasa = false;
    private String genMuzicalPreferat = "";
    private boolean muzicaPersonaliata = false;

    public Rezervare() {
    }

    public Rezervare(String eveniment, boolean privelisteGeam, boolean scaunErgonomic, boolean decorareMasa, String genMuzicalPreferat, boolean muzicaPersonaliata) {
        this.eveniment = eveniment;
        this.privelisteGeam = privelisteGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.decorareMasa = decorareMasa;
        this.genMuzicalPreferat = genMuzicalPreferat;
        this.muzicaPersonaliata = muzicaPersonaliata;
    }

    public String getEveniment() {
        return eveniment;
    }

    public void setEveniment(String eveniment) {
        this.eveniment = eveniment;
    }

    public boolean isPrivelisteGeam() {
        return privelisteGeam;
    }

    public void setPrivelisteGeam(boolean privelisteGeam) {
        this.privelisteGeam = privelisteGeam;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public boolean isDecorareMasa() {
        return decorareMasa;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public String getGenMuzicalPreferat() {
        return genMuzicalPreferat;
    }

    public void setGenMuzicalPreferat(String genMuzicalPreferat) {
        this.genMuzicalPreferat = genMuzicalPreferat;
    }

    public boolean isMuzicaPersonaliata() {
        return muzicaPersonaliata;
    }

    public void setMuzicaPersonaliata(boolean muzicaPersonaliata) {
        this.muzicaPersonaliata = muzicaPersonaliata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("eveniment='").append(eveniment).append('\'');
        sb.append(", privelisteGeam=").append(privelisteGeam);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", genMuzicalPreferat='").append(genMuzicalPreferat).append('\'');
        sb.append(", muzicaPersonaliata=").append(muzicaPersonaliata);
        sb.append('}');
        return sb.toString();
    }

}
