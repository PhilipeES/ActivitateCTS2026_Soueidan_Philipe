package cts.chainOfResponsabilty.restaurant.v2.clase;

public class SMS extends Notificare {

    public SMS() {
        super();
    }

    @Override
    public String trimiteNotificare(String nume, String info) {
        if (info.contains("+")) {
            return "Clientul " + nume + " a primit notificare prin SMS.";
        }
        return super.succesor.trimiteNotificare(nume, info);
    }


}
