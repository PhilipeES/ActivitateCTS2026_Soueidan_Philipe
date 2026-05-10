package cts.chainOfResponsabilty.restaurant.v2.clase;

public abstract class Notificare {
    public Notificare succesor;

    public Notificare() {
        this.succesor = null;
    }

    public void setSuccesor(Notificare succesor) {
        this.succesor = succesor;
    }

    public abstract String trimiteNotificare(String nume, String info);
}
