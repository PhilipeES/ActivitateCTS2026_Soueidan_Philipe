package cts.chainOfResponsabilty.restaurant.v2.clase;

public class Manager extends Notificare{

    public Manager() {
        super();
    }

    @Override
    public String trimiteNotificare(String nume, String info) {
        return "Clientul " + nume + " nu are nicio modalitate de contact adaugata in DB.";
    }
}
