package cts.chainOfResponsabilty.restaurant.v2.clase;

public class Email extends Notificare{

    public Email() {
        super();
    }

    @Override
    public String trimiteNotificare(String nume, String info) {
        if(info.contains("@")){
            return "Clientul " + nume + " a primit notificare prin eMail.";
        }
        return super.succesor.trimiteNotificare(nume, info);
    }
}
