package cts.chainOfResponsabilty.restaurant.v1.clase;

public class Email extends Notificare {

    public Email() {
        super();
    }

    @Override
    public String trimiteNotificare(Client client) {
        if(client.getEmail() != null){
            return "Clientul " + client.getNume() + " primit notificare prin eMail.";
        }
        return super.succesor.trimiteNotificare(client);
    }
}
