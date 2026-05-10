package cts.facade.restaurant.clase;

public class Masa {
    private int nrMasa;
    private boolean liber;
    private boolean curat;
    private boolean servetel;

    public Masa(int nrMasa, boolean liber, boolean curat, boolean servetel) {
        this.nrMasa = nrMasa;
        this.liber = liber;
        this.curat = curat;
        this.servetel = servetel;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean isLiber() {
        return liber;
    }

    public boolean isCurat() {
        return curat;
    }

    public boolean isServetel() {
        return servetel;
    }
}
