package cts.chainOfResponsabilty.restaurant.v1.clase;

public class Manager extends Notificare {

    public Manager() {
        super();
    }

    @Override
    public String trimiteNotificare(Client client) {
        return "Nu avem in baza noastra de date nicio modalitate de comunicare.\n";
    }


}
