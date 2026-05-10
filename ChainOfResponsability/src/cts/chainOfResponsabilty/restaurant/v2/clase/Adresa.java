package cts.chainOfResponsabilty.restaurant.v2.clase;

public class Adresa extends Notificare {
    public Adresa() {
        super();
    }

    @Override
    public String trimiteNotificare(String nume, String info) {
        if (info.contains(",")) {
            return "Clientul " + nume + " a primit notificare prin posta.";
        }
        return super.succesor.trimiteNotificare(nume, info);
    }


}
