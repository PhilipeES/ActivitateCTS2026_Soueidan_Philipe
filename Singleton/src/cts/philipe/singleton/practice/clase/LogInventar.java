package cts.philipe.singleton.practice.clase;

public class LogInventar {
    private String tipVehicul;
    private int nrInventar;

    private static LogInventar instanta = null;

    private LogInventar(String tipVehicul, int nrInventar) {
        this.tipVehicul = tipVehicul;
        this.nrInventar = nrInventar;
    }

    public String getTipVehicul() {
        return tipVehicul;
    }

    public void setTipVehicul(String tipVehicul) {
        this.tipVehicul = tipVehicul;
    }

    public int getNrInventar() {
        return nrInventar;
    }

    public void setNrInventar(int nrInventar) {
        this.nrInventar = nrInventar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LogInventar: ");
        sb.append("Tip vehicul: ").append(tipVehicul);
        sb.append(" Nr.Inventar: ").append(nrInventar);
        sb.append('\n');
        return sb.toString();
    }

    public static synchronized LogInventar getInstanta(String tipVehicul, int nrInventar ) {
        if (instanta == null) {
            instanta = new LogInventar(tipVehicul, nrInventar);
        }
        return instanta;
    }

}






