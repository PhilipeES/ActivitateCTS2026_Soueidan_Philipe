package cts.proxy.stb.clase;

public class Autobuz {
    private int numar;
    private int calatori;

    public Autobuz(int numar, int calatori) {
        this.numar = numar;
        this.calatori = calatori;
    }

    public int getNumar() {
        return numar;
    }

    public boolean areCalatori() {
        return calatori != 0;

    }
}
