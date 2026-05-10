package cts.chainOfResponsabilty.restaurant.v1.clase;

public class SMS extends Notificare {

    public SMS() {
        super();
    }



    @Override
    public String trimiteNotificare(Client client) {
        if (client.getNumarDeTelefon() != null) {
            return "Clientul " + client.getNume() + " primit notificare prin SMS.";
        }
        return super.succesor.trimiteNotificare(client);
    }
}
